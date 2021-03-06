package com.yuebing.aicoursesys.controller;

import com.alibaba.fastjson.JSON;
import com.yuebing.aicoursesys.domain.Exam;
import com.yuebing.aicoursesys.domain.ExamUserRel;
import com.yuebing.aicoursesys.domain.Question;
import com.yuebing.aicoursesys.domain.UserExample;
import com.yuebing.aicoursesys.mapper.UserMapper;
import com.yuebing.aicoursesys.pojo.ExamUserRelVO;
import com.yuebing.aicoursesys.service.ExamService;
import com.yuebing.aicoursesys.service.QuestionService;
import com.yuebing.aicoursesys.service.UserSearchService;
import com.yuebing.aicoursesys.utils.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController
public class ExamCreateController {

    @Autowired
    private ExamService examService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private UserSearchService userSearchService;


    @CrossOrigin
    @ResponseBody
    @PostMapping(value = "createExam")
    public Boolean createExam(@RequestParam("examname") String examName, @RequestParam("questions") String questionlistjson, HttpServletRequest request) {
        String token = request.getHeader("Authorization");

        long userid = userSearchService.searchUseridByToken(token);

        int examid = examService.storeExam(userid, examName);


        List<Question> questions = JSON.parseArray(questionlistjson, Question.class);
        questions.forEach(question -> {
            question.setExamid(examid);
            question.setUserid(userid);
            questionService.insertQuestion(question);

        });

        return true;
    }

    @GetMapping(value = "getExamListByToken")
    public List<ExamUserRel> getExamUserRelListByToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        return examService.searchExamUserRelByUserid(userid);

    }

    @GetMapping(value = "getQuestionList")
    public List<Question> getQuestionList(int examid) {
        return questionService.getQuestionsByExamId(examid);
    }

    @GetMapping(value = "publishexam")
    public Boolean publishExam(int examid, HttpServletRequest request) {
        long teacherid = userSearchService.searchUseridByToken(request.getHeader("Authorization"));

        return examService.publishExam(examid, teacherid);


    }

    @GetMapping(value = "teacherGetExamList")
    public List<Exam> teacherGetExamList(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        return examService.teacherGetExamList(userid);
    }

    @GetMapping(value = "commitExam")
    public Boolean commitExam(int grade,int examid, HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        long userid = userSearchService.searchUseridByToken(token);
        return examService.commitExam(userid, examid, grade);
    }

    @GetMapping(value = "getGradeByExamid")
    public List<ExamUserRelVO> getGradeByExamid(int examid) {
        return examService.getGrade(examid);
    }

}
