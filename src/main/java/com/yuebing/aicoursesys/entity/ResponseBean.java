package com.yuebing.aicoursesys.entity;

import lombok.Data;

@Data
public class ResponseBean {

    /**
     * 默认成功返回
     */
    public final static ResponseBean SUCCESS = new ResponseBean(200, "success","");

    /**
     * HTTP状态码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private Object data;

    public ResponseBean(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
