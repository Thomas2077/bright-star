package com.bright.star.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * TorihikisakiMainDTO对象
 * </p>
 *
 * @since 2023-02-08
 */
@Data
@Schema(description = "TorihikisakiMainDTO对象")
public class TorihikisakiMainDTO{

        /**
         * 自動連番
         */
        Integer torihikiId;

        @NotNull
        String torihikiNameAll;

        @NotNull
        String torihikiNameRyaku;

        String yuubin;

        /**
         * 住所1
         */
        @NotNull
        String jyusyo1;

        /**
         * 住所2
         */
        @NotNull
        String jyusyo2;

        String tel;

        String fax;

        String url;

        /**
         * 備考
         */
        String bikou;

        /**
         * 論理削除　0:有効　1:削除
         */
        Integer deleteFlag;

        /**
         * 請求書の郵送有無　0：無し　1：有り
         */
        Integer seikyusyoKubun1;

        /**
         * 特定ファイル名　0：無し　1：有り
         */
        Integer seikyusyoKubun2;

        /**
         * 案件名請求　0：無し　1：有り
         */
        Integer seikyusyoKubun3;

        /**
         * 納品書付き　0：無し　1：有り
         */
        Integer seikyusyoKubun4;

        /**
         * 請求書の提供　0：無し　1：本体　2：フォーマット
         */
        Integer seikyusyoKubun5;

        /**
         * 請求単位　0：会社別　1：作業員別／案件名別　2：現場別　3：職部別
         */
        Integer seikyusyoKubun6;

        String seikyusyoKubun7;

        String seikyusyoKubun8;

        String seikyusyoKubun9;

        String seikyusyoKubun10;

        String seikyusyoKubun11;

        /**
         * 本社指定
         */
        Integer honsya;

        /**
         * 本社口座
         */
        Integer honsyaKouza;

        /**
         * 金融機関コード
         */
        String kinyukikanCode;

        /**
         * 金融機関
         */
        String kinyukikanName;

        /**
         * 支店名コード
         */
        String sitenCode;

        /**
         * 支店
         */
        String sitenName;

        /**
         * 1:普通　2:当座
         */
        Integer kouzaKind;

        /**
         * 口座番号
         */
        String kouzaNum;

        /**
         * 名義人
         */
        String meigiName;

        LocalDateTime tourokubi;

        LocalDateTime kousinnbi;
}