package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Taskuserrel implements Serializable {
    private Integer id;

    private Integer taskid;

    private Long userid;

    private String coursename;

    private static final long serialVersionUID = 1L;
}