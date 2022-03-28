package com.yuebing.aicoursesys.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class Question implements Serializable {
    private Integer questionid;

    private String questioncontent;

    private String opa;

    private String opb;

    private String opc;

    private String opd;

    private Integer correctop;

    private Integer questiontag;

    private Long userid;

    private Integer examid;

    private static final long serialVersionUID = 1L;
}