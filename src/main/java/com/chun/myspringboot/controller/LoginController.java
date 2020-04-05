package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(User user, Model model){
        User usr = userService.loginByEmailAndPasswordAndActiveStatus(user);
        if (usr!=null){
            System.out.println("成功登录");
            return "main";
        }else {
            model.addAttribute("msg","密码或账号输入错误");
            return "index";
        }


    }
}
