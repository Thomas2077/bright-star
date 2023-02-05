package com.bright.star.service;

import com.bright.star.controller.command.EmployeeQueryCommand;
import com.bright.star.infrastructure.persistence.entity.SyainMain;
import com.bright.star.service.dto.EmployeePreviewInfoDto;
import com.bright.star.service.dto.TgSettingDTO;
import com.bright.star.service.tmp.SyainMainService;
import com.bright.star.service.tmp.TgSettingService;
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

    private final SyainMainService service;

    private final TgSettingService settingService;

    public List<EmployeePreviewInfoDto> previewEmployees(EmployeeQueryCommand command){

        List<SyainMain> syainMainList = service.queryPreview(command);

        return syainMainList.stream().map(syainMain -> {
            EmployeePreviewInfoDto previewInfoDto = EmployeePreviewInfoDto.build(syainMain);

            // setting company name
            TgSettingDTO companySetting = settingService.findByTypes(1, syainMain.getSyozokuKaisya(), 1);
            previewInfoDto.setCompanyName(companySetting.getValue1());

            // setting job category
            TgSettingDTO jobSetting = settingService.findByTypes(3, 4, syainMain.getSyokugyoKind());
            previewInfoDto.setJobCategory(jobSetting.getValue1());
            return previewInfoDto;
        }).collect(Collectors.toList());
    }






}
