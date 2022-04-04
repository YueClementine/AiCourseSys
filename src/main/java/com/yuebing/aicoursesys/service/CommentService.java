package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Comment;
import com.yuebing.aicoursesys.domain.CommentExample;
import com.yuebing.aicoursesys.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getCommentByNoteid(int noteid) {
        CommentExample example = new CommentExample();
        example.or().andNoteidEqualTo(noteid);
        return commentMapper.selectByExample(example);
    }

    public Boolean insertComment(Comment comment) {
        return commentMapper.insertSelective(comment) != 0;
    }

}
