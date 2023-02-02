package com.bright.star.model.dto;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import com.baomidou.mybatisplus.annotation.TableName;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
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

@ApiModel(value = "UserAccessLogDTO对象", description = "")

public class UserAccessLogDTO implements Serializable {


    private Integer id;

    /**
    * 画面ID
    */
    @ApiModelProperty(value = "画面ID")
    private Integer userId;

    /**
    * アクセス開始時間
    */
    @ApiModelProperty(value = "アクセス開始時間")
    private String gamenId;

    private LocalDateTime startTime;




}