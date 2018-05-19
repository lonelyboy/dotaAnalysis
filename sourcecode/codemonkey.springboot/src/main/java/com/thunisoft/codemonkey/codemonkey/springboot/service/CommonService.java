/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot.service
 * @className com.thunisoft.codemonkey.codemonkey.springboot.service.CommonService
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * CommonService
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月11日 下午5:11:47
 * @version 1.0.0
 */
@Component
public class CommonService {

    @Value("${thunisoft.codemonkey.name}")
    private String codemonke;

    public String whoisCodemonkey() {
        return codemonke;
    }
}
