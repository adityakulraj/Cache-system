package com.aditya.cache;

import com.aditya.cache.api.Cache;
import com.aditya.cache.impl.InMemoryCache;

public class Main {


    public static void main(String [] args) {



        Cache c = new InMemoryCache(5);

        c.addToCache("val1");
        c.addToCache("val2");
        c.addToCache("val3");
        c.addToCache("val4");
        c.addToCache("val5");
        c.addToCache("val6");



    }
}
