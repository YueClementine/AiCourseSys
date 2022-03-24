package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.mapper.CourseMapper;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.pojo.TaskVO;
import com.yuebing.aicoursesys.service.TaskService;
import org.springframework.web.bind.annotation.*;

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

    @Resource
    private TaskService taskService;


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
    public ResponseBean createTask(@RequestBody Task task) {
        if (taskService.storeTask(task)) {
            taskService.initTaskUserRel(task);
            return new ResponseBean(200, "创建成功", task);
        }
        return new ResponseBean(400, "创建失败", task);
    }

    @GetMapping("/getTaskByUserId")
    public List<TaskVO> getTaskByUserId(Long studentid) {

        return taskService.getTasksByStudentId(studentid);
    }

    @GetMapping("/setTaskStatus")
    public String setTaskStatus(Long userid, int taskid) {
        return taskService.setTaskStatus(userid, taskid).toString();
    }

}
