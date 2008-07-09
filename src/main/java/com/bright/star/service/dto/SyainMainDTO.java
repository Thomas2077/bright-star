package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * <p>
 *
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "SyainMainDTO对象")
public class SyainMainDTO {

        @NotNull
        Integer syainId;

        /**
         * 社員名（漢字）＿姓
         */
        @Schema(description = "社員名（漢字）＿姓")
        String firstNameKanji;

        /**
         * 社員名（漢字）＿名
         */
        @Schema(description = "社員名（漢字）＿名")
        String lastNameKanji;

        /**
         * 社員名（カタカナ）＿姓
         */
        @Schema(description = "社員名（カタカナ）＿姓")
        String firstNameKana;

        /**
         * 社員名（カタカナ）＿名
         */
        @Schema(description = "社員名（カタカナ）＿名")
        String lastNameKana;

        /**
         * 社員名（英語）＿性
         */
        @Schema(description = "社員名（英語）＿性")
        String firstNameEigo;

        /**
         * 社員名（英語）＿名
         */
        @Schema(description = "社員名（英語）＿名")
        String lastNameEigo;

        /**
         * 性別 0:女 1:男
         */
        @Schema(description = "性別 0:女 1:男")
        Integer seibetu;

        /**
         * 誕生日
         */
        @Schema(description = "誕生日")
        LocalDate tanjyobi;

        /**
         * 国籍
         */
        @Schema(description = "国籍")
        Integer kokuseki;

        /**
         * 出身地
         */
        @Schema(description = "出身地")
        String syussinn;

        /**
         * 配偶者有り無し ０：なし　１：あり
         */
        @Schema(description = "配偶者有り無し ０：なし　１：あり")
        Integer haigusya;

        String passportNum;

        LocalDate passportEndDate;

        /**
         * ビザ期間
         */
        @Schema(description = "ビザ期間")
        Integer visaKikan;

        /**
         * ビザ有効日
         */
        @Schema(description = "ビザ有効日")
        LocalDate visaEndDate;

        /**
         * 在留資格
         */
        @Schema(description = "在留資格")
        Integer zairyuSikaku;

        /**
         * マイナンバー
         */
        @Schema(description = "マイナンバー")
        String kojinNum;

        /**
         * 在留番号
         */
        @Schema(description = "在留番号")
        String zairyuNum;

        /**
         * 所属会社
         */
        @Schema(description = "所属会社")
        Integer syozokuKaisya;

        /**
         * 入社日
         */
        @Schema(description = "入社日")
        LocalDate nyuusyaDate;

        /**
         * 退社日
         */
        @Schema(description = "退社日")
        LocalDate taisyaDate;

        /**
         * 職業種類
         */
        @Schema(description = "職業種類")
        Integer syokugyoKind;

        /**
         * 来日時期
         */
        @Schema(description = "来日時期")
        LocalDate rainitiDate;

        /**
         * 備考
         */
        @Schema(description = "備考")
        String bikou;

        /**
         * 日本の住所の郵便
         */
        @Schema(description = "日本の住所の郵便")
        String yuubin;

        /**
         * 日本の住所1
         */
        @Schema(description = "日本の住所1")
        String jyusyo1;

        /**
         * 日本の住所2
         */
        @Schema(description = "日本の住所2")
        String jyusyo2;

        /**
         * 最寄駅
         */
        @Schema(description = "最寄駅")
        String moyoriEki;

        /**
         * 携帯電話
         */
        @Schema(description = "携帯電話")
        String tel;

        /**
         * メールアドレス
         */
        @Schema(description = "メールアドレス")
        String email;

        String wechat;

        String line;

        /**
         * 母国の住所
         */
        @Schema(description = "母国の住所")
        String bokokuJyusyo;

        /**
         * 母国の緊急連絡先
         */
        @Schema(description = "母国の緊急連絡先")
        String bokokuKinnkyuuRennraku;

        /**
         * 学校名
         */
        @Schema(description = "学校名")
        String gakkouName;

        /**
         * 最終学歴
         */
        @Schema(description = "最終学歴")
        Integer saisyuuGakureki;

        /**
         * 専門名
         */
        @Schema(description = "専門名")
        String sennmomName;

        /**
         * 卒業年月日
         */
        @Schema(description = "卒業年月日")
        LocalDate sotugyoDate;

        /**
         * 業務年数
         */
        @Schema(description = "業務年数/IT関連実務年数")
        Float gyumuNensu;

        /**
         * イニシャル名
         */
        @Schema(description = "イニシャル名")
        String initialName;

        String itOs;

        /**
         * 言語
         */
        @Schema(description = "言語")
        String itGengo;

        String itDb;

        String itWebServer;

        String itFw;

        /**
         * その他
         */
        @Schema(description = "その他")
        String itOther;

        /**
         * 備考及び自己紹介
         */
        @Schema(description = "備考及び自己紹介")
        String itBikou;

        /**
         * 社員コード
         */
        @Schema(description = "社員コード")
        String employeecode;

        String comment;

        /**
         * 金融機関コード
         */
        @Schema(description = "金融機関コード")
        String kinyukikanCode;

        /**
         * 金融機関名
         */
        @Schema(description = "金融機関名")
        String kinyukikanName;

        /**
         * 支店名コード
         */
        @Schema(description = "支店名コード")
        String sitenCode;

        /**
         * 支店名
         */
        @Schema(description = "支店名")
        String sitenName;

        /**
         * 口座種類
         */
        @Schema(description = "口座種類")
        Integer kouzaKind;

        /**
         * 口座番号
         */
        @Schema(description = "口座番号")
        String kouzaNum;

        /**
         * 名義人
         */
        @Schema(description = "名義人")
        Integer meigiName;

        /**
         * 論理削除フラグ
         */
        @Schema(description = "論理削除フラグ")
        Integer deleteFlag;

        /**
         * 更新日
         */
        @Schema(description = "更新日")
        LocalDateTime kousinnbi;

        /**
         * 登録日
         */
        @Schema(description = "登録日")
        LocalDateTime tourokubi;
}