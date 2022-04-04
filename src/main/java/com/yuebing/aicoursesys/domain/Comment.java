package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Comment implements Serializable {
    private Integer commentid;

    private String comment;

    private Integer noteid;

    private Long userid;

    private String username;

    private static final long serialVersionUID = 1L;
}