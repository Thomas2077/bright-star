package com.bright.star.infrastructure.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
@Getter
@AllArgsConstructor
public enum Role {

    USER("1", "用户");

    private String name;
    private String description;


}
