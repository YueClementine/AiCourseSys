package com.yuebing.aicoursesys.security;


import com.alibaba.fastjson.JSON;
import com.yuebing.aicoursesys.pojo.ResultCodeDTO;
import com.yuebing.aicoursesys.pojo.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证失败处理类
 */
@Slf4j
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        log.error("认证失败");
        ResultDTO r = new ResultDTO();
        r.code(ResultCodeDTO.UNAUTHORIZED).message("认证失败");
        String json =  JSON.toJSONString(r);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
