package com.aditya.cache.impl;

import com.aditya.cache.api.EvictionStrategy;
import com.aditya.cache.model.CacheDAO;
import lombok.Getter;

import java.util.HashMap;

public class EvictionStrategyFactory {

    @Getter
    public EvictionStrategy evictionStrategy;


    public EvictionStrategyFactory(String es, CacheDAO cd) {
        if("default".equals(es))
            evictionStrategy = new LeastRecentlyUsedStrategy(cd.getDataStructure());

    }
}
