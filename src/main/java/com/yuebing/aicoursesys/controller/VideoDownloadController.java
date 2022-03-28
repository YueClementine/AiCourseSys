package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Video;
import com.yuebing.aicoursesys.service.CreateCourseService;
import com.yuebing.aicoursesys.service.UserSearchService;
import com.yuebing.aicoursesys.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class VideoDownloadController {
    @Autowired
    private UserSearchService userSearchService;

    @Autowired
    private CreateCourseService createCourseService;

    @Autowired
    private VideoService videoService;

    @GetMapping("/studentSearchVideoByToken")
    public List<Video> searchVideoByToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        int courseid = createCourseService.searchCourseidByUserid(userid);
        long teacherid = createCourseService.searchUseridByCourseid(courseid);
        return videoService.searchVideosByUserid(teacherid);
    }

    @GetMapping("/teacherSearchVideoByToken")
    public List<Video> teacherSearchVideoByToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        return videoService.searchVideosByUserid(userid);
    }


}
