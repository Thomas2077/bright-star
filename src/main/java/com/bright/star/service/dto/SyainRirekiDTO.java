package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * <p>
 * 社員_職歴
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "SyainRirekiDTO对象")
public class SyainRirekiDTO{

        Integer syainId;

        /**
         * 開始日
         */
        LocalDate kaisibi;

        /**
         * 終了日
         */
        LocalDate syuryobi;

        /**
         * 登録日
         */
        LocalDateTime tourokubi;

        /**
         * 更新日
         */
        LocalDateTime kousinnbi;

        /**
         * プロジェクト名
         */
        String pjName;

        /**
         * 対日フラグ
         */
        Integer tainitiFlag;

        /**
         * 場所
         */
        Integer basyo;

        /**
         * 規模
         */
        Integer kibo;

        /**
         * 業種
         */
        Integer gyosyu;

        /**
         * 開発環境
         */
        Integer kaihatukankyo;

        /**
         * 運用環境
         */
        Integer unyoukankyo;

        /**
         * 言語
         */
        String gengo;

        String db;

        /**
         * ツール
         */
        String tool;

        /**
         * 担当
         */
        Integer tantou;

        /**
         * 作業範囲
         */
        Integer sagyohani;

        /**
         * 概要
         */
        @Schema(description = "概要")
        String gaiyou;
}