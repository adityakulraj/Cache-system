package com.aditya.cache.api;

public interface EvictionStrategy {

    public void evictFromCache(Cache c);

}
