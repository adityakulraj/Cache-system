package com.aditya.cache.impl;

import com.aditya.cache.api.Cache;
import com.aditya.cache.api.EvictionStrategy;
import com.aditya.cache.model.CacheEntry;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

//This LRU code can be optimised using doubly linked list. Not doing that right now, using brute force.
public class LeastRecentlyUsedStrategy implements EvictionStrategy {


    @Getter
    @Setter
    public Map<String, CacheEntry<String>> inMemoryMap;

    public LeastRecentlyUsedStrategy(Map<String, CacheEntry<String>> inMemoryMap) {
        this.inMemoryMap = inMemoryMap;

    }


    @Override
    public void evictFromCache(Cache c) {

        long minTime = Long.MAX_VALUE;
        String keyToRemove = null;

        for(String s : inMemoryMap.keySet()) {
            long currTime = inMemoryMap.get(s).getTimestamp().getTime();
            if(currTime<minTime) {
                minTime = currTime;
                keyToRemove = s;
            }

        }

        System.out.println("Removed from cache value : "+ inMemoryMap.get(keyToRemove).getValue());
        inMemoryMap.remove(keyToRemove);



    }
}
