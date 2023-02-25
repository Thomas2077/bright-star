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
 * 社員_経費
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("syain_rireki")
@Schema(description = "SyainRireki对象")
public class SyainRireki extends Model<SyainRireki> {

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

    /**
     * プロジェクト名
     */
    @Schema(description = "プロジェクト名")
    @TableField("PJ_NAME")
    private String pjName;

    /**
     * 対日フラグ
     */
    @Schema(description = "対日フラグ")
    @TableField("TAINITI_FLAG")
    private Integer tainitiFlag;

    /**
     * 場所
     */
    @Schema(description = "場所")
    @TableField("BASYO")
    private Integer basyo;

    /**
     * 規模
     */
    @Schema(description = "規模")
    @TableField("KIBO")
    private Integer kibo;

    /**
     * 業種
     */
    @Schema(description = "業種")
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
     * ツール
     */
    @Schema(description = "ツール")
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
     * 概要
     */
    @Schema(description = "概要")
    @TableField("GAIYOU")
    private String gaiyou;


    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}