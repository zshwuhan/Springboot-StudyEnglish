package com.chun.myspringboot.service.Impl;

import com.chun.myspringboot.mapper.WordMapper;
import com.chun.myspringboot.pojo.Word;
import com.chun.myspringboot.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordMapper wordMapper;

    @Override
    public int addWord(Word word) {
        return wordMapper.addWord(word);
    }

    @Override
    public int deleteWord(Integer wordId) {
        return wordMapper.deleteWord(wordId);
    }

    @Override
    public int updateWord(Integer wordId) {
        return wordMapper.updateWord(wordId);
    }

    @Override
    public int updateWordStudy1(Integer wordId) {
        return wordMapper.updateWordStudy1(wordId);
    }

    @Override
    public int updateWordStudy0(Integer wordId) {
        return wordMapper.updateWordStudy0(wordId);
    }

    @Override
    public int updateWordRemember1(Integer wordId) {
        return wordMapper.updateWordRemember1(wordId);
    }

    @Override
    public int updateWordRemember0(Integer wordId) {
        return wordMapper.updateWordRemember0(wordId);
    }




    @Override
    public int updateWordCollection1(Integer wordId) {
        return wordMapper.updateWordCollection1(wordId);
    }

    @Override
    public int updateWordCollection0(Integer wordId) {
        return wordMapper.updateWordCollection0(wordId);
    }

    @Override
    public List<Word> queryAllWord() {
        return wordMapper.queryAllWord();
    }

    @Override
    public Word queryWordById(Integer wordId) {
        return wordMapper.queryWordById(wordId);
    }

    @Override
    public Word queryWordStudy0ByGrade(Integer grade) {
        return wordMapper.queryWordStudy0ByGrade(grade);
    }

    @Override
    public int updateWordStudyByGrade(Integer grade) {
        return wordMapper.updateWordStudyByGrade(grade);
    }


    @Override
    public List<Word> queryAllWordCollection() {
        return wordMapper.queryAllWordCollection();
    }

    @Override
    public List<Word> queryWordCollectionByGrade(Integer grade) {
        return wordMapper.queryWordCollectionByGrade(grade);
    }




    @Override
    public List<Word> queryAllRemember() {
        return queryAllRemember();
    }

    @Override
    public List<Word> queryAllWordRememberByGrade(Integer grade) {
        return wordMapper.queryAllWordRememberByGrade(grade);
    }


    @Override
    public List<Word> queryAllUnremembered() {
        return wordMapper.queryAllUnremembered();
    }

    @Override
    public List<Word> queryAllWordUnrememberedByGrade(Integer grade) {
        return wordMapper.queryAllWordUnrememberedByGrade(grade);
    }

    @Override
    public int queryAllWordNumberByGrade(Integer grade) {
        return wordMapper.queryAllWordNumberByGrade(grade);
    }

    @Override
    public int queryRememberNumberByGrade(Integer grade) {
        return wordMapper.queryRememberNumberByGrade(grade);
    }

    @Override
    public int queryStudyNumberByGrade(Integer grade) {
        return wordMapper.queryStudyNumberByGrade(grade);
    }



}
