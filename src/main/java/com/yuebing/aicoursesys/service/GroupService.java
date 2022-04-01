package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.Group;
import com.yuebing.aicoursesys.domain.GroupExample;
import com.yuebing.aicoursesys.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupMapper groupMapper;



    public List<Group> getGroupList(int discussid) {
        GroupExample groupExample = new GroupExample();
        groupExample.or().andDiscussidEqualTo(discussid);
        return groupMapper.selectByExample(groupExample);
    }
}
