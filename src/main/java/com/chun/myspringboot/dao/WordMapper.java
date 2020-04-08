package com.chun.myspringboot.dao;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordMapper {

    /**
     * 四级操作
     */

    //增加单词
    Cet4 addWordCet4(Cet4 cet4);
    //删除单词
    Cet4 delWordCet4(int word4Id);
    //修改单词

    //查询全部cet4单词
    List<Cet4> queryAllWordCet4();

    //根据id查询一个单词
    Cet4 queryWordCet4ById(int word4Id);

    /**
     * 六级操作
     */
    //查询全部cet4单词
    List<Cet6> queryAllWordCet6();
}
