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

    private static final long serialVersionUID = 1L;
}