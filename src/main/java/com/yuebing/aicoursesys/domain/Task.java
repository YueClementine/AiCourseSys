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

    private String title;

    private Integer videoid;

    private String videoname;

    private String videoaddress;

    private Integer pptid;

    private String pptname;

    private String pptaddress;

    private Integer addvideo;

    private Integer addppt;

    private static final long serialVersionUID = 1L;
}