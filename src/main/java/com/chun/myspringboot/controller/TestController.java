package com.chun.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String Test(){
        System.out.println("进入TEST！！");
        return "book/Test";
    }
}
