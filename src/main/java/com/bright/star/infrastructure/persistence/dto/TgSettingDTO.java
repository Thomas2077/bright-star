package com.bright.star.infrastructure.persistence.dto;

    import java.io.Serializable;

    import io.swagger.annotations.ApiModel;
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

@ApiModel(value = "TgSettingDTO对象", description = "")

public class TgSettingDTO implements Serializable {


    private Integer category1;

    private Integer category2;

    private Integer category3;

    private String value1;

    private String value2;

    private String value3;

    private String value4;

    private String value5;




}