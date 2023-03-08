package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;


/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "UserAccessLogDTO对象")
public class UserAccessLogDTO{

        Integer id;

        /**
         * 画面ID
         */
        Integer userId;

        /**
         * アクセス開始時間
         */
        String gamenId;

        LocalDateTime startTime;
}