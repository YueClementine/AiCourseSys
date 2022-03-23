package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Course;
import com.yuebing.aicoursesys.domain.CourseExample;
import com.yuebing.aicoursesys.domain.Courseuserrel;
import com.yuebing.aicoursesys.domain.CourseuserrelExample;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.mapper.CourseMapper;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teachertask")
public class TaskController {

    @Resource
    private CourseuserrelMapper courseuserrelMapper;

    @Resource
    private CourseMapper courseMapper;

    @GetMapping("/getCourseByTeacherId")
    public List<Course> getCourseByTeacherId(Long teacherid) {
        CourseuserrelExample courseuserrelExample = new CourseuserrelExample();
        courseuserrelExample.or().andUseridEqualTo(teacherid);
        List<Courseuserrel> courseuserrelList = courseuserrelMapper.selectByExample(courseuserrelExample);
        List<Course> courseList = new ArrayList<>();
        courseuserrelList.forEach(courseuserrel -> {
            CourseExample courseExample = new CourseExample();
            courseExample.or().andCourseidEqualTo(courseuserrel.getCourseid());
            courseList.add(courseMapper.selectByExample(courseExample).get(0));
        });
        return courseList;
    }

    @PostMapping("/createTask")
    public ResponseBean createTask(){
        return null;
    }


}
