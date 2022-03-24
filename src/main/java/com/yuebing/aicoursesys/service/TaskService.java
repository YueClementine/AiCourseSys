package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Task;
import com.yuebing.aicoursesys.mapper.TaskMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaskService {
    @Resource
    private TaskMapper taskMapper;

    public Boolean storeTask(Task task) {

        return taskMapper.insertSelective(task) != 0;

    }
}
