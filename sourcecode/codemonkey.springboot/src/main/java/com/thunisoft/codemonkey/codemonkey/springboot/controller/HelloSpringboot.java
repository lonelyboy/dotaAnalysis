/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.controller
 * @className com.thunisoft.codemonkey.controller.HelloSpringboot
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thunisoft.codemonkey.codemonkey.springboot.service.CommonService;

/**
 * HelloSpringboot
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月11日 下午4:41:57
 * @version TODO
 */
@RestController
public class HelloSpringboot {

    @Autowired
    private CommonService commonService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring-boot";
    }

    @RequestMapping("/who")
    public String whoIsCodemonkey() {
        return commonService.whoisCodemonkey();
    }

    @RequestMapping("/exception")
    public void getException() throws Exception {

        throw new Exception("故意的");
    }
}
