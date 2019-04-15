package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionChoiceImage;
import com.softtest.softtest.entity.QuestionChoiceImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionChoiceImageMapper {
    long countByExample(QuestionChoiceImageExample example);

    int deleteByExample(QuestionChoiceImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionChoiceImage record);

    int insertSelective(QuestionChoiceImage record);

    List<QuestionChoiceImage> selectByExample(QuestionChoiceImageExample example);

    QuestionChoiceImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionChoiceImage record, @Param("example") QuestionChoiceImageExample example);

    int updateByExample(@Param("record") QuestionChoiceImage record, @Param("example") QuestionChoiceImageExample example);

    int updateByPrimaryKeySelective(QuestionChoiceImage record);

    int updateByPrimaryKey(QuestionChoiceImage record);
}