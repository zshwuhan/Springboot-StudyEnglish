package com.chun.myspringboot.service.Impl;

import com.chun.myspringboot.dao.WordMapper;
import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import com.chun.myspringboot.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordMapper wordMapper;



    /**
     * 四级操作
     *
     *
     */
    @Override
    public List<Cet4> queryAllWordCet4() {
        return wordMapper.queryAllWordCet4();
    }

    @Override
    public Cet4 queryWordCet4ById(int wordId) {
        return wordMapper.queryWordCet4ById(wordId);
    }

    @Override
    public int queryWordCet4Number() {
        return wordMapper.queryWordCet4Number();
    }

    @Override
    public int queryWordCet4RememberNumber() {
        return wordMapper.queryWordCet4RememberNumber();
    }

    @Override
    public Cet4 queryWordCet4Unable() {
        return wordMapper.queryWordCet4Unable();
    }



    @Override
    public int addWordCet4Remember(int wordId) {
        return wordMapper.addWordCet4Remember(wordId);
    }

    @Override
    public int deleteCet4Remember(int wordId) {
        return wordMapper.deleteCet4Remember(wordId);
    }

    @Override
    public int deleteAllCet4Remember() {
        return wordMapper.deleteAllCet4Remember();
    }


    /**
     * 六级操作
     *
     *
     */

    @Override
    public List<Cet6> queryAllWordCet6() {
        return wordMapper.queryAllWordCet6();
    }

    @Override
    public int queryWordCet6Number() {
        return wordMapper.queryWordCet6Number();
    }

    @Override
    public int queryWordCet6RememberNumber() {
        return wordMapper.queryWordCet6RememberNumber();
    }

    @Override
    public Cet6 queryWordCet6Unable() {
        return wordMapper.queryWordCet6Unable();
    }
    @Override
    public int addWordCet6Remember(int wordId) {
        return wordMapper.addWordCet6Remember(wordId);
    }

    @Override
    public int deleteCet6Remember(int wordId) {
        return wordMapper.deleteCet6Remember(wordId);
    }

    @Override
    public int deleteAllCet6Remember() {
        return wordMapper.deleteAllCet6Remember();
    }

    @Override
    public Cet6 queryWordCet6ById(int wordId) {
        return wordMapper.queryWordCet6ById(wordId);
    }
}
