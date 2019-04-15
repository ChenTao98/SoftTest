package com.softtest.softtest.dao;

import com.softtest.softtest.entity.ReviewAssessment;
import com.softtest.softtest.entity.ReviewAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewAssessmentMapper {
    long countByExample(ReviewAssessmentExample example);

    int deleteByExample(ReviewAssessmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReviewAssessment record);

    int insertSelective(ReviewAssessment record);

    List<ReviewAssessment> selectByExample(ReviewAssessmentExample example);

    ReviewAssessment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReviewAssessment record, @Param("example") ReviewAssessmentExample example);

    int updateByExample(@Param("record") ReviewAssessment record, @Param("example") ReviewAssessmentExample example);

    int updateByPrimaryKeySelective(ReviewAssessment record);

    int updateByPrimaryKey(ReviewAssessment record);
}