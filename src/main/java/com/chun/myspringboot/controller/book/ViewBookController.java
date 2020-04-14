package com.chun.myspringboot.controller.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewBookController {
    @RequestMapping("/viewbook")
    public String ViewBook(){
        return "book/select-book";
    }
}
