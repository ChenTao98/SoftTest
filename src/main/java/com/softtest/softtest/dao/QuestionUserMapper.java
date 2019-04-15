package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionUserExample;
import com.softtest.softtest.entity.QuestionUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionUserMapper {
    long countByExample(QuestionUserExample example);

    int deleteByExample(QuestionUserExample example);

    int deleteByPrimaryKey(QuestionUserKey key);

    int insert(QuestionUserKey record);

    int insertSelective(QuestionUserKey record);

    List<QuestionUserKey> selectByExample(QuestionUserExample example);

    int updateByExampleSelective(@Param("record") QuestionUserKey record, @Param("example") QuestionUserExample example);

    int updateByExample(@Param("record") QuestionUserKey record, @Param("example") QuestionUserExample example);
}