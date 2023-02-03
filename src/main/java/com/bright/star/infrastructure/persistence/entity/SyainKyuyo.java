package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 社員_給与
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("syain_kyuyo")
@ApiModel(value = "SyainKyuyo对象", description = "社員_給与")
public class SyainKyuyo extends Model<SyainKyuyo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.ASSIGN_ID)
    private Integer syainId;

    /**
     * 開始年月
     */
    @ApiModelProperty(value = "開始年月")
    @TableField("KAISHI_NENGETSU")
    private String kaishiNengetsu;

    /**
     * 終了年月: 最後の記録以外、NULL不可
     */
    @ApiModelProperty(value = "終了年月: 最後の記録以外、NULL不可")
    @TableField("SYURYO_NENGETSU")
    private String syuryoNengetsu;

    /**
     * 基本給
     */
    @ApiModelProperty(value = "基本給")
    @TableField("KIHONKYU")
    private Integer kihonkyu;

    /**
     * 職能給
     */
    @ApiModelProperty(value = "職能給")
    @TableField("SYOKUNOUKYU")
    private Integer syokunoukyu;

    /**
     * 雇用保険番号
     */
    @ApiModelProperty(value = "雇用保険番号")
    @TableField("KOYOU_HOKEN_NO")
    private String koyouHokenNo;

    /**
     * 年金番号
     */
    @ApiModelProperty(value = "年金番号")
    @TableField("NANKIN_NO")
    private String nankinNo;

    /**
     * 年金基準額
     */
    @ApiModelProperty(value = "年金基準額")
    @TableField("NANKIN_KIJYUN_GAKU")
    private Integer nankinKijyunGaku;

    /**
     * 健康保険番号
     */
    @ApiModelProperty(value = "健康保険番号")
    @TableField("KENKOU_HOKEN_NO")
    private String kenkouHokenNo;

    /**
     * 備考
     */
    @ApiModelProperty(value = "備考")
    @TableField("BIKOU")
    private String bikou;

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


    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}