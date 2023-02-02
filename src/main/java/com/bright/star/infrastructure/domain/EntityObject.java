package com.bright.star.infrastructure.domain;

/**
 * @author yanzou
 * @date 2023/2/3
 **/
public interface EntityObject<T> {

    /**
     * Value objects compare by the values of their attributes, they don't have an identity.
     * @param other
     * @return
     */
    boolean sameValueAs(T other);
}
