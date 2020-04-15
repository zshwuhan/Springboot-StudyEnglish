package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.Cet6;
import com.chun.myspringboot.service.Impl.WordServiceImpl;
import com.chun.myspringboot.util.DataUtils;
import com.chun.myspringboot.util.ProgressUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Cet6Controller {
    @Autowired
    private WordServiceImpl wordService;
    @Autowired
    private ProgressUtils progressUtils;
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
    /**
     * 学习操作
     */
    //第一次进入学习，从数据库中查询不会单词，如何还有不会的就查询出来，如果没有了就提示
    @RequestMapping("/studyWordCet6")
    public String Cet6StudyWord(Model model){
        Cet6 Cet6Unable = wordService.queryWordCet6Unable();
        if (Cet6Unable!=null){
            //查询不认识的单词
            model.addAttribute("Cet6Unable",Cet6Unable);
            System.out.println("查询不认识的四级单词");
            progressUtils.ProgressCet6(model);

            return "word/Cet6-StudyWord";
        }else {
            model.addAttribute("Cet6Unable",Cet6Unable);
            return "main";
        }
    }
    //学习下一个单词
    @RequestMapping("/studyNextWordCet6")
    public String Cet6StudyNextWord(){

        return "redirect:/studyWordCet6";
    }
    // 重新学习四级单词
    @RequestMapping("/ResetWordCet6")
    public String Cet6ResetWord(){
        wordService.deleteAllCet6Remember();
        return "redirect:/studyWordCet6";
    }
    //记住单词该单词，数据库remember记为1，显示解释
    @RequestMapping("/rememberWordCet6/{wordId}")
    public String RememberWordCet6(@PathVariable("wordId") int wordId, Model model){
        System.out.println("进入rememberWordCet6");
        wordService.addWordCet6Remember(wordId);
        Cet6 cet6 = wordService.queryWordCet6ById(wordId);
        model.addAttribute("cet6",cet6);
        progressUtils.ProgressCet6(model);
        return "word/Cet6-RememberWord";
    }


    //第一次忘记，数据库不修改数据，直接显示解释
    @RequestMapping("/unrememberWordCet6/{wordId}")
    public String UnRememberWordCet6(@PathVariable("wordId") int wordId,Model model){
        Cet6 cet6 = wordService.queryWordCet6ById(wordId);
        model.addAttribute("cet6",cet6);
        progressUtils.ProgressCet6(model);
        return "word/Cet6-UnRememberWord";
    }


    //第一次记住，第二次忘记，数据库修改remember为0，继续下个单词学习
    @RequestMapping("/forgetWordCet6/{wordId}")
    public String ForgetWordCet6(@PathVariable("wordId")int wordId,Model model){
        wordService.deleteCet6Remember(wordId);
        System.out.println("已经忘记单词！");
        progressUtils.ProgressCet6(model);
        return "redirect:/studyWordCet6";
    }
}
