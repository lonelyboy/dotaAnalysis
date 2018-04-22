package com.thunisoft.codemonkey.dota.cache;

import com.alibaba.fastjson.JSONObject;

/**
 * IJsonCacheClient
 * 
 * @description json 的缓存操作client
 * @author Administrator
 * @date 2018年4月22日 下午4:41:08
 * @version TODO
 */
public interface IJsonCacheClient {

    /**
     * IJsonCacheClient
     * 
     * @description 插入json
     * @param key
     * @param json
     * @author Administrator
     * @date 2018年4月22日 下午4:46:23
     * @version TODO
     */
    public void putJson(String key, JSONObject json);

    /**
     * IJsonCacheClient
     * 
     * @description 获取json
     * @param key
     * @return
     * @author Administrator
     * @date 2018年4月22日 下午4:50:05
     * @version TODO
     */
    public JSONObject getJson(String key);

    /**
     * IJsonCacheClient
     * 
     * @description 获取json 的某个属性的value
     * @param key
     * @param propertyName
     * @return
     * @author Administrator
     * @date 2018年4月22日 下午4:56:16
     * @version TODO
     */
    public Object getProperty(String key, String propertyName);
}
