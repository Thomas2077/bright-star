package com.bright.star.infrastructure.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

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
@TableName("torihikisaki_main")
@Schema(description = "TorihikisakiMain对象")
public
class TorihikisakiMain extends Model<TorihikisakiMain> {

    private static final long serialVersionUID = 1L;

    /**
     * 自動連番
     */
    @Schema(description = "自動連番")
    @TableField("TORIHIKI_ID")
    private Integer torihikiId;

    @TableField("TORIHIKI_NAME_ALL")
    private String torihikiNameAll;

    @TableField("TORIHIKI_NAME_RYAKU")
    private String torihikiNameRyaku;

    @TableField("YUUBIN")
    private String yuubin;

    /**
     * 住所1
     */
    @Schema(description = "住所1")
    @TableField("JYUSYO_1")
    private String jyusyo1;

    /**
     * 住所2
     */
    @Schema(description = "住所2")
    @TableField("JYUSYO_2")
    private String jyusyo2;

    @TableField("TEL")
    private String tel;

    @TableField("FAX")
    private String fax;

    @TableField("URL")
    private String url;

    /**
     * 備考
     */
    @Schema(description = "備考")
    @TableField("BIKOU")
    private String bikou;

    /**
     * 論理削除　0:有効　1:削除
     */
    @Schema(description = "論理削除　0:有効　1:削除")
    @TableField("DELETE_FLAG")
    private Integer deleteFlag;

    /**
     * 請求書の郵送有無　0：無し　1：有り
     */
    @Schema(description = "請求書の郵送有無　0：無し　1：有り")
    @TableField("SEIKYUSYO_KUBUN_1")
    private Integer seikyusyoKubun1;

    /**
     * 特定ファイル名　0：無し　1：有り
     */
    @Schema(description = "特定ファイル名　0：無し　1：有り")
    @TableField("SEIKYUSYO_KUBUN_2")
    private Integer seikyusyoKubun2;

    /**
     * 案件名請求　0：無し　1：有り
     */
    @Schema(description = "案件名請求　0：無し　1：有り")
    @TableField("SEIKYUSYO_KUBUN_3")
    private Integer seikyusyoKubun3;

    /**
     * 納品書付き　0：無し　1：有り
     */
    @Schema(description = "納品書付き　0：無し　1：有り")
    @TableField("SEIKYUSYO_KUBUN_4")
    private Integer seikyusyoKubun4;

    /**
     * 請求書の提供　0：無し　1：本体　2：フォーマット
     */
    @Schema(description = "請求書の提供　0：無し　1：本体　2：フォーマット")
    @TableField("SEIKYUSYO_KUBUN_5")
    private Integer seikyusyoKubun5;

    /**
     * 請求単位　0：会社別　1：作業員別／案件名別　2：現場別　3：職部別
     */
    @Schema(description = "請求単位　0：会社別　1：作業員別／案件名別　2：現場別　3：職部別")
    @TableField("SEIKYUSYO_KUBUN_6")
    private Integer seikyusyoKubun6;

    @TableField("SEIKYUSYO_KUBUN_7")
    private String seikyusyoKubun7;

    @TableField("SEIKYUSYO_KUBUN_8")
    private String seikyusyoKubun8;

    @TableField("SEIKYUSYO_KUBUN_9")
    private String seikyusyoKubun9;

    @TableField("SEIKYUSYO_KUBUN_10")
    private String seikyusyoKubun10;

    @TableField("SEIKYUSYO_KUBUN_11")
    private String seikyusyoKubun11;

    /**
     * 本社指定
     */
    @Schema(description = "本社指定")
    @TableField("HONSYA")
    private Integer honsya;

    /**
     * 本社口座
     */
    @Schema(description = "本社口座")
    @TableField("HONSYA_KOUZA")
    private Integer honsyaKouza;

    /**
     * 金融機関コード
     */
    @Schema(description = "金融機関コード")
    @TableField("KINYUKIKAN_CODE")
    private String kinyukikanCode;

    /**
     * 金融機関
     */
    @Schema(description = "金融機関")
    @TableField("KINYUKIKAN_NAME")
    private String kinyukikanName;

    /**
     * 支店名コード
     */
    @Schema(description = "支店名コード")
    @TableField("SITEN_CODE")
    private String sitenCode;

    /**
     * 支店
     */
    @Schema(description = "支店")
    @TableField("SITEN_NAME")
    private String sitenName;

    /**
     * 1:普通　2:当座
     */
    @Schema(description = "1:普通　2:当座")
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
    private String meigiName;

    @TableField("TOUROKUBI")
    private LocalDateTime tourokubi;

    @TableField("KOUSINNBI")
    private LocalDateTime kousinnbi;


    @Override
    public Serializable pkVal() {
        return null;
    }

}