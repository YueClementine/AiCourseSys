package com.yuebing.aicoursesys.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yuebing.aicoursesys.domain.Course;
import com.yuebing.aicoursesys.domain.Courseuserrel;
import com.yuebing.aicoursesys.mapper.CourseMapper;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CreateCourseService {
    @Resource
    private CourseuserrelMapper courseuserrelMapper;

    @Resource
    private CourseMapper courseMapper;



    public Boolean storeCourseUserRel(Courseuserrel courseuserrel) {
        courseuserrel.setCoursename(null);

        return courseuserrelMapper.insertSelective(courseuserrel) != 0;

    }

    public Boolean storeCourse(Course course) {
        return courseMapper.insertSelective(course) != 0;
    }
}
