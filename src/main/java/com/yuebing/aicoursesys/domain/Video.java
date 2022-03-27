package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Video implements Serializable {
    private Integer videoid;

    private String videoname;

    private String videoaddress;

    private Integer videotag;

    private Long userid;

    private static final long serialVersionUID = 1L;
}