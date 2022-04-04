package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Note implements Serializable {
    private Integer noteid;

    private String note;

    private Integer addvideo;

    private Integer videoid;

    private String videoname;

    private String videoaddress;

    private Integer pptid;

    private String pptname;

    private String pptaddress;

    private Integer taskid;

    private Integer rate;

    private String title;

    private Integer addppt;

    private Long userid;

    private String username;

    private static final long serialVersionUID = 1L;
}