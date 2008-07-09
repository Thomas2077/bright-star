package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@TableName("user_auth")
@Schema(description = "UserAuth对象")
public
class UserAuth extends Model<UserAuth> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "USER_ID", type = IdType.ASSIGN_ID)
    private Integer userId;

    @TableField("USER_CODE")
    private String userCode;

    @TableField("USER_NAME")
    private String userName;

    /**
     * 暗号化すべき、MD5関数で実施可能。
     */
    @Schema(description = "暗号化すべき、MD5関数で実施可能。")
    @TableField("PASSWORD")
    private String password;

    /**
     * S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当
     */
    @Schema(description = "S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当")
    @TableField("USER_ROLE")
    private String userRole;

    /**
     * 有効・無効
     */
    @Schema(description = "有効・無効")
    @TableField("IS_YOUKOU")
    private Integer isYoukou;


    @Override
    public Serializable pkVal() {
        return this.userId;
    }
}