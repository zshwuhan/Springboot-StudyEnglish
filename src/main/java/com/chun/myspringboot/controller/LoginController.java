package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userService;

    /**
     *登录成功，添加session
     */
    @RequestMapping("/login")
    public String login(User user, Model model,HttpSession session){
        User usr = userService.loginByEmailAndPasswordAndActiveStatus(user);
        if (usr!=null){
            session.setAttribute("loginUser",user);
            System.out.println("成功登录");
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","密码或账号输入错误");
            return "index";
        }
    }

    /**
     * 注销
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }

}
