package com.bright.star.service.dto;

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

@ApiModel(value = "TorihikisakiMainDTO对象", description = "")

public class TorihikisakiMainDTO implements Serializable {


    /**
    * 自動連番
    */
    @ApiModelProperty(value = "自動連番")
    private Integer torihikiId;

    private String torihikiNameAll;

    private String torihikiNameRyaku;

    private String yuubin;

    /**
    * 住所1
    */
    @ApiModelProperty(value = "住所1")
    private String jyusyo1;

    /**
    * 住所2
    */
    @ApiModelProperty(value = "住所2")
    private String jyusyo2;

    private String tel;

    private String fax;

    private String url;

    /**
    * 備考
    */
    @ApiModelProperty(value = "備考")
    private String bikou;

    /**
    * 論理削除　0:有効　1:削除
    */
    @ApiModelProperty(value = "論理削除　0:有効　1:削除")
    private Integer deleteFlag;

    /**
    * 請求書の郵送有無　0：無し　1：有り
    */
    @ApiModelProperty(value = "請求書の郵送有無　0：無し　1：有り")
    private Integer seikyusyoKubun1;

    /**
    * 特定ファイル名　0：無し　1：有り
    */
    @ApiModelProperty(value = "特定ファイル名　0：無し　1：有り")
    private Integer seikyusyoKubun2;

    /**
    * 案件名請求　0：無し　1：有り
    */
    @ApiModelProperty(value = "案件名請求　0：無し　1：有り")
    private Integer seikyusyoKubun3;

    /**
    * 納品書付き　0：無し　1：有り
    */
    @ApiModelProperty(value = "納品書付き　0：無し　1：有り")
    private Integer seikyusyoKubun4;

    /**
    * 請求書の提供　0：無し　1：本体　2：フォーマット
    */
    @ApiModelProperty(value = "請求書の提供　0：無し　1：本体　2：フォーマット")
    private Integer seikyusyoKubun5;

    /**
    * 請求単位　0：会社別　1：作業員別／案件名別　2：現場別　3：職部別
    */
    @ApiModelProperty(value = "請求単位　0：会社別　1：作業員別／案件名別　2：現場別　3：職部別")
    private Integer seikyusyoKubun6;

    private String seikyusyoKubun7;

    private String seikyusyoKubun8;

    private String seikyusyoKubun9;

    private String seikyusyoKubun10;

    private String seikyusyoKubun11;

    /**
    * 本社指定
    */
    @ApiModelProperty(value = "本社指定")
    private Integer honsya;

    /**
    * 本社口座
    */
    @ApiModelProperty(value = "本社口座")
    private Integer honsyaKouza;

    /**
    * 金融機関コード
    */
    @ApiModelProperty(value = "金融機関コード")
    private String kinyukikanCode;

    /**
    * 金融機関
    */
    @ApiModelProperty(value = "金融機関")
    private String kinyukikanName;

    /**
    * 支店名コード
    */
    @ApiModelProperty(value = "支店名コード")
    private String sitenCode;

    /**
    * 支店
    */
    @ApiModelProperty(value = "支店")
    private String sitenName;

    /**
    * 1:普通　2:当座
    */
    @ApiModelProperty(value = "1:普通　2:当座")
    private Integer kouzaKind;

    /**
    * 口座番号
    */
    @ApiModelProperty(value = "口座番号")
    private String kouzaNum;

    /**
    * 名義人
    */
    @ApiModelProperty(value = "名義人")
    private String meigiName;

    private LocalDateTime tourokubi;

    private LocalDateTime kousinnbi;




}