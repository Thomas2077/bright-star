package com.bright.star.service.dto;

import java.time.LocalDateTime;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 社員_交通費
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "SyainKoutsuhiDTO对象", description = "社員_交通費")
public class SyainKoutsuhiDTO implements Serializable {


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
     * 日付
     */
    @ApiModelProperty(value = "日付")
    private Integer himoku;

    /**
     * 出発駅
     */
    @ApiModelProperty(value = "出発駅")
    private String syuppatsuEki;

    /**
     * 到着駅
     */
    @ApiModelProperty(value = "到着駅")
    private String touchakuEki;

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