package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 社員マスタ_経歴
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("syain_keireki")
@Schema(description = "SyainKeireki对象")
public
class SyainKeireki extends Model<SyainKeireki> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.ASSIGN_ID)
    private Integer syainId;

    /**
     * 開始日
     */
    @Schema(description = "開始日")
    @TableField("KAISIBI")
    private LocalDate kaisibi;

    /**
     * 終了日
     */
    @Schema(description = "終了日")
    @TableField("SYURYOBI")
    private LocalDate syuryobi;

    /**
     * プロジェクト名
     */
    @Schema(description = "プロジェクト名")
    @TableField("PJ_NAME")
    private String pjName;

    /**
     * 対日かどうか
     */
    @Schema(description = "対日かどうか")
    @TableField("TAINITI_FLAG")
    private Integer tainitiFlag;

    /**
     * 開発場所
     */
    @Schema(description = "開発場所")
    @TableField("BASYO")
    private Integer basyo;

    /**
     * 開発規模
     */
    @Schema(description = "開発規模")
    @TableField("KIBO")
    private Integer kibo;

    /**
     * 開発業種
     */
    @Schema(description = "開発業種")
    @TableField("GYOSYU")
    private Integer gyosyu;

    /**
     * 開発環境
     */
    @Schema(description = "開発環境")
    @TableField("KAIHATUKANKYO")
    private Integer kaihatukankyo;

    /**
     * 運用環境
     */
    @Schema(description = "運用環境")
    @TableField("UNYOUKANKYO")
    private Integer unyoukankyo;

    /**
     * 言語
     */
    @Schema(description = "言語")
    @TableField("GENGO")
    private String gengo;

    @TableField("DB")
    private String db;

    /**
     * FW・IDE・ツール
     */
    @Schema(description = "FW・IDE・ツール")
    @TableField("TOOL")
    private String tool;

    /**
     * 担当
     */
    @Schema(description = "担当")
    @TableField("TANTOU")
    private Integer tantou;

    /**
     * 作業範囲
     */
    @Schema(description = "作業範囲")
    @TableField("SAGYOHANI")
    private Integer sagyohani;

    /**
     * 開発概要
     */
    @Schema(description = "開発概要")
    @TableField("GAIYOU")
    private String gaiyou;

    /**
     * 登録日
     */
    @Schema(description = "登録日")
    @TableField("TOUROKUBI")
    private LocalDateTime tourokubi;

    /**
     * 更新日
     */
    @Schema(description = "更新日")
    @TableField("KOUSINNBI")
    private LocalDateTime kousinnbi;


    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}