package com.yuebing.aicoursesys.service;

import com.yuebing.aicoursesys.domain.*;
import com.yuebing.aicoursesys.mapper.CourseuserrelMapper;
import com.yuebing.aicoursesys.mapper.DiscussMapper;
import com.yuebing.aicoursesys.mapper.GroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscussService {

    @Autowired
    private UserSearchService userSearchService;


    @Autowired
    private ExamService examService;

    @Autowired
    private DiscussMapper discussMapper;

    @Autowired
    private CourseuserrelMapper courseuserrelMapper;

    @Autowired
    private GroupMapper groupMapper;

    public List<Discuss> getDiscussListByTeacherid(long teacherid) {
        DiscussExample example = new DiscussExample();
        example.or().andTeacheridEqualTo(teacherid);
        return discussMapper.selectByExample(example);
    }

    public Boolean finishDiscuss(int discussid) {
        DiscussExample example = new DiscussExample();
        example.or().andDiscussidEqualTo(discussid);
        Discuss discuss = new Discuss();
        discuss.setIsterminated(1);
        return discussMapper.updateByExampleSelective(discuss, example) != 0;
    }

//    public Boolean createDiscuss(Discuss discuss, int groupnum,int courseid) {
//
//        discuss.setIsterminated(0);
//        discussMapper.insertSelective(discuss);
//
//        CourseuserrelExample courseuserrelExample = new CourseuserrelExample();
//        courseuserrelExample.or().andCourseidEqualTo(courseid);
//
//        List<Courseuserrel> courseuserrelList = courseuserrelMapper.selectByExample(courseuserrelExample);
//
//        //get student id by course id
//        List<Long> studentids = new ArrayList<>();
//        courseuserrelList.forEach(courseuserrel -> {
//            studentids.add(courseuserrel.getUserid());
//        });
//
//            //每三个分一组
//        int index = 0;
//        while (index != studentids.size() - 1) {
//            int times = groupnum;
//            while(times!=0){
//                long studentid = studentids.get(index);
//                Group group = new Group();
//                group.setDiscussid(discuss.getDiscussid());
////                if () {
////                    group.setGroupname(userSearchService.searchUsernameByuserid(studentid) + "、");
////
////                }
//
//                groupMapper.insertSelective(group);
//
//                times--;
//
//            }
//
//
//}
//        }













}
