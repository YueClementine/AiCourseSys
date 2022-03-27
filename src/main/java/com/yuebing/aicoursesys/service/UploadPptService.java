package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Ppt;
import com.yuebing.aicoursesys.mapper.PptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadPptService {
    @Autowired
    private PptMapper pptMapper;

    public Boolean insertPptInfo(Ppt ppt) {
        return pptMapper.insertSelective(ppt) != 0;
    }



}
