package com.chun.myspringboot.controller;

import com.chun.myspringboot.service.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainPageController {
    @Autowired
    private NoticeServiceImpl noticeService;
        @RequestMapping("/main.html")
        public String toMainPage(Model model){
            String notice = noticeService.queryNoticeById();
            model.addAttribute("notice",notice);
            return "main";
        }

}
