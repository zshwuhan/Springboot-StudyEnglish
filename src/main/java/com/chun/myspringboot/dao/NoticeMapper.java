package com.chun.myspringboot.dao;

import com.chun.myspringboot.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface NoticeMapper {
    //增加公告
    //删除公告
    //修改公告
    //查看公告所有信息
    List<Notice> queryAllNotice();
    //查看最新公告的内容
    String queryNoticeById();
}
