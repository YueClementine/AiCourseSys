package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Groupuserrel implements Serializable {
    private Integer id;

    private Long userid;

    private Integer groupid;

    private static final long serialVersionUID = 1L;
}