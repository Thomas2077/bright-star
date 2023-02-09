package com.bright.star.service;

import cn.hutool.core.bean.BeanUtil;
import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.controller.command.EmployeeSaveCommand;
import com.bright.star.controller.command.EmployeeUpdateCommand;
import com.bright.star.infrastructure.persistence.entity.SyainKeireki;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.infrastructure.persistence.entity.SyainRireki;
import com.bright.star.service.dto.*;
import com.bright.star.service.app.SyainKeirekiService;
import com.bright.star.service.app.SyainMainService;
import com.bright.star.service.app.SyainRirekiService;
import com.bright.star.service.app.TgSettingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
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
public class EmployeeApplicationService {

    private final SyainMainService mainService;
    private final SyainRirekiService rirekiService;
    private final SyainKeirekiService keirekiService;

    private final TgSettingService settingService;

    public List<EmployeePreviewInfoDto> previewEmployees(EmployeeQueryCommand command){

        List<SyainMainDTO> syainMainDTOList = mainService.queryPreview(command);

        return syainMainDTOList.stream().map(syainMainDTO -> {
            EmployeePreviewInfoDto previewInfoDto = EmployeePreviewInfoDto.build(syainMainDTO);

            // setting company name
            TgSettingDTO companySetting = settingService.findByTypes(1, syainMainDTO.syozokuKaisya(), 1);
            previewInfoDto.setCompanyName(companySetting.value1());

            // setting job category
            TgSettingDTO jobSetting = settingService.findByTypes(3, 4, syainMainDTO.syokugyoKind());
            previewInfoDto.setJobCategory(jobSetting.value1());
            return previewInfoDto;
        }).collect(Collectors.toList());
    }

    public void update(EmployeeUpdateCommand updateCommand){

    }

    public Integer save(EmployeeSaveCommand saveCommand){
        return null;
    }

    public EmployeeDto query(Integer id){

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
