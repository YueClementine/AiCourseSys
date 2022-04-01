package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Discuss implements Serializable {
    private Integer discussid;

    private String topic;

    private Integer isterminated;

    private Long teacherid;

    private static final long serialVersionUID = 1L;
}