package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sreg;
import com.zhiyuan.frank.pojo.SregExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SregMapper {
    long countByExample(SregExample example);

    int deleteByExample(SregExample example);

    int deleteByPrimaryKey(Integer swId);

    int insert(Sreg record);

    int insertSelective(Sreg record);

    List<Sreg> selectByExample(SregExample example);

    Sreg selectByPrimaryKey(Integer swId);

    int updateByExampleSelective(@Param("record") Sreg record, @Param("example") SregExample example);

    int updateByExample(@Param("record") Sreg record, @Param("example") SregExample example);

    int updateByPrimaryKeySelective(Sreg record);

    int updateByPrimaryKey(Sreg record);
}