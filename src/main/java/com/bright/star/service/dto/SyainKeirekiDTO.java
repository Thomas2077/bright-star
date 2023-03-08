package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * <p>
 * 社員マスタ_経歴
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "SyainKeirekiDTO对象")
public class SyainKeirekiDTO{
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
         * プロジェクト名
         */
        String pjName;

        /**
         * 対日かどうか
         */
        Integer tainitiFlag;

        /**
         * 開発場所
         */
        Integer basyo;

        /**
         * 開発規模
         */
        Integer kibo;

        /**
         * 開発業種
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
         * FW・IDE・ツール
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
         * 開発概要
         */
        String gaiyou;

        /**
         * 登録日
         */
        LocalDateTime tourokubi;

        /**
         * 更新日
         */
        LocalDateTime kousinnbi;
}