package com.chun.myspringboot.service;

import com.chun.myspringboot.dao.NoticeMapper;
import com.chun.myspringboot.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> queryAllNotice() {
        return noticeMapper.queryAllNotice();
    }

    @Override
    public String queryNoticeById() {
        return noticeMapper.queryNoticeById();
    }
}
