package com.chun.myspringboot.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyWordController {
    @RequestMapping("/studyword")
    public String toStudyWord(Model model){



        
        return "word/study-word";
    }

}
