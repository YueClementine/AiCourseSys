package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Courseuserrel;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CreateCourseService {
    @Resource
    private CourseuserrelMapper courseuserrelMapper;



    public Boolean storeCourseUserRel(Courseuserrel courseuserrel) {

        return courseuserrelMapper.insertSelective(courseuserrel) != 0;

    }
}
