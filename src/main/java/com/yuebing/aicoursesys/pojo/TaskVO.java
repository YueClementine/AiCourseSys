package com.yuebing.aicoursesys.pojo;

import lombok.Data;

@Data
public class TaskVO {
    private Integer taskid;

    private String task;

    private long userid;
    private String title;

    private Integer status;


    private Integer videoid;

    private String videoname;

    private String videoaddress;

    private Integer pptid;

    private String pptname;

    private String pptaddress;

    private Integer addvideo;

    private Integer addppt;




}
