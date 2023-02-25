package com.bright.star.controller;

import com.bright.star.service.app.TgSettingService;
import com.bright.star.service.dto.TgSettingDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/25
 * @description
 **/
@Slf4j
@Tag(name = "システム設定")
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/settings")
public class SettingController {

    private final TgSettingService tgSettingService;


    @GetMapping("/companyName")
    public List<TgSettingDTO> queryCompanyName(){
        List<TgSettingDTO> tgSettingDTOS = tgSettingService.listByTypes(1, null, null);
        return tgSettingDTOS.stream().filter(tgSettingDTO -> tgSettingDTO.getCategory3() == 1).collect(Collectors.toList());
    }
}
