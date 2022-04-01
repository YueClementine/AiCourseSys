package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Discuss;
import com.yuebing.aicoursesys.domain.DiscussExample;
import com.yuebing.aicoursesys.mapper.DiscussMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussService {

    @Autowired
    private DiscussMapper discussMapper;

    public List<Discuss> getDiscussListByTeacherid(long teacherid) {
        DiscussExample example = new DiscussExample();
        example.or().andTeacheridEqualTo(teacherid);
        return discussMapper.selectByExample(example);
    }

}
