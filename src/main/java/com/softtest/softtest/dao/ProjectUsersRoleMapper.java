package com.softtest.softtest.dao;

import com.softtest.softtest.entity.ProjectUsersRole;
import com.softtest.softtest.entity.ProjectUsersRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectUsersRoleMapper {
    long countByExample(ProjectUsersRoleExample example);

    int deleteByExample(ProjectUsersRoleExample example);

    int insert(ProjectUsersRole record);

    int insertSelective(ProjectUsersRole record);

    List<ProjectUsersRole> selectByExample(ProjectUsersRoleExample example);

    int updateByExampleSelective(@Param("record") ProjectUsersRole record, @Param("example") ProjectUsersRoleExample example);

    int updateByExample(@Param("record") ProjectUsersRole record, @Param("example") ProjectUsersRoleExample example);
}