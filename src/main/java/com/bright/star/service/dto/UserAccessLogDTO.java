package com.bright.star.service.dto;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
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


@ApiModel(value = "UserAccessLogDTO对象", description = "")

public record UserAccessLogDTO (

     Integer id,

        /**
        * 画面ID
        */
     Integer userId,

        /**
        * アクセス開始時間
        */
     String gamenId,

     LocalDateTime startTime
){


}