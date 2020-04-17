package com.chun.myspringboot.controller;

import com.chun.myspringboot.service.Impl.WordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CollectionController {
    @Autowired
    WordServiceImpl wordService;

    //去收藏页面
    @RequestMapping("/toCollection")
    public String toCollection(){
        return "user/collection";
    }

    //去单词收藏
    @RequestMapping("/word-collection")
    public String wordCollection(){



        return "user/word/collection-word";
    }
}
