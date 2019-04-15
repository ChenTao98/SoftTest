package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionChoice;
import com.softtest.softtest.entity.QuestionChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionChoiceMapper {
    long countByExample(QuestionChoiceExample example);

    int deleteByExample(QuestionChoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionChoice record);

    int insertSelective(QuestionChoice record);

    List<QuestionChoice> selectByExampleWithBLOBs(QuestionChoiceExample example);

    List<QuestionChoice> selectByExample(QuestionChoiceExample example);

    QuestionChoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionChoice record, @Param("example") QuestionChoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionChoice record, @Param("example") QuestionChoiceExample example);

    int updateByExample(@Param("record") QuestionChoice record, @Param("example") QuestionChoiceExample example);

    int updateByPrimaryKeySelective(QuestionChoice record);

    int updateByPrimaryKeyWithBLOBs(QuestionChoice record);

    int updateByPrimaryKey(QuestionChoice record);
}