package com.chun.myspringboot.pojo;

import lombok.Data;

import java.util.Date;

@Data

public class Notice {
    private int noticeId;
    private String content;
    private Date creatTime;


    public Notice(int noticeId,String content,Date creatTime){
        this.noticeId=noticeId;
        this.content=content;
        //默认日期
        this.creatTime=new Date();
    }
}
