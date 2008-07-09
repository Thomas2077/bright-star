package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;


/**
 * <p>
 * 社員_交通費
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "SyainKoutsuhiDTO对象")
public class SyainKoutsuhiDTO{

        Integer syainId;

        /**
         * 適用年月
         */
        String tekiyouNengetsu;

        /**
         * 連番
         */
        Integer renban;

        /**
         * 日付
         */
        Integer himoku;

        /**
         * 出発駅
         */
        String syuppatsuEki;

        /**
         * 到着駅
         */
        String touchakuEki;

        /**
         * 金額
         */
        Integer kingaku;

        /**
         * 客先請求区分
         */
        Integer kyakusakiSeikyuKubun;

        /**
         * 備考
         */
        String bikou;

        /**
         * 登録日
         */
        LocalDateTime tourokubi;

        /**
         * 更新日
         */
        LocalDateTime kousinnbi;
}