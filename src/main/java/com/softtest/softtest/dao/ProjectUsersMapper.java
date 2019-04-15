package com.softtest.softtest.dao;

import com.softtest.softtest.entity.ProjectUsers;
import com.softtest.softtest.entity.ProjectUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectUsersMapper {
    long countByExample(ProjectUsersExample example);

    int deleteByExample(ProjectUsersExample example);

    int insert(ProjectUsers record);

    int insertSelective(ProjectUsers record);

    List<ProjectUsers> selectByExample(ProjectUsersExample example);

    int updateByExampleSelective(@Param("record") ProjectUsers record, @Param("example") ProjectUsersExample example);

    int updateByExample(@Param("record") ProjectUsers record, @Param("example") ProjectUsersExample example);
}