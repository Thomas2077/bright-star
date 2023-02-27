package com.bright.star.controller;

import com.bright.star.controller.command.SettingQueryCommand;
import com.bright.star.service.app.TgSettingService;
import com.bright.star.service.dto.TgSettingDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    @GetMapping("")
    public ResponseEntity<List<TgSettingDTO>> query(@Valid SettingQueryCommand param){
        return ResponseEntity.ok(tgSettingService.listByTypes(param.category1(), param.category2(), param.category3()));
    }


}
