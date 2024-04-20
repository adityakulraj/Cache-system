package com.aditya.cache.impl;

import com.aditya.cache.api.EvictionStrategy;
import lombok.Getter;

import java.util.HashMap;

public class EvictionStrategyFactory {

    @Getter
    public EvictionStrategy evictionStrategy;


    public EvictionStrategyFactory(String es) {
        if("default".equals(es))
            evictionStrategy = new LeastRecentlyUsedStrategy(new HashMap<>());

    }
}
