package com.chun.myspringboot;

import com.chun.myspringboot.dao.WordMapper;
import com.chun.myspringboot.pojo.Cet4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyspringbootApplicationTests {

    @Autowired
    WordMapper wordMapper;

    @Test
    void contextLoads() {
        Cet4 wordCet4 = wordMapper.queryWordCet4ById(1);
        System.out.println(wordCet4);

    }
}

