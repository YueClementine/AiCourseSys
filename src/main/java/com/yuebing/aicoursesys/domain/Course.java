package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Course implements Serializable {
    private Integer courseid;

    private String coursename;

    private Long userid;

    private static final long serialVersionUID = 1L;
}