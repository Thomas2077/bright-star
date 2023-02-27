package com.bright.star.controller.command;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/25
 * @description
 **/
@Schema(description = "setting 検索 command")
public record SettingQueryParam(

        @NotNull
        Integer category1,
        Integer category2,
        Integer category3
) {
}
