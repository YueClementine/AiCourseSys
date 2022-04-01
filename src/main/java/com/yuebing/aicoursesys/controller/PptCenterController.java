package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Ppt;
import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.service.CreateCourseService;
import com.yuebing.aicoursesys.service.PptService;
import com.yuebing.aicoursesys.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class  PptCenterController {
    @Autowired
    private UserSearchService userSearchService;
    @Autowired
    private CreateCourseService createCourseService;

    @Autowired
    private PptService pptService;

    @GetMapping("/getPptListByToken")
    public List<Ppt> searchPptByToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);

        return pptService.searchpptsByUserid(userid);
    }
}
