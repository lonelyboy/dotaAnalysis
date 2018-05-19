/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot
 * @className com.thunisoft.codemonkey.codemonkey.springboot.Test
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月11日 下午4:52:35
 * @version TODO
 */
@RestController
public class Test {
    @RequestMapping("/sayhello")
    public String hello() {
        return "save hello";
    }
}
