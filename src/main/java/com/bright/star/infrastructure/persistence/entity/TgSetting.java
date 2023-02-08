package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("tg_setting")
@Schema(description = "TgSetting对象")
public
class TgSetting extends Model<TgSetting> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CATEGORY1", type = IdType.ASSIGN_ID)
    private Integer category1;

    @TableField("CATEGORY2")
    private Integer category2;

    @TableField("CATEGORY3")
    private Integer category3;

    @TableField("VALUE1")
    private String value1;

    @TableField("VALUE2")
    private String value2;

    @TableField("VALUE3")
    private String value3;

    @TableField("VALUE4")
    private String value4;

    @TableField("VALUE5")
    private String value5;


    @Override
    public Serializable pkVal() {
        return this.category1;
    }

}