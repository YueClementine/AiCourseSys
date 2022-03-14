package com.yuebing.aicoursesys.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        log.info(userSearchService.searchUser().toString());

    }

}