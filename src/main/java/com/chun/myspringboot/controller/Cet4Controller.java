package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.service.Impl.WordServiceImpl;
import com.chun.myspringboot.util.ProgressUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import java.util.List;

@Controller
public class Cet4Controller {
    @Autowired
    private WordServiceImpl wordService;

    @Autowired
    private ProgressUtils progressUtils;
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
     * 学习操作
     */
    //第一次进入学习，
    @RequestMapping("/studyWordCet4")
    public String Cet4StudyWord(Model model){
        //从数据库中查询不会单词，如何还有不会的就查询出来，如果没有了就提示
        Cet4 Cet4Unable = wordService.queryWordCet4Unable();
        if (Cet4Unable!=null){
            //显示单词
            model.addAttribute("Cet4Unable",Cet4Unable);
            progressUtils.ProgressCet4(model);

            //查询是否收藏过单词
            Integer collection = Cet4Unable.getCollection();
            if (collection==0 ){
                model.addAttribute("msg","加入收藏");
            }else {
                model.addAttribute("msg","已经收藏");
            }

            return "user/word/Cet4-StudyWord";

        }else {//如果没有单词了，给用户提示
            progressUtils.ProgressCet4(model);
            model.addAttribute("msg","恭喜你已经背完单词!请选择其他单词继续学习，或者点击右方按钮重新学习！");
            return "user/word/Cet4-Empty";
        }

    }

    //学习下一个单词
    @RequestMapping("/studyNextWordCet4")
    public String Cet4StudyNextWord(){

        return "redirect:/studyWordCet4";
    }
    // 重新学习四级单词
    @RequestMapping("/ResetWordCet4")
    public String Cet4ResetWord(){
        wordService.deleteAllCet4Remember();
        return "redirect:/studyWordCet4";
    }

   //记住单词
   //记住单词该单词，数据库remember记为1，显示解释
   @RequestMapping("/rememberWordCet4/{wordId}")
   public String RememberWordCet4(@PathVariable("wordId") int wordId, Model model){
       System.out.println("进入rememberWordCet4");
       wordService.addWordCet4Remember(wordId);
       Cet4 cet4 = wordService.queryWordCet4ById(wordId);
       model.addAttribute("cet4",cet4);
       progressUtils.ProgressCet4(model);

       return "user/word/Cet4-RememberWord";
   }


    //第一次忘记，数据库不修改数据，直接显示解释
    @RequestMapping("/unrememberWordCet4/{wordId}")
    public String UnRememberWordCet4(@PathVariable("wordId") int wordId,Model model){
        Cet4 cet4 = wordService.queryWordCet4ById(wordId);
        model.addAttribute("cet4",cet4);
        progressUtils.ProgressCet4(model);
        return "user/word/Cet4-UnRememberWord";
    }


    //第一次记住，第二次忘记，数据库修改remember为0，继续下个单词学习
    @RequestMapping("/forgetWordCet4/{wordId}")
    public String ForgetWordCet4(@PathVariable("wordId")int wordId,Model model){
        wordService.deleteCet4Remember(wordId);
        System.out.println("已经忘记单词！");
        progressUtils.ProgressCet4(model);
        return "redirect:/studyWordCet4";
    }

    //加入收藏夹
    @RequestMapping("/addCollection/{wordId}")
    public String AddCollection(@PathVariable("wordId")int wordId,Model model){
        //先看看这个单词是不是已经收藏了

        Cet4 Cet4Unable = wordService.queryWordCet4ById(wordId);
        //显示单词
        model.addAttribute("Cet4Unable",Cet4Unable);
        progressUtils.ProgressCet4(model);
        //如果没有收藏过，则收藏

        if (Cet4Unable.getCollection()==0 ){
            wordService.addCollection(wordId);
            System.out.println("加入收藏");
            model.addAttribute("msg","加入成功");
        }else {//收藏过了，则取消收藏
            wordService.deleteCollection(wordId);
            model.addAttribute("msg","取消成功");
        }


        return "user/word/Cet4-StudyWord";
    }

}