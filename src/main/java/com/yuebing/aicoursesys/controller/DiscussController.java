package com.yuebing.aicoursesys.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yuebing.aicoursesys.domain.Discuss;
import com.yuebing.aicoursesys.domain.Group;
import com.yuebing.aicoursesys.domain.Messageuserrel;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.mapper.DiscussMapper;
import com.yuebing.aicoursesys.pojo.DiscussVO;
import com.yuebing.aicoursesys.service.DiscussService;
import com.yuebing.aicoursesys.service.GroupService;
import com.yuebing.aicoursesys.service.MessageService;
import com.yuebing.aicoursesys.service.UserSearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    private MessageService messageService;

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

    @GetMapping(value = "/getMessageListByGroupid")
    public List<Messageuserrel> getMessageList(int groupid) {
        return messageService.getMessageUserRel(groupid);
    }
//
//    @PostMapping(value = "/createDiscuss")
//    public ResponseBean createDiscuss(@RequestBody DiscussVO discussVO, HttpServletRequest request) {
//        String token = request.getHeader("Authorization");
//        long userid = userSearchService.searchUseridByToken(token);
//        Discuss discuss = new Discuss();
//        discuss.setIsterminated(0);
//        discuss.setTeacherid(userid);
//        discuss.setTopic(discussVO.getTopic());
//        int courseid = discussVO.getCourseid();
//        if (discussService.createDiscuss(discuss, discussVO.getGroupnum(), courseid)) {
//
//            return new ResponseBean(200, "创建成功", discuss);
//        }
//        return new ResponseBean(400, "创建失败", discuss);
//
//    }



    @GetMapping(value = "/finishDiscuss")
    public Boolean finishDiscuss(int discussid) {
        return discussService.finishDiscuss(discussid);
    }
}
