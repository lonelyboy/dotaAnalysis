package com.thunisoft.codemonkey.dota.cache.redis.client;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

/**
 * SingleRedisClient
 * 
 * @description redis 单机版的client
 * @author Administrator
 * @date 2018年4月22日 下午3:22:45
 * @version TODO
 */
@Service
public class SingleRedisClient {

    @Autowired
    private RedisCacheManager cacheManger;

    public void stringPut(String key, String value) {
        Collection<String> caches = cacheManger.getCacheNames();
        System.out.println(caches);
        RedisCache cache = (RedisCache)cacheManger.getCache("redisOperations");
        // cache.put(key, value);
        ValueWrapper valueWrapper = cache.get(key);
        Object trueValue = valueWrapper.get();
        System.out.println(String.valueOf(trueValue));
    }
}
