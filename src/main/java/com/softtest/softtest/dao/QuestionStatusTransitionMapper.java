package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionStatusTransition;
import com.softtest.softtest.entity.QuestionStatusTransitionExample;
import com.softtest.softtest.entity.QuestionStatusTransitionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionStatusTransitionMapper {
    long countByExample(QuestionStatusTransitionExample example);

    int deleteByExample(QuestionStatusTransitionExample example);

    int deleteByPrimaryKey(QuestionStatusTransitionKey key);

    int insert(QuestionStatusTransition record);

    int insertSelective(QuestionStatusTransition record);

    List<QuestionStatusTransition> selectByExample(QuestionStatusTransitionExample example);

    QuestionStatusTransition selectByPrimaryKey(QuestionStatusTransitionKey key);

    int updateByExampleSelective(@Param("record") QuestionStatusTransition record, @Param("example") QuestionStatusTransitionExample example);

    int updateByExample(@Param("record") QuestionStatusTransition record, @Param("example") QuestionStatusTransitionExample example);

    int updateByPrimaryKeySelective(QuestionStatusTransition record);

    int updateByPrimaryKey(QuestionStatusTransition record);
}