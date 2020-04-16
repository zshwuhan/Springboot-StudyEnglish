package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;
    //用户自己修改名字
    //接收前端传来的字符串
    @RequestMapping("/getStringParam/{newname}")
    public String getStringParam(@PathVariable("newname") String newName, HttpSession session){
       //从session中拿到用户，修改session的姓名
        User loginUser = (User) session.getAttribute("loginUser");
        loginUser.setUserName(newName);
        //修改数据库中的名字
        userService.updateUserName(loginUser);


        return "redirect:/main.html";
    }
}
