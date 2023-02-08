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
@TableName("user_access_log")
@Schema(description = "UserAccessLog对象")
public
class UserAccessLog extends Model<UserAccessLog> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 画面ID
     */
    @Schema(description = "画面ID")
    @TableField("USER_ID")
    private Integer userId;

    /**
     * アクセス開始時間
     */
    @Schema(description = "アクセス開始時間")
    @TableField("GAMEN_ID")
    private String gamenId;

    @TableField("START_TIME")
    private LocalDateTime startTime;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}