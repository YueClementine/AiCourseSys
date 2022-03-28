package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Question;
import com.yuebing.aicoursesys.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    public void insertQuestion(Question question) {
        questionMapper.insertSelective(question);
    }
}
