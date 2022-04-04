package com.yuebing.aicoursesys.controller;

import com.yuebing.aicoursesys.domain.Note;
import com.yuebing.aicoursesys.domain.Task;
import com.yuebing.aicoursesys.entity.ResponseBean;
import com.yuebing.aicoursesys.service.NoteService;
import com.yuebing.aicoursesys.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class NoteController {
    @Autowired
    private NoteService noteService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/createNote")
    public ResponseBean createNote(@RequestBody Note note, HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        String username = jwtTokenUtil.getUsernameFromToken(token);

        note.setUsername(username);

        if (noteService.insertNote(note)) {
            return new ResponseBean(200, "创建成功", note);
        }
        return new ResponseBean(400, "创建失败", note);
    }

    @GetMapping(value = "/getAllNotes")
    public List<Note> getAllNotes() {
        return noteService.selectAllNotes();
    }
}
