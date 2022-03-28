package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.domain.VideoExample;
import com.yuebing.aicoursesys.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    @Autowired
    private VideoMapper videoMapper;

    public List<Video> searchVideosByUserid(long teacherid) {
        VideoExample videoExample = new VideoExample();
        videoExample.or().andUseridEqualTo(teacherid);
        return videoMapper.selectByExample(videoExample);


    }
}
