/**
 * @projectName codemonkey.springboot
 * @package com.thunisoft.codemonkey.codemonkey.springboot.dao
 * @className com.thunisoft.codemonkey.codemonkey.springboot.dao.IUserDao
 * @copyright Copyright 2018 Thuisoft, Inc. All rights reserved.
 */
package com.thunisoft.codemonkey.codemonkey.springboot.dao;

import java.util.List;

import com.thunisoft.codemonkey.codemonkey.springboot.bean.User;

/**
 * IUserDao
 * 
 * @description TODO
 * @author wujch
 * @date 2018年5月14日 下午8:45:23
 * @version TODO
 */
public interface IUserDao {
    public List<User> listUsers();
}
