package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "SyainMain对象")
public
class SyainMain extends Model<SyainMain> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYAIN_ID", type = IdType.AUTO)
    private Integer syainId;

    /**
     * 社員名（漢字）＿姓
     */
    @Schema(description = "社員名（漢字）＿姓")
    @TableField("FIRST_NAME_KANJI")
    private String firstNameKanji;

    /**
     * 社員名（漢字）＿名
     */
    @Schema(description = "社員名（漢字）＿名")
    @TableField("LAST_NAME_KANJI")
    private String lastNameKanji;

    /**
     * 社員名（カタカナ）＿姓
     */
    @Schema(description = "社員名（カタカナ）＿姓")
    @TableField("FIRST_NAME_KANA")
    private String firstNameKana;

    /**
     * 社員名（カタカナ）＿名
     */
    @Schema(description = "社員名（カタカナ）＿名")
    @TableField("LAST_NAME_KANA")
    private String lastNameKana;

    /**
     * 社員名（英語）＿性
     */
    @Schema(description = "社員名（英語）＿性")
    @TableField("FIRST_NAME_EIGO")
    private String firstNameEigo;

    /**
     * 社員名（英語）＿名
     */
    @Schema(description = "社員名（英語）＿名")
    @TableField("LAST_NAME_EIGO")
    private String lastNameEigo;

    /**
     * 性別 0:女 1:男
     */
    @Schema(description = "性別 0:女 1:男")
    @TableField("SEIBETU")
    private Integer seibetu;

    /**
     * 誕生日
     */
    @Schema(description = "誕生日")
    @TableField("TANJYOBI")
    private LocalDate tanjyobi;

    /**
     * 国籍
     */
    @Schema(description = "国籍")
    @TableField("KOKUSEKI")
    private Integer kokuseki;

    /**
     * 出身地
     */
    @Schema(description = "出身地")
    @TableField("SYUSSINN")
    private String syussinn;

    /**
     * 配偶者有り無し ０：なし　１：あり
     */
    @Schema(description = "配偶者有り無し ０：なし　１：あり")
    @TableField("HAIGUSYA")
    private Integer haigusya;

    @TableField("PASSPORT_NUM")
    private String passportNum;

    @TableField("PASSPORT_END_DATE")
    private LocalDate passportEndDate;

    /**
     * ビザ期間
     */
    @Schema(description = "ビザ期間")
    @TableField("VISA_KIKAN")
    private Integer visaKikan;

    /**
     * ビザ有効日
     */
    @Schema(description = "ビザ有効日")
    @TableField("VISA_END_DATE")
    private LocalDate visaEndDate;

    /**
     * 在留資格
     */
    @Schema(description = "在留資格")
    @TableField("ZAIRYU_SIKAKU")
    private Integer zairyuSikaku;

    /**
     * マイナンバー
     */
    @Schema(description = "マイナンバー")
    @TableField("KOJIN_NUM")
    private String kojinNum;

    /**
     * 在留番号
     */
    @Schema(description = "在留番号")
    @TableField("ZAIRYU_NUM")
    private String zairyuNum;

    /**
     * 所属会社
     */
    @Schema(description = "所属会社")
    @TableField("SYOZOKU_KAISYA")
    private Integer syozokuKaisya;

    /**
     * 入社日
     */
    @Schema(description = "入社日")
    @TableField("NYUUSYA_DATE")
    private LocalDate nyuusyaDate;

    /**
     * 退社日
     */
    @Schema(description = "退社日")
    @TableField("TAISYA_DATE")
    private LocalDate taisyaDate;

    /**
     * 職業種類
     */
    @Schema(description = "職業種類")
    @TableField("SYOKUGYO_KIND")
    private Integer syokugyoKind;

    /**
     * 来日時期
     */
    @Schema(description = "来日時期")
    @TableField("RAINITI_DATE")
    private LocalDate rainitiDate;

    /**
     * 備考
     */
    @Schema(description = "備考")
    @TableField("BIKOU")
    private String bikou;

    /**
     * 日本の住所の郵便
     */
    @Schema(description = "日本の住所の郵便")
    @TableField("YUUBIN")
    private String yuubin;

    /**
     * 日本の住所1
     */
    @Schema(description = "日本の住所1")
    @TableField("JYUSYO_1")
    private String jyusyo1;

    /**
     * 日本の住所2
     */
    @Schema(description = "日本の住所2")
    @TableField("JYUSYO_2")
    private String jyusyo2;

    /**
     * 最寄駅
     */
    @Schema(description = "最寄駅")
    @TableField("MOYORI_EKI")
    private String moyoriEki;

    /**
     * 携帯電話
     */
    @Schema(description = "携帯電話")
    @TableField("TEL")
    private String tel;

    /**
     * メールアドレス
     */
    @Schema(description = "メールアドレス")
    @TableField("EMAIL")
    private String email;

    @TableField("WECHAT")
    private String wechat;

    @TableField("LINE")
    private String line;

    /**
     * 母国の住所
     */
    @Schema(description = "母国の住所")
    @TableField("BOKOKU_JYUSYO")
    private String bokokuJyusyo;

    /**
     * 母国の緊急連絡先
     */
    @Schema(description = "母国の緊急連絡先")
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
    @Schema(description = "最終学歴")
    @TableField("SAISYUU_GAKUREKI")
    private Integer saisyuuGakureki;

    /**
     * 専門名
     */
    @Schema(description = "専門名")
    @TableField("SENNMOM_NAME")
    private String sennmomName;

    /**
     * 卒業年月日
     */
    @Schema(description = "卒業年月日")
    @TableField("SOTUGYO_DATE")
    private LocalDate sotugyoDate;

    /**
     * 業務年数
     */
    @Schema(description = "業務年数")
    @TableField("GYUMU_NENSU")
    private Float gyumuNensu;

    /**
     * イニシャル名
     */
    @Schema(description = "イニシャル名")
    @TableField("INITIAL_NAME")
    private String initialName;

    @TableField("IT_OS")
    private String itOs;

    /**
     * 言語
     */
    @Schema(description = "言語")
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
    @Schema(description = "その他")
    @TableField("IT_OTHER")
    private String itOther;

    /**
     * 備考及び自己紹介
     */
    @Schema(description = "備考及び自己紹介")
    @TableField("IT_BIKOU")
    private String itBikou;

    /**
     * 社員コード
     */
    @Schema(description = "社員コード")
    @TableField("EMPLOYEECODE")
    private String employeecode;

    @TableField("COMMENT")
    private String comment;

    /**
     * 金融機関コード
     */
    @Schema(description = "金融機関コード")
    @TableField("KINYUKIKAN_CODE")
    private String kinyukikanCode;

    /**
     * 金融機関名
     */
    @Schema(description = "金融機関名")
    @TableField("KINYUKIKAN_NAME")
    private String kinyukikanName;

    /**
     * 支店名コード
     */
    @Schema(description = "支店名コード")
    @TableField("SITEN_CODE")
    private String sitenCode;

    /**
     * 支店名
     */
    @Schema(description = "支店名")
    @TableField("SITEN_NAME")
    private String sitenName;

    /**
     * 口座種類
     */
    @Schema(description = "口座種類")
    @TableField("KOUZA_KIND")
    private Integer kouzaKind;

    /**
     * 口座番号
     */
    @Schema(description = "口座番号")
    @TableField("KOUZA_NUM")
    private String kouzaNum;

    /**
     * 名義人
     */
    @Schema(description = "名義人")
    @TableField("MEIGI_NAME")
    private Integer meigiName;

    /**
     * 論理削除フラグ
     */
    @Schema(description = "論理削除フラグ")
    @TableField("DELETE_FLAG")
    private Integer deleteFlag;

    /**
     * 更新日
     */
    @Schema(description = "更新日")
    @TableField("KOUSINNBI")
    private LocalDateTime kousinnbi;

    /**
     * 登録日
     */
    @Schema(description = "登録日")
    @TableField("TOUROKUBI")
    private LocalDateTime tourokubi;


    @Override
    public Serializable pkVal() {
        return this.syainId;
    }

}