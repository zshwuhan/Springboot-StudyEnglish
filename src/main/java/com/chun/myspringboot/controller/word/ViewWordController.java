package com.chun.myspringboot.controller.word;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import com.chun.myspringboot.service.Impl.WordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ViewWordController {
    @Autowired
    private WordServiceImpl wordService;

    /**
     * 浏览四级单词
     */
    @RequestMapping("/viewWord/cet4")
    public String viewWordCet4(Model model){

        List<Cet4> wordCet4s = wordService.queryAllWordCet4();
        model.addAttribute("WordCet4",wordCet4s);
        model.addAttribute("cet","四级书");
        return "view-word";
    }


    /**
     * 浏览六级单词
     */
    @RequestMapping("/viewWord/cet6")
    public String viewWordCet6(Model model){

        List<Cet6> wordCet6s = wordService.queryAllWordCet6();
        model.addAttribute("WordCet6",wordCet6s);
        model.addAttribute("cet","六级书");
        return "view-word";
    }
}
