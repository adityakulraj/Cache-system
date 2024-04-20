package com.aditya.cache.api;

import com.aditya.cache.model.CacheDAO;
import com.aditya.cache.model.CacheEntry;
import lombok.NonNull;

public interface Cache {

    public String addToCache(@NonNull String val);

    public void removeFromCache(String key);

    public void setEvictionStrategy(EvictionStrategy es);


    public void setCapacity(int capacity);

    public CacheDAO getCacheDAO();


}
