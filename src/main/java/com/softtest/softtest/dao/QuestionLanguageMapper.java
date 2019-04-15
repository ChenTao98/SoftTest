package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionLanguage;
import com.softtest.softtest.entity.QuestionLanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionLanguageMapper {
    long countByExample(QuestionLanguageExample example);

    int deleteByExample(QuestionLanguageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionLanguage record);

    int insertSelective(QuestionLanguage record);

    List<QuestionLanguage> selectByExample(QuestionLanguageExample example);

    QuestionLanguage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionLanguage record, @Param("example") QuestionLanguageExample example);

    int updateByExample(@Param("record") QuestionLanguage record, @Param("example") QuestionLanguageExample example);

    int updateByPrimaryKeySelective(QuestionLanguage record);

    int updateByPrimaryKey(QuestionLanguage record);
}