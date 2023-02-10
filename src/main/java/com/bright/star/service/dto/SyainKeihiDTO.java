package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;


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