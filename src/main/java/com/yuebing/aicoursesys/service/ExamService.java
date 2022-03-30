package com.yuebing.aicoursesys.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.mapper.CourseMapper;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.mapper.ExamMapper;
import com.yuebing.aicoursesys.mapper.ExamUserRelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
    @Autowired
    private ExamMapper examMapper;

    @Autowired
    private ExamUserRelMapper examUserRelMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private CourseuserrelMapper courseuserrelMapper;

    public int storeExam(long teacherid, String examname) {

        Exam exam = new Exam();
        exam.setTeacherid(teacherid);

        exam.setExamname(examname);
        exam.setIspublish(0);
        ExamExample example = new ExamExample();
        example.or().andExamnameEqualTo(examname);
        examMapper.insertSelective(exam);
        return examMapper.selectByExample(example).get(0).getExamid();
    }


    public List<ExamUserRel> searchExamUserRelByUserid(long userid) {
        ExamUserRelExample example = new ExamUserRelExample();
        example.or().andUseridEqualTo(userid).andGradeIsNull();
        return examUserRelMapper.selectByExample(example);

    }

    public List<Exam> teacherGetExamList(long teacherid) {
        ExamExample example = new ExamExample();
        example.or().andTeacheridEqualTo(teacherid);
        return examMapper.selectByExample(example);
    }

    public Boolean publishExam(int examid,long teacherid) {
        Exam examforName = examMapper.selectByPrimaryKey(examid);

        String examName = examforName.getExamname();
        CourseExample courseExample = new CourseExample();
        courseExample.or().andUseridEqualTo(teacherid);
        List<Course> courseList = courseMapper.selectByExample(courseExample);

        courseList.forEach(course -> {
            CourseuserrelExample courseuserrelExample = new CourseuserrelExample();
            courseuserrelExample.or().andCourseidEqualTo(course.getCourseid()).andRoleEqualTo(0);
            List<Courseuserrel> courseuserrelList = courseuserrelMapper.selectByExample(courseuserrelExample);
            courseuserrelList.forEach(courseuserrel -> {
                ExamUserRel examUserRel = new ExamUserRel();
                examUserRel.setExamid(examid);
                examUserRel.setExamname(examName);
                examUserRel.setTeacherid(teacherid);
                examUserRel.setUserid(courseuserrel.getUserid());
                examUserRelMapper.insertSelective(examUserRel);

            });
        });

        Exam exam = new Exam();
        exam.setExamid(examid);
        exam.setIspublish(1);


        return examMapper.updateByPrimaryKeySelective(exam) != 0;
    }

    public Boolean commitExam(long userid, int examid, int grade) {
        ExamUserRelExample example = new ExamUserRelExample();
        example.or().andUseridEqualTo(userid).andExamidEqualTo(examid);
        ExamUserRel examUserRel = new ExamUserRel();
        examUserRel.setGrade(grade);

        return examUserRelMapper.updateByExampleSelective(examUserRel, example) != 0;
    }
}
