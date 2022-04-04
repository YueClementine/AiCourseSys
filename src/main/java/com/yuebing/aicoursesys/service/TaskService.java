package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.mapper.TaskMapper;
import com.yuebing.aicoursesys.mapper.TaskuserrelMapper;
import com.yuebing.aicoursesys.pojo.TaskVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    @Resource
    private TaskMapper taskMapper;

    @Resource
    private CourseuserrelMapper courseuserrelMapper;

    @Resource
    private TaskuserrelMapper taskuserrelMapper;

    public Boolean storeTask(Task task) {
        return taskMapper.insertSelective(task) != 0;
    }

    //初始化所有学生未完成任务
    public void initTaskUserRel(Task task) {
        int courseid = task.getCourseid();
        String coursename = task.getCoursename();
        int taskid = task.getTaskid();
        CourseuserrelExample example = new CourseuserrelExample();
        example.or().andCourseidEqualTo(courseid).andRoleEqualTo(0);

        List<Courseuserrel> studentList = courseuserrelMapper.selectByExample(example);

        studentList.forEach(courseuserrel -> {
            Taskuserrel taskuserrel = new Taskuserrel();
            taskuserrel.setUserid(courseuserrel.getUserid());
            taskuserrel.setTaskid(taskid);
            taskuserrel.setCoursename(coursename);
            taskuserrel.setStatus(0);
            taskuserrelMapper.insertSelective(taskuserrel);
        });
    }

    public List<TaskVO> getTasksByStudentId(long studentid) {
        TaskuserrelExample taskuserrelExample = new TaskuserrelExample();
        taskuserrelExample.or().andUseridEqualTo(studentid);
        List<Taskuserrel> taskuserrellist =  taskuserrelMapper.selectByExample(taskuserrelExample);
        List<TaskVO> taskVOS = new ArrayList<>();
        taskuserrellist.forEach(taskuserrel -> {
            TaskVO taskVO = new TaskVO();
            taskVO.setUserid(taskuserrel.getUserid());

            int taskid = taskuserrel.getTaskid();
            taskVO.setTaskid(taskid);
            taskVO.setStatus(taskuserrel.getStatus());
            Task task = taskMapper.selectByPrimaryKey(taskid);
            taskVO.setAddppt(task.getAddppt());
            taskVO.setAddvideo(task.getAddvideo());
            taskVO.setPptaddress(task.getPptaddress());
            taskVO.setVideoaddress(task.getVideoaddress());
            taskVO.setPptname(task.getPptname());
            taskVO.setVideoname(task.getVideoname());
            taskVO.setTask(task.getTask());
            taskVO.setTitle(task.getTitle());
            taskVOS.add(taskVO);
        });
        return taskVOS;
    }

    public Boolean setTaskStatus(long userid, int taskid) {
        TaskuserrelExample taskuserrelExample = new TaskuserrelExample();
        taskuserrelExample.or().andTaskidEqualTo(taskid).andUseridEqualTo(userid);
        Taskuserrel taskuserrel = new Taskuserrel();
        taskuserrel.setStatus(1);
        return taskuserrelMapper.updateByExampleSelective(taskuserrel, taskuserrelExample) != 0;
    }

}
