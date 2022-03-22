package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private Long userid;

    private String username;

    private String password;

    private Integer sex;

    private Integer role;

    private static final long serialVersionUID = 1L;
}