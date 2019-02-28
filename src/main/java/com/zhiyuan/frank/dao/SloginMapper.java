package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Slogin;
import com.zhiyuan.frank.pojo.SloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SloginMapper {
    long countByExample(SloginExample example);

    int deleteByExample(SloginExample example);

    int deleteByPrimaryKey(Integer slId);

    int insert(Slogin record);

    int insertSelective(Slogin record);

    List<Slogin> selectByExample(SloginExample example);

    Slogin selectByPrimaryKey(Integer slId);

    int updateByExampleSelective(@Param("record") Slogin record, @Param("example") SloginExample example);

    int updateByExample(@Param("record") Slogin record, @Param("example") SloginExample example);

    int updateByPrimaryKeySelective(Slogin record);

    int updateByPrimaryKey(Slogin record);
}