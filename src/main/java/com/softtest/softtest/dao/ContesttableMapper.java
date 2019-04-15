package com.softtest.softtest.dao;

import com.softtest.softtest.entity.Contesttable;
import com.softtest.softtest.entity.ContesttableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContesttableMapper {
    long countByExample(ContesttableExample example);

    int deleteByExample(ContesttableExample example);

    int insert(Contesttable record);

    int insertSelective(Contesttable record);

    List<Contesttable> selectByExample(ContesttableExample example);

    int updateByExampleSelective(@Param("record") Contesttable record, @Param("example") ContesttableExample example);

    int updateByExample(@Param("record") Contesttable record, @Param("example") ContesttableExample example);
}