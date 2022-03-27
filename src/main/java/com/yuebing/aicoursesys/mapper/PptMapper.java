package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Ppt;
import com.yuebing.aicoursesys.domain.PptExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PptMapper {
    long countByExample(PptExample example);

    int deleteByExample(PptExample example);

    int deleteByPrimaryKey(Integer pptid);

    int insert(Ppt record);

    int insertSelective(Ppt record);

    List<Ppt> selectByExample(PptExample example);

    Ppt selectByPrimaryKey(Integer pptid);

    int updateByExampleSelective(@Param("record") Ppt record, @Param("example") PptExample example);

    int updateByExample(@Param("record") Ppt record, @Param("example") PptExample example);

    int updateByPrimaryKeySelective(Ppt record);

    int updateByPrimaryKey(Ppt record);
}