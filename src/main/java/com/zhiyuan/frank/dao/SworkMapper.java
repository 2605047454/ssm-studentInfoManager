package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Swork;
import com.zhiyuan.frank.pojo.SworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SworkMapper {
    long countByExample(SworkExample example);

    int deleteByExample(SworkExample example);

    int deleteByPrimaryKey(Integer swId);

    int insert(Swork record);

    int insertSelective(Swork record);

    List<Swork> selectByExample(SworkExample example);

    Swork selectByPrimaryKey(Integer swId);

    int updateByExampleSelective(@Param("record") Swork record, @Param("example") SworkExample example);

    int updateByExample(@Param("record") Swork record, @Param("example") SworkExample example);

    int updateByPrimaryKeySelective(Swork record);

    int updateByPrimaryKey(Swork record);
}