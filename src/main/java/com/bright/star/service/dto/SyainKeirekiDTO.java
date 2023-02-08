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
* 社員マスタ_経歴
* </p>
*
* @since 2023-02-08
*/


@ApiModel(value = "SyainKeirekiDTO对象", description = "社員マスタ_経歴")

public record SyainKeirekiDTO (

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
        * プロジェクト名
        */
     String pjName,

        /**
        * 対日かどうか
        */
     Integer tainitiFlag,

        /**
        * 開発場所
        */
     Integer basyo,

        /**
        * 開発規模
        */
     Integer kibo,

        /**
        * 開発業種
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
        * FW・IDE・ツール
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
        * 開発概要
        */
     String gaiyou,

        /**
        * 登録日
        */
     LocalDateTime tourokubi,

        /**
        * 更新日
        */
     LocalDateTime kousinnbi
){


}