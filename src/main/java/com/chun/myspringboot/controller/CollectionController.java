package com.chun.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectionController {
    @RequestMapping("toCollection")
    public String toCollection(){
        return "user/collection";
    }
}
