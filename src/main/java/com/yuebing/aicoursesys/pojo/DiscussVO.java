package com.yuebing.aicoursesys.pojo;

import lombok.Data;

@Data
public class DiscussVO {
    private Integer discussid;

    private String topic;

    private Integer isterminated;

    private Long teacherid;

    private int groupnum;

    private int courseid;
}
