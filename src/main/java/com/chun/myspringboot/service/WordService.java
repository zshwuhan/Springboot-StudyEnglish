package com.chun.myspringboot.service;

import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;

import java.util.List;

public interface WordService {

    /**
     * 四级操作
     */

    //查询全部cet4单词
    List<Cet4> queryAllWordCet4();


    /**
     * 六级操作
     */
    //查询全部cet6单词
    List<Cet6> queryAllWordCet6();
}
