package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserSearchService {
    @Resource
    private UserMapper userMapper;

    public void insertUser() {
        User user = new User();
        user.setUsername("y");
        user.setPassword("shsh");
        user.setUserid(2018);
        user.setRole(0);
        user.setSex(1);
        userMapper.insertSelective(user);

    }
}
