package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Group implements Serializable {
    private Integer groupid;

    private String groupname;

    private Integer discussid;

    private static final long serialVersionUID = 1L;
}