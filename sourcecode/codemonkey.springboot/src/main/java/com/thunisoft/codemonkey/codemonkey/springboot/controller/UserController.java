/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot.controller
 * @className com.thunisoft.codemonkey.codemonkey.springboot.controller.UserController
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thunisoft.codemonkey.codemonkey.springboot.bean.User;
import com.thunisoft.codemonkey.codemonkey.springboot.cache.UserCache;

/**
 * UserController
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月11日 下午6:23:46
 * @version TODO
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserCache sserCache;

	@ApiOperation(value = "获取用户列表", notes = "获取所有的用户")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        User user = new User();
        user.setId("123456");
        user.setName("codemonkey");
        List<User> users = new ArrayList<User>();
        users.add(user);
        return users;
    }

	@ApiOperation(value = "获取用户信息", notes = "根据ID获取用户信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable String id) {
        System.out.println(id);
        User user = new User();
        user.setId("123456");
        user.setName("codemonkey");
        sserCache.putString("123456", "codemonkey");
        return user;
    }

    @RequestMapping(value = "/putUser", method = RequestMethod.POST)
    public void putUser(@ModelAttribute User user) {
        System.out.println(user.getId());
    }

}
