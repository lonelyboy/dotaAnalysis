package com.thunisoft.codemonkey.dota.cache.redis.client;

import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;
import com.thunisoft.codemonkey.dota.cache.IJsonCacheClient;

/**
 * JSONRedisClient
 * 
 * @description redis 操作json
 * @author Administrator
 * @date 2018年4月22日 下午4:39:51
 * @version TODO
 */
public class JSONRedisClient implements IJsonCacheClient {

    @Override
    public void putJson(String key, JSONObject json) {
        // TODO Auto-generated method stub
        // TODO 分为两步 一步是按照属性保存
        if (null == json) {
            return;
        }
        Set<Entry<String, Object>> entrys = json.entrySet();
        // TODO 按照全部json保存
    }

    @Override
    public JSONObject getJson(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getProperty(String key, String propertyName) {
        // TODO Auto-generated method stub
        return null;
    }

}
