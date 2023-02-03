package com.bright.star.service.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * customer dto
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "TorihikisakiTantouDTO对象", description = "")

public class TorihikisakiTantouDTO implements Serializable {


    /**
     * 担当者ID
     */
    @ApiModelProperty(value = "担当者ID")
    private Integer tantouId;

    /**
     * 担当者ID
     */
    @ApiModelProperty(value = "担当者ID")
    private Integer torihikiId;

    private String firstName;

    private String lastName;

    /**
     * 所属: 管理本部など
     */
    @ApiModelProperty(value = "所属: 管理本部など")
    private String syozoku;

    /**
     * 役職: 部長など
     */
    @ApiModelProperty(value = "役職: 部長など")
    private String yakusyoku;

    private String mail;

    private String tel;

    /**
     * 事務関連（請求・外注など）MAIL: 1:TO 2:CC
     */
    @ApiModelProperty(value = "事務関連（請求・外注など）MAIL: 1:TO 2:CC")
    private Integer jimuMail;

    private String bikou;


}