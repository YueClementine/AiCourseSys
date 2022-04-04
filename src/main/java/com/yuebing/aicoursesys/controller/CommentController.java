package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Comment;
import com.yuebing.aicoursesys.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/getCommentByNoteId")
    public List<Comment> getCommentListByNoteid(int noteid) {

        return commentService.getCommentByNoteid(noteid);
    }

    @PostMapping(value = "/insertComment")
    public Boolean insertComment(@RequestBody Comment comment) {
        return commentService.insertComment(comment);
    }

}
