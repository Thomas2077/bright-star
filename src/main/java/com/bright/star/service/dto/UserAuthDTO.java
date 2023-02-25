package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "UserAuthDTO对象")
public class UserAuthDTO{

        Integer userId;

        String userCode;

        String userName;

        /**
         * 暗号化すべき、MD5関数で実施可能。
         */
        String password;

        /**
         * S:システム管理者 A:統合管理者　B　営業担当　C経理担当　D：人事担当
         */
        String userRole;

        /**
         * 有効・無効
         */
        Integer isYoukou;
}