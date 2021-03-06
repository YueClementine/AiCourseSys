package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Courseuserrel implements Serializable {
    private Integer id;

    private Integer courseid;

    private Long userid;

    private Integer rate;

    private String username;

    /**
     * 配合接口加一个课程名
     */
    private String coursename;

    private Integer role;

    private static final long serialVersionUID = 1L;
}