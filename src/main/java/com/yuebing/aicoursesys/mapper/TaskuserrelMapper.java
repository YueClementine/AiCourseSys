package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Taskuserrel;
import com.yuebing.aicoursesys.domain.TaskuserrelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TaskuserrelMapper {
    long countByExample(TaskuserrelExample example);

    int deleteByExample(TaskuserrelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Taskuserrel record);

    int insertSelective(Taskuserrel record);

    List<Taskuserrel> selectByExample(TaskuserrelExample example);

    Taskuserrel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Taskuserrel record, @Param("example") TaskuserrelExample example);

    int updateByExample(@Param("record") Taskuserrel record, @Param("example") TaskuserrelExample example);

    int updateByPrimaryKeySelective(Taskuserrel record);

    int updateByPrimaryKey(Taskuserrel record);
}