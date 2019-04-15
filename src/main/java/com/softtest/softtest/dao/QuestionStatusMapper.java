package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionStatus;
import com.softtest.softtest.entity.QuestionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionStatusMapper {
    long countByExample(QuestionStatusExample example);

    int deleteByExample(QuestionStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionStatus record);

    int insertSelective(QuestionStatus record);

    List<QuestionStatus> selectByExample(QuestionStatusExample example);

    QuestionStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionStatus record, @Param("example") QuestionStatusExample example);

    int updateByExample(@Param("record") QuestionStatus record, @Param("example") QuestionStatusExample example);

    int updateByPrimaryKeySelective(QuestionStatus record);

    int updateByPrimaryKey(QuestionStatus record);
}