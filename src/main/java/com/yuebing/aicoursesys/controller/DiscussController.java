package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Discuss;
import com.yuebing.aicoursesys.domain.Group;
import com.yuebing.aicoursesys.mapper.DiscussMapper;
import com.yuebing.aicoursesys.service.DiscussService;
import com.yuebing.aicoursesys.service.GroupService;
import com.yuebing.aicoursesys.service.UserSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
public class DiscussController {
    @Autowired
    private DiscussService discussService;

    @Autowired
    private GroupService groupService;

    @Autowired
    private UserSearchService userSearchService;

    @GetMapping(value = "/getDiscussList")
    public List<Discuss> getDiscussList(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        return discussService.getDiscussListByTeacherid(userid);
    }

    @GetMapping(value = "/getGroupListByDiscussid")
    public List<Group> getGroupList(int discussid) {

        return groupService.getGroupList(discussid);
    }

}
