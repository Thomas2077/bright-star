package com.bright.star.infrastructure.domain;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {

    /**
     * Entities compare by identity, not by attributes.
     * @param other The other entity.
     * @return true if the identities are the same, regardless of other attributes.
     */
    boolean sameValueAs(T other);
}
