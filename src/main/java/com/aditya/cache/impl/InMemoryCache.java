package com.aditya.cache.impl;

import com.aditya.cache.api.Cache;
import com.aditya.cache.api.EvictionStrategy;
import com.aditya.cache.model.CacheDAO;
import com.aditya.cache.model.CacheEntry;
import com.aditya.cache.model.InMemoryDAO;
import lombok.Getter;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryCache implements Cache {

    @Getter
    private CacheDAO inMemoryDAO;

    int capacity;

    EvictionStrategy es;


    public InMemoryCache(int capacity) {
        inMemoryDAO = new InMemoryDAO(new HashMap<>());
        es = new LeastRecentlyUsedStrategy(inMemoryDAO.getDataStructure());
        this.capacity = capacity;
    }



    @Override
    public String addToCache(@NonNull String val) {
        if(inMemoryDAO.getDataStructure().size()<capacity) {
            String key = UUID.randomUUID().toString();
            inMemoryDAO.getDataStructure().put(key, new CacheEntry<>(val));
            System.out.println("Added to cache value : "+ val);
            return key;
        }

        else {
            es.evictFromCache(this);
            return addToCache(val);
        }

    }


    @Override
    public void removeFromCache(@NonNull String key) {

        inMemoryDAO.getDataStructure().remove(key);

    }

    @Override
    public void setEvictionStrategy(EvictionStrategy es) {
        this.es = es;

    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;

    }

    @Override
    public CacheDAO getCacheDAO() {
        return inMemoryDAO;
    }
}
