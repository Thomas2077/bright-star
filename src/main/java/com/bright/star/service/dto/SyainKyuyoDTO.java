package com.bright.star.service.dto;

import java.time.LocalDateTime;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 社員_給与
 * </p>
 *
 * @since 2023-02-02
 */
@Data
@Accessors(chain = true)

@ApiModel(value = "SyainKyuyoDTO对象", description = "社員_給与")

public class SyainKyuyoDTO implements Serializable {


    private Integer syainId;

    /**
     * 開始年月
     */
    @ApiModelProperty(value = "開始年月")
    private String kaishiNengetsu;

    /**
     * 終了年月: 最後の記録以外、NULL不可
     */
    @ApiModelProperty(value = "終了年月: 最後の記録以外、NULL不可")
    private String syuryoNengetsu;

    /**
     * 基本給
     */
    @ApiModelProperty(value = "基本給")
    private Integer kihonkyu;

    /**
     * 職能給
     */
    @ApiModelProperty(value = "職能給")
    private Integer syokunoukyu;

    /**
     * 雇用保険番号
     */
    @ApiModelProperty(value = "雇用保険番号")
    private String koyouHokenNo;

    /**
     * 年金番号
     */
    @ApiModelProperty(value = "年金番号")
    private String nankinNo;

    /**
     * 年金基準額
     */
    @ApiModelProperty(value = "年金基準額")
    private Integer nankinKijyunGaku;

    /**
     * 健康保険番号
     */
    @ApiModelProperty(value = "健康保険番号")
    private String kenkouHokenNo;

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