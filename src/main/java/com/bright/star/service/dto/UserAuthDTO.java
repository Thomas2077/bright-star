package com.bright.star.service.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;


/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */


@Schema(description = "UserAuthDTO对象")

public
record UserAuthDTO(

        Integer userId,

        String userCode,

        String userName,

        /**
         * 暗号化すべき、MD5関数で実施可能。
         */
        String password,

        /**
         * S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当
         */
        String userRole,

        /**
         * 有効・無効
         */
        Integer isYoukou
) {
}