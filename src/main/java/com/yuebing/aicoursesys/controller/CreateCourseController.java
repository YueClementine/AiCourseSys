package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Course;
import com.yuebing.aicoursesys.domain.Courseuserrel;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.service.CreateCourseService;
import com.yuebing.aicoursesys.service.UserSearchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateCourseController {

    @Autowired
    private CreateCourseService createCourseService;

    @Autowired
    private UserSearchService userSearchService;


    @PostMapping(value = "/createcourse")
    public ResponseBean createCourse(@RequestBody Courseuserrel courseuserrel) {

        if (courseuserrel.getRole() == 0) {
            courseuserrel.setUsername(userSearchService.searchUsernameByuserid(courseuserrel.getUserid()));
        } else {
            Course course = new Course();
            course.setCourseid(courseuserrel.getCourseid());
            course.setCoursename(courseuserrel.getCoursename());
            createCourseService.storeCourse(course);
        }
        if (createCourseService.storeCourseUserRel(courseuserrel))
            return new ResponseBean(200, "创建成功", courseuserrel);
        return new ResponseBean(400, "创建失败", courseuserrel);
    }

}
