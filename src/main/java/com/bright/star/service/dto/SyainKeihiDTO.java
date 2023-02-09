package com.bright.star.service.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * <p>
 * 社員_経費
 * </p>
 *
 * @since 2023-02-08
 */


@Schema(description = "SyainKeihiDTO对象")

public record SyainKeihiDTO(

        Integer syainId,

        /**
         * 適用年月
         */
        String tekiyouNengetsu,

        /**
         * 連番
         */
        Integer renban,

        /**
         * 費目
         */
        Integer himoku,

        /**
         * 金額
         */
        Integer kingaku,

        /**
         * 客先請求区分
         */
        Integer kyakusakiSeikyuKubun,

        /**
         * 備考
         */
        String bikou,

        /**
         * 登録日
         */
        LocalDateTime tourokubi,

        /**
         * 更新日
         */
        LocalDateTime kousinnbi
) {
}