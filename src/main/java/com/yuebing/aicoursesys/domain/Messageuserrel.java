package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Messageuserrel implements Serializable {
    private Integer messageid;

    private Long userid;

    private Integer groupid;

    private Integer discussid;

    private Long date;

    private String username;

    private String message;

    private static final long serialVersionUID = 1L;
}