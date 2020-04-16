package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.Notice;
import com.chun.myspringboot.pojo.User;
import com.chun.myspringboot.service.Impl.NoticeServiceImpl;
import com.chun.myspringboot.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MainPageController {

    @Autowired
    private NoticeServiceImpl noticeService;
    @Autowired
    private UserServiceImpl userService;

        @RequestMapping("/main.html")
        public String toMainPage(Model model){
            Notice notice = noticeService.queryNewNoticeById();

            model.addAttribute("notice",notice);
            return "main";
        }
        //跳转管理员主页
        @RequestMapping("/admin/main")
        public String toAdminPage(Model model){

            return "admin/main";
        }


}
