/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot.controllertest
 * @className com.thunisoft.codemonkey.codemonkey.springboot.controllertest.HelloTest
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.controllertest;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.thunisoft.codemonkey.codemonkey.springboot.controller.HelloSpringboot;

/**
 * HelloTest
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月11日 下午4:56:39
 * @version TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class HelloTest {
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloSpringboot()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
            .andExpect(content().string(equalTo("hello spring-boot")));
    }
}
