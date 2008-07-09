package com.bright.star.infrastructure.common;

import lombok.Getter;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/4
 * @description
 **/
@Getter
public enum Cate {
    ContactInfo(1, 1, "㈱ブライトスターの情報" ),
    CompanyInfo(1, 2, "㈱ブライトスターの情報" );


    private Integer typeA;

    private Integer typeB;

    private String info;

    Cate(Integer typeA, Integer typeB, String info){
        this.typeA = typeA;
        this.typeB = typeB;
        this.info = info;
    }



}
