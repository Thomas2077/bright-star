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
 * 社員_交通費
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("syain_koutsuhi")
@ApiModel(value = "SyainKoutsuhi对象", description = "社員_交通費")
public class SyainKoutsuhi extends Model<SyainKoutsuhi> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.ASSIGN_ID)
    private Integer syainId;

    /**
     * 適用年月
     */
    @ApiModelProperty(value = "適用年月")
    @TableField("TEKIYOU_NENGETSU")
    private String tekiyouNengetsu;

    /**
     * 連番
     */
    @ApiModelProperty(value = "連番")
    @TableField("RENBAN")
    private Integer renban;

    /**
     * 日付
     */
    @ApiModelProperty(value = "日付")
    @TableField("HIMOKU")
    private Integer himoku;

    /**
     * 出発駅
     */
    @ApiModelProperty(value = "出発駅")
    @TableField("SYUPPATSU_EKI")
    private String syuppatsuEki;

    /**
     * 到着駅
     */
    @ApiModelProperty(value = "到着駅")
    @TableField("TOUCHAKU_EKI")
    private String touchakuEki;

    /**
     * 金額
     */
    @ApiModelProperty(value = "金額")
    @TableField("KINGAKU")
    private Integer kingaku;

    /**
     * 客先請求区分
     */
    @ApiModelProperty(value = "客先請求区分")
    @TableField("KYAKUSAKI_SEIKYU_KUBUN")
    private Integer kyakusakiSeikyuKubun;

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