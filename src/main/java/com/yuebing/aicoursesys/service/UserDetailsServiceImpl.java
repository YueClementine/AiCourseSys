package com.yuebing.aicoursesys.service;


import com.yuebing.aicoursesys.domain.User;
import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.pojo.UserDo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private UserMapper userMapper;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.info("查询" + s);
        UserExample userExample = new UserExample();
        userExample.or().andUsernameEqualTo(s);
        User user = userMapper.selectByExample(userExample).get(0);
        String auth = (user.getRole() == 0) ? "student" : "teacher";
        log.info(AuthorityUtils.commaSeparatedStringToAuthorityList(auth).toString());
        return new UserDo(user.getUsername(),user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(auth));
    }

}
