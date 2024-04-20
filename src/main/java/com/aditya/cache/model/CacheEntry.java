package com.aditya.cache.model;


import lombok.Getter;

import java.sql.Timestamp;
import java.util.UUID;

public class CacheEntry<T> {


    @Getter
    private final T value;

    @Getter
    private final Timestamp timestamp;

    public CacheEntry(T value) {
        this.value = value;
        this.timestamp = new Timestamp(System.currentTimeMillis());

    }


}
