package com.chun.myspringboot.service;

import com.chun.myspringboot.pojo.Notice;

import java.util.List;

public interface NoticeService {
    //查看公告所有信息
    List<Notice> queryAllNotice();
    //查看最新公告的内容
    String queryNoticeById();
}
