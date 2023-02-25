package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "TgSettingDTO对象")
public class TgSettingDTO{

        Integer category1;

        Integer category2;

        Integer category3;

        String value1;

        String value2;

        String value3;

        String value4;

        String value5;
                }