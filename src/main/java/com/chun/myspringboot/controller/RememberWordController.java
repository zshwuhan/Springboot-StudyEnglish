package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import com.chun.myspringboot.service.WordServiceImpl;
import com.chun.myspringboot.util.ProgressUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RememberWordController {
    @Autowired
    WordServiceImpl wordService;
    @Autowired
    private ProgressUtils progressUtils;

    /**
     *记住单词
     * 数据库remember记为1
     * 显示解释
     */
    @RequestMapping("/rememberWordCet4/{wordId}")
    public String RememberWordCet4(@PathVariable("wordId") int wordId, Model model){
        System.out.println("进入rememberWordCet4");
        wordService.addWordCet4Remember(wordId);
        Cet4 cet4 = wordService.queryWordCet4ById(wordId);
        model.addAttribute("cet4",cet4);
        progressUtils.ProgressCet4(model);
        System.out.println(cet4);
        return "word/Cet4-RememberWord";
    }




    /**
     * 第一次忘记，
     * 数据库不修改数据
     * 直接显示解释
     *
     */
    @RequestMapping("/unrememberWordCet4/{wordId}")
    public String UnRememberWordCet4(@PathVariable("wordId") int wordId,Model model){
        Cet4 cet4 = wordService.queryWordCet4ById(wordId);
        model.addAttribute("cet4",cet4);
        progressUtils.ProgressCet4(model);
        return "word/Cet4-UnRememberWord";
    }


    /**
     *第二次忘记
     *数据库修改remember为0
     *继续下个单词学习
     */
    @RequestMapping("/forgetWordCet4/{wordId}")
    public String ForgetWordCet4(@PathVariable("wordId")int wordId,Model model){
        wordService.deleteCet4Remember(wordId);
        System.out.println("已经忘记单词！");
        progressUtils.ProgressCet4(model);
        return "redirect:/studyWordCet4";
    }

    /**
     * 六级操作
     */

    @RequestMapping("/rememberWordCet6/{wordId}")
    public String RememberWordCet6(@PathVariable("wordId") int wordId, Model model){
        System.out.println("进入rememberWordCet6");
        wordService.addWordCet6Remember(wordId);
        Cet6 cet6 = wordService.queryWordCet6ById(wordId);
        model.addAttribute("cet6",cet6);
        progressUtils.ProgressCet6(model);
        System.out.println(cet6);
        return "word/Cet6-RememberWord";
    }




    /**
     * 第一次忘记，
     */
    @RequestMapping("/unrememberWordCet6/{wordId}")
    public String UnRememberWordCet6(@PathVariable("wordId") int wordId,Model model){
        Cet6 cet6 = wordService.queryWordCet6ById(wordId);
        model.addAttribute("cet6",cet6);
        progressUtils.ProgressCet6(model);
        return "word/Cet6-UnRememberWord";
    }


    /**
     *第二次忘记
     */
    @RequestMapping("/forgetWordCet6/{wordId}")
    public String ForgetWordCet6(@PathVariable("wordId")int wordId,Model model){
        wordService.deleteCet6Remember(wordId);
        System.out.println("已经忘记单词！");
        progressUtils.ProgressCet6(model);
        return "redirect:/studyWordCet6";
    }
}
