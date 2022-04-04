package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Messageuserrel;
import com.yuebing.aicoursesys.domain.MessageuserrelExample;
import com.yuebing.aicoursesys.mapper.MessageuserrelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageuserrelMapper messageuserrelMapper;

    public List<Messageuserrel> getMessageUserRel(int groupid) {
        MessageuserrelExample example = new MessageuserrelExample();
        example.or().andGroupidEqualTo(groupid);
        example.setOrderByClause("date asc");
        return messageuserrelMapper.selectByExample(example);
    }
}
