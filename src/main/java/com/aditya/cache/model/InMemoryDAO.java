package com.aditya.cache.model;

import java.util.Map;

public class InMemoryDAO extends CacheDAO {


    public InMemoryDAO(Map<String, CacheEntry<String>> inMemoryMap) {
        super(inMemoryMap);
    }


}
