package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;


/**
 * <p>
 * 社員_給与
 * </p>
 *
 * @since 2023-02-08
 */
@Schema(description = "SyainKyuyoDTO对象")

public class SyainKyuyoDTO{

        Integer syainId;

        /**
         * 開始年月
         */
        String kaishiNengetsu;

        /**
         * 終了年月: 最後の記録以外、NULL不可
         */
        String syuryoNengetsu;

        /**
         * 基本給
         */
        Integer kihonkyu;

        /**
         * 職能給
         */
        Integer syokunoukyu;

        /**
         * 雇用保険番号
         */
        String koyouHokenNo;

        /**
         * 年金番号
         */
        String nankinNo;

        /**
         * 年金基準額
         */
        Integer nankinKijyunGaku;

        /**
         * 健康保険番号
         */
        String kenkouHokenNo;

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