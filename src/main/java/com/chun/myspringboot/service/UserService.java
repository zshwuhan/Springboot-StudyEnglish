package com.chun.myspringboot.service;

import com.chun.myspringboot.pojo.User;

public interface UserService {
    //根据Id查询用户
    User queryUserById(int userId);

    //根据激活码查询用户
     User queryUserByActiveCode(String activeCode);
    //根据邮箱密码与状态码登录
    User loginByEmailAndPasswordAndActiveStatus(User user);

    //增加用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

}
