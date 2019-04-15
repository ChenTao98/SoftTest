package com.softtest.softtest.dao;

import com.softtest.softtest.entity.ProjectStatus;
import com.softtest.softtest.entity.ProjectStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectStatusMapper {
    long countByExample(ProjectStatusExample example);

    int deleteByExample(ProjectStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectStatus record);

    int insertSelective(ProjectStatus record);

    List<ProjectStatus> selectByExample(ProjectStatusExample example);

    ProjectStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectStatus record, @Param("example") ProjectStatusExample example);

    int updateByExample(@Param("record") ProjectStatus record, @Param("example") ProjectStatusExample example);

    int updateByPrimaryKeySelective(ProjectStatus record);

    int updateByPrimaryKey(ProjectStatus record);
}