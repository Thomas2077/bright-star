package com.bright.star.service.dto;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;

    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;


/**
* <p>
* 
* </p>
*
* @since 2023-02-08
*/


@ApiModel(value = "TorihikisakiTantouDTO对象", description = "")

public record TorihikisakiTantouDTO (

        /**
        * 担当者ID
        */
     Integer tantouId,

        /**
        * 担当者ID
        */
     Integer torihikiId,

     String firstName,

     String lastName,

        /**
        * 所属: 管理本部など
        */
     String syozoku,

        /**
        * 役職: 部長など
        */
     String yakusyoku,

     String mail,

     String tel,

        /**
        * 事務関連（請求・外注など）MAIL: 1:TO 2:CC
        */
     Integer jimuMail,

     String bikou
){


}