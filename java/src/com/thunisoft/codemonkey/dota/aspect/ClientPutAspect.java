/**
 * @projectName dota_analyze
 * @package com.thunisoft.codemonkey.dota.cache.ehcache
 * @className com.thunisoft.codemonkey.dota.cache.ehcache.ClientPutAspect
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.dota.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClientPutAspect
 * 
 * @description 客户端切面
 * @author wujch
 * @date 2018年5月10日 下午3:59:20
 * @version 1.0.0
 */
@Aspect
@Component
public class ClientPutAspect {

    @Before("execution(* com.thunisoft.codemonkey.dota.cache.redis.*.*(..))")
    public void before(JoinPoint joinPoint) {
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("before Execute! --class name: " + classname + ", method name: " + methodName + " " + args);
        System.out.println();
    }
}
