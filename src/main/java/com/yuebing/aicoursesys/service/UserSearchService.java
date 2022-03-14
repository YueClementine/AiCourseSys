package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.dao.UserMapper;
import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchService {

    @Autowired
    private UserMapper userMapper;

    public List<User> searchUser() {
        UserExample userExample = new UserExample();
        userExample.or().andSexEqualTo(1);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList;
    }

}
