package com.bright.star.service.dto;

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


/**
* <p>
* 社員_職歴
* </p>
*
* @since 2023-02-08
*/


@ApiModel(value = "SyainRirekiDTO对象", description = "社員_職歴")
public record SyainRirekiDTO (

     Integer syainId,

        /**
        * 開始日
        */
     LocalDate kaisibi,

        /**
        * 終了日
        */
     LocalDate syuryobi,

        /**
        * 登録日
        */
     LocalDateTime tourokubi,

        /**
        * 更新日
        */
     LocalDateTime kousinnbi,

        /**
        * プロジェクト名
        */
     String pjName,

        /**
        * 対日フラグ
        */
     Integer tainitiFlag,

        /**
        * 場所
        */
     Integer basyo,

        /**
        * 規模
        */
     Integer kibo,

        /**
        * 業種
        */
     Integer gyosyu,

        /**
        * 開発環境
        */
     Integer kaihatukankyo,

        /**
        * 運用環境
        */
     Integer unyoukankyo,

        /**
        * 言語
        */
     String gengo,

     String db,

        /**
        * ツール
        */
     String tool,

        /**
        * 担当
        */
     Integer tantou,

        /**
        * 作業範囲
        */
     Integer sagyohani,

        /**
        * 概要
        */
     String gaiyou
){


}