/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot
 * @className com.thunisoft.codemonkey.codemonkey.springboot.Swagger2
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月14日 下午7:37:06
 * @version TODO
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
            .apis(RequestHandlerSelectors.basePackage("com.thunisoft.codemonkey.codemonkey.springboot.controller"))
            .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Spring Boot中使用Swagger2构建RESTful APIs")
            .description("更多Spring Boot相关文章请关注：http://thunisoft.com").termsOfServiceUrl("http://blog.didispace.com/")
            .contact("wujch").version("1.0").build();
    }
}
