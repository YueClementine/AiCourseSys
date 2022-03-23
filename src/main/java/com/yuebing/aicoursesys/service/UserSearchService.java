package com.yuebing.aicoursesys.service;


import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.mapper.UserMapper;
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
        return userMapper.selectByExample(userExample);
    }

    public User searchRoleByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList.get(0);
    }

    public String searchUsernameByuserid(long userid) {
        UserExample userExample = new UserExample();
        userExample.or().andUseridEqualTo(userid);
        List<User> userList = userMapper.selectByExample(userExample);
        return userList.get(0).getUsername();
    }

}
