package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**
     * 注册接口
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Boolean register(HttpServletRequest request) {
        User user = new User();
        user.setUserid(Integer.valueOf(request.getParameter("userid")));
        user.setRole(Integer.valueOf(request.getParameter("role")));
        user.setSex(Integer.valueOf(request.getParameter("sex")));
        user.setPassword(new BCryptPasswordEncoder().encode(request.getParameter("password")));
        user.setUsername(request.getParameter("username"));
        return registerService.registerUser(user);
    }
}
