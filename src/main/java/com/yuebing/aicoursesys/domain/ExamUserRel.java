package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class ExamUserRel implements Serializable {
    private Integer id;

    private Long userid;

    private Integer examid;

    private String examname;

    private Long teacherid;

    private Integer grade;

    private String date;

    private static final long serialVersionUID = 1L;
}