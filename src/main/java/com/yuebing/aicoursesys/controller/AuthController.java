package com.yuebing.aicoursesys.controller;


import com.yuebing.aicoursesys.pojo.ResultCodeDTO;
import com.yuebing.aicoursesys.pojo.ResultDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AuthController {

    @RequestMapping("/get")
    public ResultDTO get(){
        HashMap map = new HashMap();
        map.put("username","admin");
        map.put("password","123456");
        ResultDTO r = new ResultDTO();
        r.code(ResultCodeDTO.SUCCESS).message("成功访问").data(map);
        return r;
    }

    @PreAuthorize("hasAuthority('teacher')")
    @RequestMapping("/del")
    public String del() {
        return "删除成功";
    }

}
