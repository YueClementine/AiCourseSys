package com.yuebing.aicoursesys.service;


import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private CourseuserrelMapper courseuserrelMapper;

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

    public long searchUseridByToken(String token) {
        String username = jwtTokenUtil.getUsernameFromToken(token);
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample).get(0).getUserid();
    }

    public long getTeacherIdByStudent(long studentid) {
        CourseuserrelExample courseuserrelExample = new CourseuserrelExample();
        courseuserrelExample.or().andUseridEqualTo(studentid);
        int courseid = courseuserrelMapper.selectByExample(courseuserrelExample).get(0).getCourseid();
        CourseuserrelExample courseuserrelExample1 = new CourseuserrelExample();
        courseuserrelExample1.or().andCourseidEqualTo(courseid).andRoleEqualTo(1);
        return courseuserrelMapper.selectByExample(courseuserrelExample1).get(0).getUserid();

    }

}
