package com.aditya.cache.model;

import lombok.Getter;

import java.util.Map;

public abstract class CacheDAO {

    private final Map<String, CacheEntry<String>> inMemoryMap;


    public CacheDAO(Map<String, CacheEntry<String>> inMemoryMap) {
        this.inMemoryMap = inMemoryMap;
    }


    public Map<String, CacheEntry<String>> getDataStructure() {
        return inMemoryMap;
    }




}
