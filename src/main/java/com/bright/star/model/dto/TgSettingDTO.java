package com.bright.star.model.dto;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
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