package com.bright.star.controller.vo.value;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 基本情報
 */
@Data
@ApiModel(value = "main info)", description = "main info")
public class BaseInfo {


    private Integer syainId;

    /**
     * 社員名（漢字）＿姓
     */
    @ApiModelProperty(value = "社員名（漢字）＿姓")
    private String firstNameKanji;

    /**
     * 社員名（漢字）＿名
     */
    @ApiModelProperty(value = "社員名（漢字）＿名")
    private String lastNameKanji;

    /**
     * 社員名（カタカナ）＿姓
     */
    @ApiModelProperty(value = "社員名（カタカナ）＿姓")
    private String firstNameKana;

    /**
     * 社員名（カタカナ）＿名
     */
    @ApiModelProperty(value = "社員名（カタカナ）＿名")
    private String lastNameKana;

    /**
     * 社員名（英語）＿性
     */
    @ApiModelProperty(value = "社員名（英語）＿性")
    private String firstNameEigo;

    /**
     * 社員名（英語）＿名
     */
    @ApiModelProperty(value = "社員名（英語）＿名")
    private String lastNameEigo;

    /**
     * 性別 0:女 1:男
     */
    @ApiModelProperty(value = "性別 0:女 1:男")
    private Integer seibetu;

    /**
     * 誕生日
     */
    @ApiModelProperty(value = "誕生日")
    private LocalDate tanjyobi;

    /**
     * 国籍
     */
    @ApiModelProperty(value = "国籍")
    private Integer kokuseki;

    /**
     * 出身地
     */
    @ApiModelProperty(value = "出身地")
    private String syussinn;

    /**
     * 配偶者有り無し ０：なし　１：あり
     */
    @ApiModelProperty(value = "配偶者有り無し ０：なし　１：あり")
    private Integer haigusya;

    private String passportNum;

    private LocalDate passportEndDate;

    /**
     * ビザ期間
     */
    @ApiModelProperty(value = "ビザ期間")
    private Integer visaKikan;

    /**
     * ビザ有効日
     */
    @ApiModelProperty(value = "ビザ有効日")
    private LocalDate visaEndDate;

    /**
     * 在留資格
     */
    @ApiModelProperty(value = "在留資格")
    private Integer zairyuSikaku;

    /**
     * マイナンバー
     */
    @ApiModelProperty(value = "マイナンバー")
    private String kojinNum;

    /**
     * 在留番号
     */
    @ApiModelProperty(value = "在留番号")
    private String zairyuNum;

    /**
     * 所属会社
     */
    @ApiModelProperty(value = "所属会社")
    private Integer syozokuKaisya;

    /**
     * 入社日
     */
    @ApiModelProperty(value = "入社日")
    private LocalDate nyuusyaDate;

    /**
     * 退社日
     */
    @ApiModelProperty(value = "退社日")
    private LocalDate taisyaDate;

    /**
     * 職業種類
     */
    @ApiModelProperty(value = "職業種類")
    private Integer syokugyoKind;

    /**
     * 来日時期
     */
    @ApiModelProperty(value = "来日時期")
    private LocalDate rainitiDate;

    /**
     * 備考
     */
    @ApiModelProperty(value = "備考")
    private String bikou;

    /**
     * 日本の住所の郵便
     */
    @ApiModelProperty(value = "日本の住所の郵便")
    private String yuubin;

    /**
     * 日本の住所1
     */
    @ApiModelProperty(value = "日本の住所1")
    private String jyusyo1;

    /**
     * 日本の住所2
     */
    @ApiModelProperty(value = "日本の住所2")
    private String jyusyo2;

    /**
     * 最寄駅
     */
    @ApiModelProperty(value = "最寄駅")
    private String moyoriEki;

    /**
     * 携帯電話
     */
    @ApiModelProperty(value = "携帯電話")
    private String tel;

    /**
     * メールアドレス
     */
    @ApiModelProperty(value = "メールアドレス")
    private String email;

    private String wechat;

    private String line;

    /**
     * 母国の住所
     */
    @ApiModelProperty(value = "母国の住所")
    private String bokokuJyusyo;

    /**
     * 母国の緊急連絡先
     */
    @ApiModelProperty(value = "母国の緊急連絡先")
    private String bokokuKinnkyuuRennraku;

    /**
     * 学校名
     */
    @ApiModelProperty(value = "学校名")
    private String gakkouName;

    /**
     * 最終学歴
     */
    @ApiModelProperty(value = "最終学歴")
    private Integer saisyuuGakureki;

    /**
     * 専門名
     */
    @ApiModelProperty(value = "専門名")
    private String sennmomName;

    /**
     * 卒業年月日
     */
    @ApiModelProperty(value = "卒業年月日")
    private LocalDate sotugyoDate;

    /**
     * 業務年数
     */
    @ApiModelProperty(value = "業務年数")
    private Float gyumuNensu;

    /**
     * イニシャル名
     */
    @ApiModelProperty(value = "イニシャル名")
    private String initialName;

    private String itOs;

    /**
     * 言語
     */
    @ApiModelProperty(value = "言語")
    private String itGengo;

    private String itDb;

    private String itWebServer;

    private String itFw;

    /**
     * その他
     */
    @ApiModelProperty(value = "その他")
    private String itOther;

    /**
     * 備考及び自己紹介
     */
    @ApiModelProperty(value = "備考及び自己紹介")
    private String itBikou;

    /**
     * 社員コード
     */
    @ApiModelProperty(value = "社員コード")
    private String employeecode;

    private String comment;

    /**
     * 金融機関コード
     */
    @ApiModelProperty(value = "金融機関コード")
    private String kinyukikanCode;

    /**
     * 金融機関名
     */
    @ApiModelProperty(value = "金融機関名")
    private String kinyukikanName;

    /**
     * 支店名コード
     */
    @ApiModelProperty(value = "支店名コード")
    private String sitenCode;

    /**
     * 支店名
     */
    @ApiModelProperty(value = "支店名")
    private String sitenName;

    /**
     * 口座種類
     */
    @ApiModelProperty(value = "口座種類")
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
    private Integer meigiName;

    /**
     * 論理削除フラグ
     */
    @ApiModelProperty(value = "論理削除フラグ")
    private Integer deleteFlag;

    /**
     * 更新日
     */
    @ApiModelProperty(value = "更新日")
    private LocalDateTime kousinnbi;

    /**
     * 登録日
     */
    @ApiModelProperty(value = "登録日")
    private LocalDateTime tourokubi;


}
