package com.bright.star.infrastructure.access;

import com.bright.star.infrastructure.auth.Role;

import java.lang.annotation.*;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/12
 * @description
 **/
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessLog {

    String pageId() default "";

    String testId() default "";

    Role role() default Role.USER;
}
