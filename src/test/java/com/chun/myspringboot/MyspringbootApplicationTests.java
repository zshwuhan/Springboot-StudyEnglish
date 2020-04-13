package com.chun.myspringboot;

import com.chun.myspringboot.dao.WordMapper;
import com.chun.myspringboot.pojo.Cet4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class MyspringbootApplicationTests {

    @Test
    void contextLoads() throws InterruptedException {

        long startTime1=System.currentTimeMillis();
        System.out.println("程序开始时间为："+startTime1+"毫秒");
        String s1="1";
        for(int i=2;i<100000;i++){
            s1+=String.valueOf(i);
        }
        long endTime1=System.currentTimeMillis();
        System.out.println("程序结束时间为："+endTime1+"毫秒");
        System.out.println("String的运行时间为："+(endTime1-startTime1)+"毫秒");

        long startTime2=System.currentTimeMillis();
        System.out.println("程序开始时间为："+startTime2+"毫秒");
        StringBuffer s2=new StringBuffer("1");
        for(int i=2;i<100000;i++){
            s2.append(String.valueOf(i));
        }
        long endTime2=System.currentTimeMillis();
        System.out.println("程序结束时间为："+endTime2+"毫秒");
        System.out.println("StringBuffer的运行时间为："+(endTime2-startTime2)+"毫秒");

    }
}

