package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadVideoService {
    @Autowired
    private VideoMapper videoMapper;

    public Boolean insertVideo(Video video) {
        return videoMapper.insertSelective(video) != 0;
    }
}
