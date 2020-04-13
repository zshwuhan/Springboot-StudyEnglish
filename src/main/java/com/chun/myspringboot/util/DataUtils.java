package com.chun.myspringboot.util;

import org.springframework.stereotype.Controller;

import java.text.NumberFormat;
@Controller
public class DataUtils {

    //得到百分比数字
    public String percent(float remember,float number){
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到整数位
        numberFormat.setMaximumFractionDigits(1);
        String format = numberFormat.format(remember / number/ 0.01)+"%";
        return format;
    }
    //得到1-百分比数字
    public String unpercent(float remember,float number){
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到整数位
        numberFormat.setMaximumFractionDigits(1);
        String format = numberFormat.format((1-remember / number)/0.01)+"%";
        return format;
    }

}
