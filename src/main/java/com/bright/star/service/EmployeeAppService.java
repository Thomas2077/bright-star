package com.bright.star.service;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.controller.assembler.KeirekiMapper;
import com.bright.star.controller.assembler.MainMapper;
import com.bright.star.controller.assembler.RirekiMapper;
import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.controller.command.EmployeeSaveCommand;
import com.bright.star.controller.command.EmployeeUpdateCommand;
import com.bright.star.infrastructure.common.BeanTools;
import com.bright.star.infrastructure.exception.BusinessException;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.infrastructure.persistence.entity.SyainRireki;
import com.bright.star.service.app.SyainKeirekiService;
import com.bright.star.service.app.SyainMainService;
import com.bright.star.service.app.SyainRirekiService;
import com.bright.star.service.app.TgSettingService;
import com.bright.star.service.dto.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description TODO
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeAppService {

    private final SyainMainService mainService;
    private final SyainRirekiService rirekiService;
    private final SyainKeirekiService keirekiService;
    private final TgSettingService settingService;

    public List<EmployeePreviewInfoDto> previewEmployees(@Valid EmployeeQueryCommand command) {

        List<SyainMainDTO> syainMainDTOList = mainService.queryPreview(command);

        return syainMainDTOList.stream().map(syainMainDTO -> {
            EmployeePreviewInfoDto previewInfoDto = EmployeePreviewInfoDto.build(syainMainDTO);

            // setting company name
            TgSettingDTO companySetting = settingService.findByTypes(1, syainMainDTO.getSyozokuKaisya(), 1);
            previewInfoDto.setCompanyName(companySetting.getValue1());

            // setting job category
            TgSettingDTO jobSetting = settingService.findByTypes(3, 4, syainMainDTO.getSyokugyoKind());
            previewInfoDto.setJobCategory(jobSetting.getValue1());
            return previewInfoDto;
        }).collect(Collectors.toList());
    }

    @Transactional
    public void update(EmployeeUpdateCommand updateCommand) {
        SyainMain syainMain = mainService.getById(updateCommand.syainMainDTO().getSyainId());
        if (syainMain == null) {
            throw new BusinessException("worker info not exist");
        }
        mainService.save(BeanTools.copyProperties(updateCommand.syainMainDTO(), new SyainMain()));

        // update　履歴
        Optional.of(updateCommand.syainRirekiDTOList()).ifPresent(rirekiDtoList -> {
            List<SyainRireki> syainRirekiList = rirekiDtoList.stream().map(new RirekiMapper()).collect(Collectors.toList());
            rirekiService.saveBatch(syainRirekiList);
        });

        // update 経歴
        Optional.of(updateCommand.syainKeirekiDTOList()).ifPresent(keirekiDTOList -> {
            List<SyainKeireki> keirekiList = keirekiDTOList.stream().map(new KeirekiMapper()).collect(Collectors.toList());
            keirekiService.saveBatch(keirekiList);
        });
    }

    public Integer save(EmployeeSaveCommand saveCommand) {
        SyainMain syainMain = mainService.getById(saveCommand.syainMainDTO().getSyainId());
        if (syainMain == null) {
            throw new BusinessException("worker info not exist");
        }
        mainService.save(BeanUtil.copyProperties(saveCommand.syainMainDTO(), SyainMain.class));

        // save　履歴
        Optional.of(saveCommand.syainRirekiDTOList()).ifPresent(rirekiDtoList -> {
            List<SyainRireki> syainRirekiList = rirekiDtoList.stream().map(new RirekiMapper()).collect(Collectors.toList());
            rirekiService.saveOrUpdateBatch(syainRirekiList);
        });

        // save 経歴
        Optional.of(saveCommand.syainKeirekiDTOList()).ifPresent(keirekiDTOList -> {
            List<SyainKeireki> keirekiList = keirekiDTOList.stream().map(new KeirekiMapper()).collect(Collectors.toList());
            keirekiService.saveOrUpdateBatch(keirekiList);
        });
        mainService.saveOrUpdate(new MainMapper().apply(saveCommand.syainMainDTO()));
        return saveCommand.syainMainDTO().getSyainId();
    }

    public EmployeeDto query(Integer id) {

        SyainMain syainMain = mainService.getById(id);
        List<SyainRireki> syainRirekiList = rirekiService.queryById(id);
        List<SyainKeireki> syainKeirekiList = keirekiService.queryById(id);

        return new EmployeeDto(
                BeanUtil.copyProperties(syainMain, SyainMainDTO.class),
                BeanUtil.copyToList(syainRirekiList, SyainRirekiDTO.class),
                BeanUtil.copyToList(syainKeirekiList, SyainKeirekiDTO.class)
        );
    }
}
