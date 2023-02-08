package com.bright.star.controller.vo.value;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/3
 * @description 業務経歴
 **/
@Data
@Accessors(chain = true)
@Schema(description = "JobExperienceInfo業務経歴(SyainKeirekiDTO)")
public
class SyainKeirekiInfo {

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
     * プロジェクト名
     */
    @Schema(description = "プロジェクト名")
    private String pjName;

    /**
     * 対日かどうか
     */
    @Schema(description = "対日かどうか")
    private Integer tainitiFlag;

    /**
     * 開発場所
     */
    @Schema(description = "開発場所")
    private Integer basyo;

    /**
     * 開発規模
     */
    @Schema(description = "開発規模")
    private Integer kibo;

    /**
     * 開発業種
     */
    @Schema(description = "開発業種")
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
     * FW・IDE・ツール
     */
    @Schema(description = "FW・IDE・ツール")
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
     * 開発概要
     */
    @Schema(description = "開発概要")
    private String gaiyou;

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


}
