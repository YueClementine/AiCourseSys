package com.yuebing.aicoursesys.security;

import com.alibaba.fastjson.JSON;
import com.yuebing.aicoursesys.pojo.ResultCodeDTO;
import com.yuebing.aicoursesys.pojo.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义无权访问处理类
 */
@Slf4j
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        ResultDTO r = new ResultDTO();
        r.code(ResultCodeDTO.FORBIDDEN).message("权限不足");
        log.error("权限不足");
        String json = JSON.toJSONString(r);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
