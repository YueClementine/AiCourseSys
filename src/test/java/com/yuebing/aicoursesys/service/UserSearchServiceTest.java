package com.yuebing.aicoursesys.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
class UserSearchServiceTest {
    @Resource
    private UserSearchService userSearchService;


    @Test
    public void inserttest() {
//        userSearchService.insertUser();
        String encode = new BCryptPasswordEncoder().encode("123456");
        log.info(encode);


    }

}