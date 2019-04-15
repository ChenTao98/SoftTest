package com.softtest.softtest.dao;

import com.softtest.softtest.entity.Syllabus;
import com.softtest.softtest.entity.SyllabusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SyllabusMapper {
    long countByExample(SyllabusExample example);

    int deleteByExample(SyllabusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Syllabus record);

    int insertSelective(Syllabus record);

    List<Syllabus> selectByExample(SyllabusExample example);

    Syllabus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    int updateByExample(@Param("record") Syllabus record, @Param("example") SyllabusExample example);

    int updateByPrimaryKeySelective(Syllabus record);

    int updateByPrimaryKey(Syllabus record);
}