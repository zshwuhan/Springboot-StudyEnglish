package com.chun.myspringboot.util;

import com.chun.myspringboot.service.WordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ProgressUtils {
   @Autowired
    WordServiceImpl wordService;

   @Autowired
   DataUtils dataUtils;

   public void ProgressCet4(Model model){
       /**
        * 四级操作
        */
            int Cet4Remember = wordService.queryWordCet4RememberNumber();
            int Cet4Number = wordService.queryWordCet4Number();
            String percent4 = dataUtils.percent(Cet4Remember, Cet4Number);
            String unpercent4 = dataUtils.unpercent(Cet4Remember, Cet4Number);

            model.addAttribute("percent4",percent4);
            model.addAttribute("unpercent4",unpercent4);

            return;
        }

    public void ProgressCet6(Model model){

        /**
         * 六级操作
         */
        int Cet6Number = wordService.queryWordCet6Number();
        int Cet6Remember = wordService.queryWordCet6RememberNumber();
        String percent6 = dataUtils.percent(Cet6Remember, Cet6Number);
        String unpercent6 = dataUtils.unpercent(Cet6Remember, Cet6Number);
        model.addAttribute("percent6",percent6);
        model.addAttribute("unpercent6",unpercent6);

        return;
    }

}
