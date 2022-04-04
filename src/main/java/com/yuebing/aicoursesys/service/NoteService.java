package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Note;
import com.yuebing.aicoursesys.domain.NoteExample;
import com.yuebing.aicoursesys.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteMapper noteMapper;

    public Boolean insertNote(Note note) {
        return noteMapper.insertSelective(note) != 0;

    }

    public List<Note> selectAllNotes() {
        NoteExample example = new NoteExample();
        example.or().andNoteidIsNotNull();
        return noteMapper.selectByExample(example);
    }
}
