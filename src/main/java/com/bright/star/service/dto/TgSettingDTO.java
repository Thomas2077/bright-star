package com.bright.star.service.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */


@Schema(description = "TgSettingDTO对象")

public record TgSettingDTO(

        Integer category1,

        Integer category2,

        Integer category3,

        String value1,

        String value2,

        String value3,

        String value4,

        String value5
) {
}