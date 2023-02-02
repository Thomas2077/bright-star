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
* 社員_経費
* </p>
*
* @since 2023-02-02
*/
@Data
@Accessors(chain = true)

@ApiModel(value = "SyainKeihiDTO对象", description = "社員_経費")

public class SyainKeihiDTO implements Serializable {


    private Integer syainId;

    /**
    * 適用年月
    */
    @ApiModelProperty(value = "適用年月")
    private String tekiyouNengetsu;

    /**
    * 連番
    */
    @ApiModelProperty(value = "連番")
    private Integer renban;

    /**
    * 費目
    */
    @ApiModelProperty(value = "費目")
    private Integer himoku;

    /**
    * 金額
    */
    @ApiModelProperty(value = "金額")
    private Integer kingaku;

    /**
    * 客先請求区分
    */
    @ApiModelProperty(value = "客先請求区分")
    private Integer kyakusakiSeikyuKubun;

    /**
    * 備考
    */
    @ApiModelProperty(value = "備考")
    private String bikou;

    /**
    * 登録日
    */
    @ApiModelProperty(value = "登録日")
    private LocalDateTime tourokubi;

    /**
    * 更新日
    */
    @ApiModelProperty(value = "更新日")
    private LocalDateTime kousinnbi;




}