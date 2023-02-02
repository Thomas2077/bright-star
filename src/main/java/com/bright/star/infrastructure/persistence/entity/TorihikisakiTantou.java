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
@TableName("torihikisaki_tantou")
@ApiModel(value = "TorihikisakiTantou对象", description = "")
public class TorihikisakiTantou extends Model<TorihikisakiTantou> {

private static final long serialVersionUID = 1L;

    /**
     * 担当者ID
     */
    @ApiModelProperty(value = "担当者ID")
    @TableId(value = "TANTOU_ID", type = IdType.ASSIGN_ID)
    private Integer tantouId;

    /**
     * 担当者ID
     */
    @ApiModelProperty(value = "担当者ID")
     @TableField("TORIHIKI_ID")
    private Integer torihikiId;

     @TableField("FIRST_NAME")
    private String firstName;

     @TableField("LAST_NAME")
    private String lastName;

    /**
     * 所属: 管理本部など
     */
    @ApiModelProperty(value = "所属: 管理本部など")
     @TableField("SYOZOKU")
    private String syozoku;

    /**
     * 役職: 部長など
     */
    @ApiModelProperty(value = "役職: 部長など")
     @TableField("YAKUSYOKU")
    private String yakusyoku;

     @TableField("MAIL")
    private String mail;

     @TableField("TEL")
    private String tel;

    /**
     * 事務関連（請求・外注など）MAIL: 1:TO 2:CC
     */
    @ApiModelProperty(value = "事務関連（請求・外注など）MAIL: 1:TO 2:CC")
     @TableField("JIMU_MAIL")
    private Integer jimuMail;

     @TableField("BIKOU")
    private String bikou;



    @Override
    public Serializable pkVal() {
        return this.tantouId;
    }

}