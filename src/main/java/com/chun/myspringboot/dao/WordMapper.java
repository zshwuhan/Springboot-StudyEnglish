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
     *
     * 四级操作
     *
     *
     */
    //增加单词
    Cet4 addWordCet4(Cet4 cet4);
    //删除单词
    Cet4 delWordCet4(int word4Id);
    //修改单词


    //增加一个认识的单词
    int addWordCet4Remember(int wordId);
    //删除一个认识的单词
    int deleteCet4Remember(int wordId);
    //删除所有认识的单词
    int deleteAllCet4Remember();

    //查询全部cet4单词
    List<Cet4> queryAllWordCet4();
    //根据id查询一个单词
    Cet4 queryWordCet4ById(int wordId);
    //查询四级不会的单词
    Cet4 queryWordCet4Unable();

    //查询四级所有单词数量
    int queryWordCet4Number();
    //查询四级已会单词数量
    int queryWordCet4RememberNumber();


    /**
     * 六级操作
     *
     *
     *
     * @param wordId
     */
    //增加一个认识的单词
    int addWordCet6Remember(int wordId);
    //删除一个认识的单词
    int deleteCet6Remember(int wordId);
    //删除所有认识的单词
    int deleteAllCet6Remember();


    //根据id查询一个单词
    Cet6 queryWordCet6ById(int wordId);



    //查询全部cet6单词
    List<Cet6> queryAllWordCet6();

    //查询六级所有单词数量
    int queryWordCet6Number();

    //查询六级已会单词数量
    int queryWordCet6RememberNumber();
    //查询六级不会的单词
    Cet6 queryWordCet6Unable();
}
