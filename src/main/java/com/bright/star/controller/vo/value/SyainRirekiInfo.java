package com.bright.star.controller.vo.value;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/6
 * @description
 **/
@Data
@Schema(description = "社員_職歴")
public
class SyainRirekiInfo {


    private Integer syainId;

    /**
     * 開始日
     */
    @Schema(description = "開始日")
    private LocalDate kaisibi;

    /**
     * 終了日
     */
    @Schema(description = "終了日")
    private LocalDate syuryobi;

    /**
     * 登録日
     */
    @Schema(description = "登録日")
    private LocalDateTime tourokubi;

    /**
     * 更新日
     */
    @Schema(description = "更新日")
    private LocalDateTime kousinnbi;

    /**
     * プロジェクト名
     */
    @Schema(description = "プロジェクト名")
    private String pjName;

    /**
     * 対日フラグ
     */
    @Schema(description = "対日フラグ")
    private Integer tainitiFlag;

    /**
     * 場所
     */
    @Schema(description = "場所")
    private Integer basyo;

    /**
     * 規模
     */
    @Schema(description = "規模")
    private Integer kibo;

    /**
     * 業種
     */
    @Schema(description = "業種")
    private Integer gyosyu;

    /**
     * 開発環境
     */
    @Schema(description = "開発環境")
    private Integer kaihatukankyo;

    /**
     * 運用環境
     */
    @Schema(description = "運用環境")
    private Integer unyoukankyo;

    /**
     * 言語
     */
    @Schema(description = "言語")
    private String gengo;

    private String db;

    /**
     * ツール
     */
    @Schema(description = "ツール")
    private String tool;

    /**
     * 担当
     */
    @Schema(description = "担当")
    private Integer tantou;

    /**
     * 作業範囲
     */
    @Schema(description = "作業範囲")
    private Integer sagyohani;

    /**
     * 概要
     */
    @Schema(description = "概要")
    private String gaiyou;


}
