package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Messageuserrel;
import com.yuebing.aicoursesys.domain.MessageuserrelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MessageuserrelMapper {
    long countByExample(MessageuserrelExample example);

    int deleteByExample(MessageuserrelExample example);

    int deleteByPrimaryKey(Integer messageid);

    int insert(Messageuserrel record);

    int insertSelective(Messageuserrel record);

    List<Messageuserrel> selectByExample(MessageuserrelExample example);

    Messageuserrel selectByPrimaryKey(Integer messageid);

    int updateByExampleSelective(@Param("record") Messageuserrel record, @Param("example") MessageuserrelExample example);

    int updateByExample(@Param("record") Messageuserrel record, @Param("example") MessageuserrelExample example);

    int updateByPrimaryKeySelective(Messageuserrel record);

    int updateByPrimaryKey(Messageuserrel record);
}