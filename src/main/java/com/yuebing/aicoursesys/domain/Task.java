package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Task implements Serializable {
    private Integer taskid;

    private String task;

    private Integer courseid;

    private String coursename;

    private static final long serialVersionUID = 1L;
}