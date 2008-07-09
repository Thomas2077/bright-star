package com.bright.star.infrastructure.common.result;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    public static final String CREATE_TIME = "gmtCreate";

    public static final String UPDATE_TIME = "gmtModified";

    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject.hasGetter(CREATE_TIME)) {
            this.setFieldValByName(CREATE_TIME, LocalDateTime.now(), metaObject);
        }
        if (metaObject.hasGetter(UPDATE_TIME)) {
            this.setFieldValByName(UPDATE_TIME, LocalDateTime.now(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject.hasGetter(UPDATE_TIME)) {
            this.setFieldValByName(UPDATE_TIME, LocalDateTime.now(), metaObject);
        }
    }
}