package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Groupuserrel;
import com.yuebing.aicoursesys.domain.GroupuserrelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GroupuserrelMapper {
    long countByExample(GroupuserrelExample example);

    int deleteByExample(GroupuserrelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Groupuserrel record);

    int insertSelective(Groupuserrel record);

    List<Groupuserrel> selectByExample(GroupuserrelExample example);

    Groupuserrel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Groupuserrel record, @Param("example") GroupuserrelExample example);

    int updateByExample(@Param("record") Groupuserrel record, @Param("example") GroupuserrelExample example);

    int updateByPrimaryKeySelective(Groupuserrel record);

    int updateByPrimaryKey(Groupuserrel record);
}