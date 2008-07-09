package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
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
@TableName("syain_keihi")
@Schema(description = "SyainKeihi对象")
public
class SyainKeihi extends Model<SyainKeihi> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.ASSIGN_ID)
    private Integer syainId;

    /**
     * 適用年月
     */
    @Schema(description = "適用年月")
    @TableField("TEKIYOU_NENGETSU")
    private String tekiyouNengetsu;

    /**
     * 連番
     */
    @Schema(description = "連番")
    @TableField("RENBAN")
    private Integer renban;

    /**
     * 費目
     */
    @Schema(description = "費目")
    @TableField("HIMOKU")
    private Integer himoku;

    /**
     * 金額
     */
    @Schema(description = "金額")
    @TableField("KINGAKU")
    private Integer kingaku;

    /**
     * 客先請求区分
     */
    @Schema(description = "客先請求区分")
    @TableField("KYAKUSAKI_SEIKYU_KUBUN")
    private Integer kyakusakiSeikyuKubun;

    /**
     * 備考
     */
    @Schema(description = "備考")
    @TableField("BIKOU")
    private String bikou;

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