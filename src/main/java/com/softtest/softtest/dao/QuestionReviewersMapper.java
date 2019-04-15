package com.softtest.softtest.dao;

import com.softtest.softtest.entity.QuestionReviewersExample;
import com.softtest.softtest.entity.QuestionReviewersKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionReviewersMapper {
    long countByExample(QuestionReviewersExample example);

    int deleteByExample(QuestionReviewersExample example);

    int deleteByPrimaryKey(QuestionReviewersKey key);

    int insert(QuestionReviewersKey record);

    int insertSelective(QuestionReviewersKey record);

    List<QuestionReviewersKey> selectByExample(QuestionReviewersExample example);

    int updateByExampleSelective(@Param("record") QuestionReviewersKey record, @Param("example") QuestionReviewersExample example);

    int updateByExample(@Param("record") QuestionReviewersKey record, @Param("example") QuestionReviewersExample example);
}