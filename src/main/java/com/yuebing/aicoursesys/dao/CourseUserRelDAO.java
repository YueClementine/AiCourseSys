package com.yuebing.aicoursesys.dao;

import com.yuebing.aicoursesys.domain.CourseUserRel;
import com.yuebing.aicoursesys.domain.CourseUserRelExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CourseUserRelDAO继承基类
 */
@Mapper
@Repository
public interface CourseUserRelDAO extends MyBatisBaseDao<CourseUserRel, Integer, CourseUserRelExample> {
}