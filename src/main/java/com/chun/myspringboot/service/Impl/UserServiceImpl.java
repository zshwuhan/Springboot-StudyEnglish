package com.chun.myspringboot.service.Impl;

import com.chun.myspringboot.dao.UserMapper;
import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    @Override
    public User queryUserById(int userId) {
        return  userMapper.queryUserById(userId);
    }

    @Override
    public User queryUserByActiveCode(String activeCode) {
        return userMapper.queryUserByActiveCode(activeCode);
    }

    @Override
    public User loginByEmailAndPasswordAndActiveStatus(User user) {
        return userMapper.loginByEmailAndPasswordAndActiveStatus(user);
    }

    @Override
    public User AdminLogin(User user) {
        return userMapper.AdminLogin(user);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int updateUserName(User user) {
        return userMapper.updateUserName(user);
    }


}
