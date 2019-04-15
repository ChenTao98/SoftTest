package com.softtest.softtest.dao;

import com.softtest.softtest.entity.KnowledgePoint;
import com.softtest.softtest.entity.KnowledgePointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgePointMapper {
    long countByExample(KnowledgePointExample example);

    int deleteByExample(KnowledgePointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KnowledgePoint record);

    int insertSelective(KnowledgePoint record);

    List<KnowledgePoint> selectByExample(KnowledgePointExample example);

    KnowledgePoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KnowledgePoint record, @Param("example") KnowledgePointExample example);

    int updateByExample(@Param("record") KnowledgePoint record, @Param("example") KnowledgePointExample example);

    int updateByPrimaryKeySelective(KnowledgePoint record);

    int updateByPrimaryKey(KnowledgePoint record);
}