package com.yuebing.aicoursesys.pojo;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultDTO {

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private Map<String, Object> data = new HashMap<String, Object>();

    public ResultDTO(){}

    public ResultDTO message(String message){
        this.setMessage(message);
        return this;
    }

    public ResultDTO code(Integer code){
        this.setCode(code);
        return this;
    }

    public ResultDTO data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public ResultDTO data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
