package com.yuebing.aicoursesys.mapper;

import com.yuebing.aicoursesys.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yuebing
* @description 针对表【user】的数据库操作Mapper
* @createDate 2022-03-14 12:57:47
* @Entity com.yuebing.aicoursesys.domain.User
*/
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
