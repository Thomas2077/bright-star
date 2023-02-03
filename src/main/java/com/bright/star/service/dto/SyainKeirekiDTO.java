package com.bright.star.service.dto;

    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.io.Serializable;

    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import lombok.Data;
    import lombok.experimental.Accessors;

/**
* <p>
* 社員マスタ_経歴
* </p>
*
* @since 2023-02-02
*/
@Data
@Accessors(chain = true)
@ApiModel(value = "SyainKeirekiDTO对象", description = "社員マスタ_経歴")
public class SyainKeirekiDTO implements Serializable {


    private Integer syainId;

    /**
    * 開始日
    */
    @ApiModelProperty(value = "開始日")
    private LocalDate kaisibi;

    /**
    * 終了日
    */
    @ApiModelProperty(value = "終了日")
    private LocalDate syuryobi;

    /**
    * プロジェクト名
    */
    @ApiModelProperty(value = "プロジェクト名")
    private String pjName;

    /**
    * 対日かどうか
    */
    @ApiModelProperty(value = "対日かどうか")
    private Integer tainitiFlag;

    /**
    * 開発場所
    */
    @ApiModelProperty(value = "開発場所")
    private Integer basyo;

    /**
    * 開発規模
    */
    @ApiModelProperty(value = "開発規模")
    private Integer kibo;

    /**
    * 開発業種
    */
    @ApiModelProperty(value = "開発業種")
    private Integer gyosyu;

    /**
    * 開発環境
    */
    @ApiModelProperty(value = "開発環境")
    private Integer kaihatukankyo;

    /**
    * 運用環境
    */
    @ApiModelProperty(value = "運用環境")
    private Integer unyoukankyo;

    /**
    * 言語
    */
    @ApiModelProperty(value = "言語")
    private String gengo;

    private String db;

    /**
    * FW・IDE・ツール
    */
    @ApiModelProperty(value = "FW・IDE・ツール")
    private String tool;

    /**
    * 担当
    */
    @ApiModelProperty(value = "担当")
    private Integer tantou;

    /**
    * 作業範囲
    */
    @ApiModelProperty(value = "作業範囲")
    private Integer sagyohani;

    /**
    * 開発概要
    */
    @ApiModelProperty(value = "開発概要")
    private String gaiyou;

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