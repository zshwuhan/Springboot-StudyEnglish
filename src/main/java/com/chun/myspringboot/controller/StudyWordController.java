package com.chun.myspringboot.controller;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import com.chun.myspringboot.service.WordServiceImpl;
import com.chun.myspringboot.util.DataUtils;
import com.chun.myspringboot.util.ProgressUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyWordController {
    @Autowired
    private WordServiceImpl wordService;

    @Autowired
    private ProgressUtils progressUtils;

    /**
     *
     * ################ 四级操作 #############
     *
     */

    //第一次进入学习，从数据库中查询不会单词，如何还有不会的就查询出来，如果没有了就提示
    @RequestMapping("/studyWordCet4")
    public String Cet4StudyWord(Model model){
        Cet4 Cet4Unable = wordService.queryWordCet4Unable();
        if (Cet4Unable!=null){
            //查询不认识的单词
            model.addAttribute("Cet4Unable",Cet4Unable);
            System.out.println("查询不认识的四级单词");
            progressUtils.ProgressCet4(model);
            System.out.println(Cet4Unable);
            return "word/Cet4-StudyWord";

        }else {//如果没有单词了，给用户提示
            progressUtils.ProgressCet4(model);
            model.addAttribute("msg","恭喜你已经背完单词!请选择其他单词继续学习，或者点击右方按钮重新学习！");
            return "word/Cet4-Empty";
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
    /**
     *
     * ############### 六级操作  #############
     *
     */

    @RequestMapping("/studyWordCet6")
    public String Cet6StudyWord(Model model){
        Cet6 Cet6Unable = wordService.queryWordCet6Unable();
        if (Cet6Unable!=null){
            //查询不认识的单词
            model.addAttribute("Cet6Unable",Cet6Unable);
            System.out.println("查询不认识的四级单词");
            progressUtils.ProgressCet6(model);
            System.out.println(Cet6Unable);
            return "word/Cet6-StudyWord";

        }else {
            model.addAttribute("Cet6Unable",Cet6Unable);
            return "main";
        }
    }

    @RequestMapping("/studyNextWordCet6")
    public String Cet6StudyNextWord(){

        return "redirect:/studyWordCet6";
    }
}
