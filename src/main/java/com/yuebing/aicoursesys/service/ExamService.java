package com.yuebing.aicoursesys.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.yuebing.aicoursesys.domain.Exam;
import com.yuebing.aicoursesys.domain.ExamExample;
import com.yuebing.aicoursesys.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private ExamMapper examMapper;

    public int storeExam(String examname) {
        Exam exam = new Exam();
        exam.setExamname(examname);
        ExamExample example = new ExamExample();
        example.or().andExamnameEqualTo(examname);
        examMapper.insertSelective(exam);
        return examMapper.selectByExample(example).get(0).getExamid();
    }
}
