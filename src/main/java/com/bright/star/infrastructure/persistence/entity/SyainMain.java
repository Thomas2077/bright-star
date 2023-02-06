package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

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
@TableName("syain_main")
@ApiModel(value = "SyainMain对象", description = "")
public class SyainMain extends Model<SyainMain> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.AUTO)
    private Integer syainId;

    /**
     * 社員名（漢字）＿姓
     */
    @ApiModelProperty(value = "社員名（漢字）＿姓")
    @TableField("FIRST_NAME_KANJI")
    private String firstNameKanji;

    /**
     * 社員名（漢字）＿名
     */
    @ApiModelProperty(value = "社員名（漢字）＿名")
    @TableField("LAST_NAME_KANJI")
    private String lastNameKanji;

    /**
     * 社員名（カタカナ）＿姓
     */
    @ApiModelProperty(value = "社員名（カタカナ）＿姓")
    @TableField("FIRST_NAME_KANA")
    private String firstNameKana;

    /**
     * 社員名（カタカナ）＿名
     */
    @ApiModelProperty(value = "社員名（カタカナ）＿名")
    @TableField("LAST_NAME_KANA")
    private String lastNameKana;

    /**
     * 社員名（英語）＿性
     */
    @ApiModelProperty(value = "社員名（英語）＿性")
    @TableField("FIRST_NAME_EIGO")
    private String firstNameEigo;

    /**
     * 社員名（英語）＿名
     */
    @ApiModelProperty(value = "社員名（英語）＿名")
    @TableField("LAST_NAME_EIGO")
    private String lastNameEigo;

    /**
     * 性別 0:女 1:男
     */
    @ApiModelProperty(value = "性別 0:女 1:男")
    @TableField("SEIBETU")
    private Integer seibetu;

    /**
     * 誕生日
     */
    @ApiModelProperty(value = "誕生日")
    @TableField("TANJYOBI")
    private LocalDate tanjyobi;

    /**
     * 国籍
     */
    @ApiModelProperty(value = "国籍")
    @TableField("KOKUSEKI")
    private Integer kokuseki;

    /**
     * 出身地
     */
    @ApiModelProperty(value = "出身地")
    @TableField("SYUSSINN")
    private String syussinn;

    /**
     * 配偶者有り無し ０：なし　１：あり
     */
    @ApiModelProperty(value = "配偶者有り無し ０：なし　１：あり")
    @TableField("HAIGUSYA")
    private Integer haigusya;

    @TableField("PASSPORT_NUM")
    private String passportNum;

    @TableField("PASSPORT_END_DATE")
    private LocalDate passportEndDate;

    /**
     * ビザ期間
     */
    @ApiModelProperty(value = "ビザ期間")
    @TableField("VISA_KIKAN")
    private Integer visaKikan;

    /**
     * ビザ有効日
     */
    @ApiModelProperty(value = "ビザ有効日")
    @TableField("VISA_END_DATE")
    private LocalDate visaEndDate;

    /**
     * 在留資格
     */
    @ApiModelProperty(value = "在留資格")
    @TableField("ZAIRYU_SIKAKU")
    private Integer zairyuSikaku;

    /**
     * マイナンバー
     */
    @ApiModelProperty(value = "マイナンバー")
    @TableField("KOJIN_NUM")
    private String kojinNum;

    /**
     * 在留番号
     */
    @ApiModelProperty(value = "在留番号")
    @TableField("ZAIRYU_NUM")
    private String zairyuNum;

    /**
     * 所属会社
     */
    @ApiModelProperty(value = "所属会社")
    @TableField("SYOZOKU_KAISYA")
    private Integer syozokuKaisya;

    /**
     * 入社日
     */
    @ApiModelProperty(value = "入社日")
    @TableField("NYUUSYA_DATE")
    private LocalDate nyuusyaDate;

    /**
     * 退社日
     */
    @ApiModelProperty(value = "退社日")
    @TableField("TAISYA_DATE")
    private LocalDate taisyaDate;

    /**
     * 職業種類
     */
    @ApiModelProperty(value = "職業種類")
    @TableField("SYOKUGYO_KIND")
    private Integer syokugyoKind;

    /**
     * 来日時期
     */
    @ApiModelProperty(value = "来日時期")
    @TableField("RAINITI_DATE")
    private LocalDate rainitiDate;

    /**
     * 備考
     */
    @ApiModelProperty(value = "備考")
    @TableField("BIKOU")
    private String bikou;

    /**
     * 日本の住所の郵便
     */
    @ApiModelProperty(value = "日本の住所の郵便")
    @TableField("YUUBIN")
    private String yuubin;

    /**
     * 日本の住所1
     */
    @ApiModelProperty(value = "日本の住所1")
    @TableField("JYUSYO_1")
    private String jyusyo1;

    /**
     * 日本の住所2
     */
    @ApiModelProperty(value = "日本の住所2")
    @TableField("JYUSYO_2")
    private String jyusyo2;

    /**
     * 最寄駅
     */
    @ApiModelProperty(value = "最寄駅")
    @TableField("MOYORI_EKI")
    private String moyoriEki;

    /**
     * 携帯電話
     */
    @ApiModelProperty(value = "携帯電話")
    @TableField("TEL")
    private String tel;

    /**
     * メールアドレス
     */
    @ApiModelProperty(value = "メールアドレス")
    @TableField("EMAIL")
    private String email;

    @TableField("WECHAT")
    private String wechat;

    @TableField("LINE")
    private String line;

    /**
     * 母国の住所
     */
    @ApiModelProperty(value = "母国の住所")
    @TableField("BOKOKU_JYUSYO")
    private String bokokuJyusyo;

    /**
     * 母国の緊急連絡先
     */
    @ApiModelProperty(value = "母国の緊急連絡先")
    @TableField("BOKOKU_KINNKYUU_RENNRAKU")
    private String bokokuKinnkyuuRennraku;

    /**
     * 学校名
     */
    @TableField("GAKKOU_NAME")
    private String gakkouName;

    /**
     * 最終学歴
     */
    @ApiModelProperty(value = "最終学歴")
    @TableField("SAISYUU_GAKUREKI")
    private Integer saisyuuGakureki;

    /**
     * 専門名
     */
    @ApiModelProperty(value = "専門名")
    @TableField("SENNMOM_NAME")
    private String sennmomName;

    /**
     * 卒業年月日
     */
    @ApiModelProperty(value = "卒業年月日")
    @TableField("SOTUGYO_DATE")
    private LocalDate sotugyoDate;

    /**
     * 業務年数
     */
    @ApiModelProperty(value = "業務年数")
    @TableField("GYUMU_NENSU")
    private Float gyumuNensu;

    /**
     * イニシャル名
     */
    @ApiModelProperty(value = "イニシャル名")
    @TableField("INITIAL_NAME")
    private String initialName;

    @TableField("IT_OS")
    private String itOs;

    /**
     * 言語
     */
    @ApiModelProperty(value = "言語")
    @TableField("IT_GENGO")
    private String itGengo;

    @TableField("IT_DB")
    private String itDb;

    @TableField("IT_WEB_SERVER")
    private String itWebServer;

    @TableField("IT_FW")
    private String itFw;

    /**
     * その他
     */
    @ApiModelProperty(value = "その他")
    @TableField("IT_OTHER")
    private String itOther;

    /**
     * 備考及び自己紹介
     */
    @ApiModelProperty(value = "備考及び自己紹介")
    @TableField("IT_BIKOU")
    private String itBikou;

    /**
     * 社員コード
     */
    @ApiModelProperty(value = "社員コード")
    @TableField("EMPLOYEECODE")
    private String employeecode;

    @TableField("COMMENT")
    private String comment;

    /**
     * 金融機関コード
     */
    @ApiModelProperty(value = "金融機関コード")
    @TableField("KINYUKIKAN_CODE")
    private String kinyukikanCode;

    /**
     * 金融機関名
     */
    @ApiModelProperty(value = "金融機関名")
    @TableField("KINYUKIKAN_NAME")
    private String kinyukikanName;

    /**
     * 支店名コード
     */
    @ApiModelProperty(value = "支店名コード")
    @TableField("SITEN_CODE")
    private String sitenCode;

    /**
     * 支店名
     */
    @ApiModelProperty(value = "支店名")
    @TableField("SITEN_NAME")
    private String sitenName;

    /**
     * 口座種類
     */
    @ApiModelProperty(value = "口座種類")
    @TableField("KOUZA_KIND")
    private Integer kouzaKind;

    /**
     * 口座番号
     */
    @ApiModelProperty(value = "口座番号")
    @TableField("KOUZA_NUM")
    private String kouzaNum;

    /**
     * 名義人
     */
    @ApiModelProperty(value = "名義人")
    @TableField("MEIGI_NAME")
    private Integer meigiName;

    /**
     * 論理削除フラグ
     */
    @ApiModelProperty(value = "論理削除フラグ")
    @TableField("DELETE_FLAG")
    private Integer deleteFlag;

    /**
     * 更新日
     */
    @ApiModelProperty(value = "更新日")
    @TableField("KOUSINNBI")
    private LocalDateTime kousinnbi;

    /**
     * 登録日
     */
    @ApiModelProperty(value = "登録日")
    @TableField("TOUROKUBI")
    private LocalDateTime tourokubi;


    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}