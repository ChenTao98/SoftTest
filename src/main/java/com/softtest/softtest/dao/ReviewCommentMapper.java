package com.softtest.softtest.dao;

import com.softtest.softtest.entity.ReviewComment;
import com.softtest.softtest.entity.ReviewCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewCommentMapper {
    long countByExample(ReviewCommentExample example);

    int deleteByExample(ReviewCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReviewComment record);

    int insertSelective(ReviewComment record);

    List<ReviewComment> selectByExampleWithBLOBs(ReviewCommentExample example);

    List<ReviewComment> selectByExample(ReviewCommentExample example);

    ReviewComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReviewComment record, @Param("example") ReviewCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") ReviewComment record, @Param("example") ReviewCommentExample example);

    int updateByExample(@Param("record") ReviewComment record, @Param("example") ReviewCommentExample example);

    int updateByPrimaryKeySelective(ReviewComment record);

    int updateByPrimaryKeyWithBLOBs(ReviewComment record);

    int updateByPrimaryKey(ReviewComment record);
}