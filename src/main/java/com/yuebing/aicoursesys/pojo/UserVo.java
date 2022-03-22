package com.yuebing.aicoursesys.pojo;

import lombok.Data;

@Data
public class UserVo {
    private Integer id;

    private Long userid;

    private String username;

    private String password;

    private Integer sex;

    private Integer role;

    /** 令牌 */
    private String token;
}
