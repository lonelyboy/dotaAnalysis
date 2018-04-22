package com.thunisoft.codemonkey.dota.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thunisoft.codemonkey.dota.cache.redis.client.SingleRedisClient;
import com.thunisoft.codemonkey.dota.mapper.HeroMapper;

/**
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HeroMapper heroMapper;
    @Autowired
    private SingleRedisClient singleRedisClient;

    @RequestMapping("/test")
    @ResponseBody
    public String testController() {
        List<Map> result = heroMapper.selectall();
        System.out.println("I am in ");
        return "success";
    }

    @RequestMapping("/testredis")
    @ResponseBody
    public String testRedis() {
        singleRedisClient.stringPut("test", "value");
        return "success";
    }
}
