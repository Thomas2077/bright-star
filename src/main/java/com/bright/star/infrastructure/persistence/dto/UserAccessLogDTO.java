package com.bright.star.infrastructure.persistence.dto;

    import java.time.LocalDateTime;
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