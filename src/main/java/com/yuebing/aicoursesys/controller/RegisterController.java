package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.pojo.UserVo;
import com.yuebing.aicoursesys.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;


//    @ResponseBody
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public Boolean register(HttpServletRequest request) {
//
//        User user = new User();
//        user.setUserid(Integer.valueOf(request.getParameter("userid")));
//        user.setRole(Integer.valueOf(request.getParameter("role")));
//        user.setSex(Integer.valueOf(request.getParameter("sex")));
//        user.setPassword(new BCryptPasswordEncoder().encode(request.getParameter("password")));
//        user.setUsername(request.getParameter("username"));
//        return registerService.registerUser(user);
//    }

    /**
     * 注册接口
     * @param userVo
     * @return
     */
    @PostMapping(value = "/register")
    public ResponseBean register(@RequestBody UserVo userVo)
    {
        String userName = userVo.getUsername();
        log.info(userVo.toString());
        if(registerService.isRegistered(userName))
        {
            return new ResponseBean(201,"用户已存在",null);
        }
        User user = new User();
        user.setUserid(userVo.getUserid());
        user.setRole(userVo.getRole());
        user.setSex(userVo.getSex());
        user.setPassword(new BCryptPasswordEncoder().encode(userVo.getPassword()));
        user.setUsername(userName);
        if(registerService.registerUser(user))
            return new ResponseBean(200,"创建成功",user);
        return new ResponseBean(400, "创建失败", user);
    }

}
