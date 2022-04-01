package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.Discuss;
import com.yuebing.aicoursesys.domain.DiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DiscussMapper {
    long countByExample(DiscussExample example);

    int deleteByExample(DiscussExample example);

    int deleteByPrimaryKey(Integer discussid);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    List<Discuss> selectByExample(DiscussExample example);

    Discuss selectByPrimaryKey(Integer discussid);

    int updateByExampleSelective(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByExample(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);
}