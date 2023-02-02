package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@TableName("user_auth")
@ApiModel(value = "UserAuth对象", description = "")
public class UserAuth extends Model<UserAuth> {

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
    @ApiModelProperty(value = "暗号化すべき、MD5関数で実施可能。")
     @TableField("PASSWORD")
    private String password;

    /**
     * S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当
     */
    @ApiModelProperty(value = "S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当")
     @TableField("USER_ROLE")
    private String userRole;

    /**
     * 有効・無効
     */
    @ApiModelProperty(value = "有効・無効")
     @TableField("IS_YOUKOU")
    private Integer isYoukou;



    @Override
    public Serializable pkVal() {
        return this.userId;
    }

}