package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.ExamUserRel;
import com.yuebing.aicoursesys.domain.ExamUserRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ExamUserRelMapper {
    long countByExample(ExamUserRelExample example);

    int deleteByExample(ExamUserRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamUserRel record);

    int insertSelective(ExamUserRel record);

    List<ExamUserRel> selectByExample(ExamUserRelExample example);

    ExamUserRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamUserRel record, @Param("example") ExamUserRelExample example);

    int updateByExample(@Param("record") ExamUserRel record, @Param("example") ExamUserRelExample example);

    int updateByPrimaryKeySelective(ExamUserRel record);

    int updateByPrimaryKey(ExamUserRel record);
}