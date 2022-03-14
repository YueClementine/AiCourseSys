package com.yuebing.aicoursesys.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserSearchServiceTest {
    @Autowired
    private UserSearchService userSearchService;

    @Test
    public void inserttest() {
        userSearchService.insertUser();

    }

}