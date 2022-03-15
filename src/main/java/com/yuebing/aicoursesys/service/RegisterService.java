package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.dao.UserMapper;
import com.yuebing.aicoursesys.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {
    @Resource
    private UserMapper userMapper;

    public Boolean registerUser(User user) {
        return userMapper.insertSelective(user) != 0;
    }
}