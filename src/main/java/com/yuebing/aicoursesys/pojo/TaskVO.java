package com.yuebing.aicoursesys.pojo;

import lombok.Data;

@Data
public class TaskVO {
    private Integer taskid;

    private String task;

    private long userid;
    private String title;

    private Integer status;

}
