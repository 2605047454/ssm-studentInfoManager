package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sperformance;
import com.zhiyuan.frank.pojo.SperformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SperformanceMapper {
    long countByExample(SperformanceExample example);

    int deleteByExample(SperformanceExample example);

    int deleteByPrimaryKey(Integer spPid);

    int insert(Sperformance record);

    int insertSelective(Sperformance record);

    List<Sperformance> selectByExample(SperformanceExample example);

    Sperformance selectByPrimaryKey(Integer spPid);

    int updateByExampleSelective(@Param("record") Sperformance record, @Param("example") SperformanceExample example);

    int updateByExample(@Param("record") Sperformance record, @Param("example") SperformanceExample example);

    int updateByPrimaryKeySelective(Sperformance record);

    int updateByPrimaryKey(Sperformance record);
}