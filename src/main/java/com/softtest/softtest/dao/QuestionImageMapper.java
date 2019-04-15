package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionImage;
import com.softtest.softtest.entity.QuestionImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionImageMapper {
    long countByExample(QuestionImageExample example);

    int deleteByExample(QuestionImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionImage record);

    int insertSelective(QuestionImage record);

    List<QuestionImage> selectByExample(QuestionImageExample example);

    QuestionImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionImage record, @Param("example") QuestionImageExample example);

    int updateByExample(@Param("record") QuestionImage record, @Param("example") QuestionImageExample example);

    int updateByPrimaryKeySelective(QuestionImage record);

    int updateByPrimaryKey(QuestionImage record);
}