package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Ppt implements Serializable {
    private Integer pptid;

    private String pptname;

    private String pptaddress;

    private Integer ppttag;

    private Long userid;

    private static final long serialVersionUID = 1L;
}