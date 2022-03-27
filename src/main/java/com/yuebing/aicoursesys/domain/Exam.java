package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Exam implements Serializable {
    private Integer examid;

    private String examname;

    private static final long serialVersionUID = 1L;
}