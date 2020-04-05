package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    UserServiceImpl userService;

    //根据ID查询用户
    @RequestMapping("/test")
    public User queryUserById(){
        User user = userService.queryUserById(1);
            System.out.println(user);

            return user;
        }



    }


