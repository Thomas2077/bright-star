package com.bright.star.infrastructure.common;

import cn.hutool.core.util.ReflectUtil;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yanzou
 * @version V1.0.0
 * @date 2023/2/11
 * @description
 **/
public class BeanTools {

    public static <T> T copyProperties(Object source, T target) {
        BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <T> List<T> copyToList(List<?> sourceList, Class<T> target) {
        return sourceList.stream().map(source -> copyProperties(source, ReflectUtil.newInstance(target))).collect(Collectors.toList());
    }

    public static <T> T copyProperties(Object source, Class<T> target) {
        Method[] methods = target.getMethods();
        T res = ReflectUtil.newInstance(target);
        BeanUtils.copyProperties(source, res);
        return res;
    }
}
