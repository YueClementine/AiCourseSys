package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Exam;
import com.yuebing.aicoursesys.domain.Question;
import com.yuebing.aicoursesys.domain.QuestionExample;
import com.yuebing.aicoursesys.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    public void insertQuestion(Question question) {
        questionMapper.insertSelective(question);
    }

    public List<Question> getQuestionsByExamId(int examid) {
        QuestionExample questionExample = new QuestionExample();
        questionExample.or().andExamidEqualTo(examid);

        return questionMapper.selectByExample(questionExample);
    }
}
