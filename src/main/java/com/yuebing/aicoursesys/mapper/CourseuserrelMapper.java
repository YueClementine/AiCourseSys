package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Courseuserrel;
import com.yuebing.aicoursesys.domain.CourseuserrelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CourseuserrelMapper {
    long countByExample(CourseuserrelExample example);

    int deleteByExample(CourseuserrelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Courseuserrel record);

    int insertSelective(Courseuserrel record);

    List<Courseuserrel> selectByExample(CourseuserrelExample example);

    Courseuserrel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Courseuserrel record, @Param("example") CourseuserrelExample example);

    int updateByExample(@Param("record") Courseuserrel record, @Param("example") CourseuserrelExample example);

    int updateByPrimaryKeySelective(Courseuserrel record);

    int updateByPrimaryKey(Courseuserrel record);
}