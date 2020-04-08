package com.chun.myspringboot.service;

import com.chun.myspringboot.dao.WordMapper;
import com.chun.myspringboot.pojo.Cet4;
import com.chun.myspringboot.pojo.Cet6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<Cet4> queryAllWordCet4() {
        return wordMapper.queryAllWordCet4();
    }

    @Override
    public List<Cet6> queryAllWordCet6() {
        return wordMapper.queryAllWordCet6();
    }
}
