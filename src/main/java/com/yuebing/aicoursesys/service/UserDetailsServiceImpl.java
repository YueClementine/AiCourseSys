package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.pojo.UserDo;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //Todo：暂时写成固定的 应该是换成查询数据库
        if(!s.equals("admin")) return null;//用户不是admin，报错
        System.out.println("查询"+s);
        return new UserDo("admin","$2a$10$WtN/BQbwY8dI0me.JsLxP.yyGePyTMg3bi3GZeRogowB4ZuoL1zrK", AuthorityUtils.commaSeparatedStringToAuthorityList("user,ROLE_admin"));
    }


}
