package com.yuebing.aicoursesys.security;


import com.alibaba.fastjson.JSON;
import com.yuebing.aicoursesys.dao.UserMapper;
import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.pojo.ResultCodeDTO;
import com.yuebing.aicoursesys.pojo.ResultDTO;
import com.yuebing.aicoursesys.service.UserSearchService;
import com.yuebing.aicoursesys.utils.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * 自定义认证成功处理器
 */
@Slf4j
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Resource
    private UserSearchService userSearchService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        //生成token
        final String realToken = jwtTokenUtil.generateToken(authentication.getName());
        final Integer role = userSearchService.searchRoleByUsername(jwtTokenUtil.getUsernameFromToken(realToken));
        HashMap<String,Object> map = new HashMap<>();
        map.put("token", realToken);
        map.put("role", role);
        ResultDTO r = new ResultDTO();
        r.code(ResultCodeDTO.SUCCESS).message("登录成功").data(map);
        log.info("登录成功");

        //将生成的authentication放入容器中，生成安全的上下文
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String json =  JSON.toJSONString(r);
        httpServletResponse.setContentType("text/json;charset=utf-8");
        httpServletResponse.getWriter().write(json);

    }
}
