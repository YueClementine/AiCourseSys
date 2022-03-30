package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.mapper.PptMapper;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PptService {
    @Autowired
    private PptMapper pptMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserSearchService userSearchService;

    public List<Ppt> searchpptsByUserid(long id) {
        UserExample userExample = new UserExample();
        userExample.or().andUseridEqualTo(id);
        int role = userMapper.selectByExample(userExample).get(0).getRole();
        long userid;
        if (role == 0) {
            userid = userSearchService.getTeacherIdByStudent(id);
        }else {
            userid = id;
        }
        PptExample pptExample = new PptExample();
        pptExample.or().andUseridEqualTo(userid);
        return pptMapper.selectByExample(pptExample);


    }
}
