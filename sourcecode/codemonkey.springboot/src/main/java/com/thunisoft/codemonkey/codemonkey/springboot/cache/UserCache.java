/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot.cache
 * @className com.thunisoft.codemonkey.codemonkey.springboot.cache.UserCache
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * UserCache
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月14日 下午9:16:48
 * @version TODO
 */
@Component
public class UserCache {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void putString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }
}
