package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sbadbehavior;
import com.zhiyuan.frank.pojo.SbadbehaviorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbadbehaviorMapper {
    long countByExample(SbadbehaviorExample example);

    int deleteByExample(SbadbehaviorExample example);

    int deleteByPrimaryKey(Integer sbId);

    int insert(Sbadbehavior record);

    int insertSelective(Sbadbehavior record);

    List<Sbadbehavior> selectByExample(SbadbehaviorExample example);

    Sbadbehavior selectByPrimaryKey(Integer sbId);

    int updateByExampleSelective(@Param("record") Sbadbehavior record, @Param("example") SbadbehaviorExample example);

    int updateByExample(@Param("record") Sbadbehavior record, @Param("example") SbadbehaviorExample example);

    int updateByPrimaryKeySelective(Sbadbehavior record);

    int updateByPrimaryKey(Sbadbehavior record);
}