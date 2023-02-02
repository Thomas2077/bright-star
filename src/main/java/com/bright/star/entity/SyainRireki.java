package com.bright.star.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@ApiModel(value = "SyainRireki对象", description = "社員_経費")
public class SyainRireki extends Model<SyainRireki> {

private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.ASSIGN_ID)
    private Integer syainId;

    /**
     * 開始日
     */
    @ApiModelProperty(value = "開始日")
     @TableField("KAISIBI")
    private LocalDate kaisibi;

    /**
     * 終了日
     */
    @ApiModelProperty(value = "終了日")
     @TableField("SYURYOBI")
    private LocalDate syuryobi;

    /**
     * 登録日
     */
    @ApiModelProperty(value = "登録日")
     @TableField("TOUROKUBI")
    private LocalDateTime tourokubi;

    /**
     * 更新日
     */
    @ApiModelProperty(value = "更新日")
     @TableField("KOUSINNBI")
    private LocalDateTime kousinnbi;

    /**
     * プロジェクト名
     */
    @ApiModelProperty(value = "プロジェクト名")
     @TableField("PJ_NAME")
    private String pjName;

    /**
     * 対日フラグ
     */
    @ApiModelProperty(value = "対日フラグ")
     @TableField("TAINITI_FLAG")
    private Integer tainitiFlag;

    /**
     * 場所
     */
    @ApiModelProperty(value = "場所")
     @TableField("BASYO")
    private Integer basyo;

    /**
     * 規模
     */
    @ApiModelProperty(value = "規模")
     @TableField("KIBO")
    private Integer kibo;

    /**
     * 業種
     */
    @ApiModelProperty(value = "業種")
     @TableField("GYOSYU")
    private Integer gyosyu;

    /**
     * 開発環境
     */
    @ApiModelProperty(value = "開発環境")
     @TableField("KAIHATUKANKYO")
    private Integer kaihatukankyo;

    /**
     * 運用環境
     */
    @ApiModelProperty(value = "運用環境")
     @TableField("UNYOUKANKYO")
    private Integer unyoukankyo;

    /**
     * 言語
     */
    @ApiModelProperty(value = "言語")
     @TableField("GENGO")
    private String gengo;

     @TableField("DB")
    private String db;

    /**
     * ツール
     */
    @ApiModelProperty(value = "ツール")
     @TableField("TOOL")
    private String tool;

    /**
     * 担当
     */
    @ApiModelProperty(value = "担当")
     @TableField("TANTOU")
    private Integer tantou;

    /**
     * 作業範囲
     */
    @ApiModelProperty(value = "作業範囲")
     @TableField("SAGYOHANI")
    private Integer sagyohani;

    /**
     * 概要
     */
    @ApiModelProperty(value = "概要")
     @TableField("GAIYOU")
    private String gaiyou;



    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}