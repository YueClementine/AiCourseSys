package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Ppt;
import com.yuebing.aicoursesys.domain.PptExample;
import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.domain.VideoExample;
import com.yuebing.aicoursesys.mapper.PptMapper;
import com.yuebing.aicoursesys.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PptService {
    @Autowired
    private PptMapper pptMapper;

    public List<Ppt> searchpptsByUserid(long teacherid) {
        PptExample pptExample = new PptExample();
        pptExample.or().andUseridEqualTo(teacherid);
        return pptMapper.selectByExample(pptExample);


    }
}
