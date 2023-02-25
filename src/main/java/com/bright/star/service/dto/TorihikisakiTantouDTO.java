package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


/**
 * <p>
 * TorihikisakiTantouDTO对象
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "TorihikisakiTantouDTO对象")
public class TorihikisakiTantouDTO{

        /**
         * 担当者ID
         */
        Integer tantouId;

        /**
         * 担当者ID
         */
        Integer torihikiId;

        String firstName;

        String lastName;

        /**
         * 所属: 管理本部など
         */
        String syozoku;

        /**
         * 役職: 部長など
         */
        String yakusyoku;

        String mail;

        String tel;

        /**
         * 事務関連（請求・外注など）MAIL: 1:TO 2:CC
         */
        Integer jimuMail;

        String bikou;
}