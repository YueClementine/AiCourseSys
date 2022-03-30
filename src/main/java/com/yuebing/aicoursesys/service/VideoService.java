package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.domain.VideoExample;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private UserSearchService userSearchService;

    @Autowired
    private UserMapper userMapper;

    public List<Video> searchVideosByUserid(long id) {
        UserExample userExample = new UserExample();
        userExample.or().andUseridEqualTo(id);
        int role = userMapper.selectByExample(userExample).get(0).getRole();
        long userid;
        if (role == 0) {
            userid = userSearchService.getTeacherIdByStudent(id);
        }else {
            userid = id;
        }
        VideoExample videoExample = new VideoExample();
        videoExample.or().andUseridEqualTo(userid);
        return videoMapper.selectByExample(videoExample);


    }
}
