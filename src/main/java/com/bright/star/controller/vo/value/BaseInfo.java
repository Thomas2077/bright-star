package com.bright.star.controller.vo.value;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 基本情報
 */
@Data
@Schema(description = "main info)")
public
class BaseInfo {


    private Integer syainId;

    /**
     * 社員名（漢字）＿姓
     */
    @Schema(description = "社員名（漢字）＿姓")
    private String firstNameKanji;

    /**
     * 社員名（漢字）＿名
     */
    @Schema(description = "社員名（漢字）＿名")
    private String lastNameKanji;

    /**
     * 社員名（カタカナ）＿姓
     */
    @Schema(description = "社員名（カタカナ）＿姓")
    private String firstNameKana;

    /**
     * 社員名（カタカナ）＿名
     */
    @Schema(description = "社員名（カタカナ）＿名")
    private String lastNameKana;

    /**
     * 社員名（英語）＿性
     */
    @Schema(description = "社員名（英語）＿性")
    private String firstNameEigo;

    /**
     * 社員名（英語）＿名
     */
    @Schema(description = "社員名（英語）＿名")
    private String lastNameEigo;

    /**
     * 性別 0:女 1:男
     */
    @Schema(description = "性別 0:女 1:男")
    private Integer seibetu;

    /**
     * 誕生日
     */
    @Schema(description = "誕生日")
    private LocalDate tanjyobi;

    /**
     * 国籍
     */
    @Schema(description = "国籍")
    private Integer kokuseki;

    /**
     * 出身地
     */
    @Schema(description = "出身地")
    private String syussinn;

    /**
     * 配偶者有り無し ０：なし　１：あり
     */
    @Schema(description = "配偶者有り無し ０：なし　１：あり")
    private Integer haigusya;

    private String passportNum;

    private LocalDate passportEndDate;

    /**
     * ビザ期間
     */
    @Schema(description = "ビザ期間")
    private Integer visaKikan;

    /**
     * ビザ有効日
     */
    @Schema(description = "ビザ有効日")
    private LocalDate visaEndDate;

    /**
     * 在留資格
     */
    @Schema(description = "在留資格")
    private Integer zairyuSikaku;

    /**
     * マイナンバー
     */
    @Schema(description = "マイナンバー")
    private String kojinNum;

    /**
     * 在留番号
     */
    @Schema(description = "在留番号")
    private String zairyuNum;

    /**
     * 所属会社
     */
    @Schema(description = "所属会社")
    private Integer syozokuKaisya;

    /**
     * 入社日
     */
    @Schema(description = "入社日")
    private LocalDate nyuusyaDate;

    /**
     * 退社日
     */
    @Schema(description = "退社日")
    private LocalDate taisyaDate;

    /**
     * 職業種類
     */
    @Schema(description = "職業種類")
    private Integer syokugyoKind;

    /**
     * 来日時期
     */
    @Schema(description = "来日時期")
    private LocalDate rainitiDate;

    /**
     * 備考
     */
    @Schema(description = "備考")
    private String bikou;

    /**
     * 日本の住所の郵便
     */
    @Schema(description = "日本の住所の郵便")
    private String yuubin;

    /**
     * 日本の住所1
     */
    @Schema(description = "日本の住所1")
    private String jyusyo1;

    /**
     * 日本の住所2
     */
    @Schema(description = "日本の住所2")
    private String jyusyo2;

    /**
     * 最寄駅
     */
    @Schema(description = "最寄駅")
    private String moyoriEki;

    /**
     * 携帯電話
     */
    @Schema(description = "携帯電話")
    private String tel;

    /**
     * メールアドレス
     */
    @Schema(description = "メールアドレス")
    private String email;

    private String wechat;

    private String line;

    /**
     * 母国の住所
     */
    @Schema(description = "母国の住所")
    private String bokokuJyusyo;

    /**
     * 母国の緊急連絡先
     */
    @Schema(description = "母国の緊急連絡先")
    private String bokokuKinnkyuuRennraku;

    /**
     * 学校名
     */
    @Schema(description = "学校名")
    private String gakkouName;

    /**
     * 最終学歴
     */
    @Schema(description = "最終学歴")
    private Integer saisyuuGakureki;

    /**
     * 専門名
     */
    @Schema(description = "専門名")
    private String sennmomName;

    /**
     * 卒業年月日
     */
    @Schema(description = "卒業年月日")
    private LocalDate sotugyoDate;

    /**
     * 業務年数
     */
    @Schema(description = "業務年数")
    private Float gyumuNensu;

    /**
     * イニシャル名
     */
    @Schema(description = "イニシャル名")
    private String initialName;

    private String itOs;

    /**
     * 言語
     */
    @Schema(description = "言語")
    private String itGengo;

    private String itDb;

    private String itWebServer;

    private String itFw;

    /**
     * その他
     */
    @Schema(description = "その他")
    private String itOther;

    /**
     * 備考及び自己紹介
     */
    @Schema(description = "備考及び自己紹介")
    private String itBikou;

    /**
     * 社員コード
     */
    @Schema(description = "社員コード")
    private String employeecode;

    private String comment;

    /**
     * 金融機関コード
     */
    @Schema(description = "金融機関コード")
    private String kinyukikanCode;

    /**
     * 金融機関名
     */
    @Schema(description = "金融機関名")
    private String kinyukikanName;

    /**
     * 支店名コード
     */
    @Schema(description = "支店名コード")
    private String sitenCode;

    /**
     * 支店名
     */
    @Schema(description = "支店名")
    private String sitenName;

    /**
     * 口座種類
     */
    @Schema(description = "口座種類")
    private Integer kouzaKind;

    /**
     * 口座番号
     */
    @Schema(description = "口座番号")
    private String kouzaNum;

    /**
     * 名義人
     */
    @Schema(description = "名義人")
    private Integer meigiName;

    /**
     * 論理削除フラグ
     */
    @Schema(description = "論理削除フラグ")
    private Integer deleteFlag;

    /**
     * 更新日
     */
    @Schema(description = "更新日")
    private LocalDateTime kousinnbi;

    /**
     * 登録日
     */
    @Schema(description = "登録日")
    private LocalDateTime tourokubi;


}
