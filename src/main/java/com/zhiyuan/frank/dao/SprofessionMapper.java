package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sprofession;
import com.zhiyuan.frank.pojo.SprofessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprofessionMapper {
    long countByExample(SprofessionExample example);

    int deleteByExample(SprofessionExample example);

    int deleteByPrimaryKey(Integer sprId);

    int insert(Sprofession record);

    int insertSelective(Sprofession record);

    List<Sprofession> selectByExample(SprofessionExample example);

    Sprofession selectByPrimaryKey(Integer sprId);

    int updateByExampleSelective(@Param("record") Sprofession record, @Param("example") SprofessionExample example);

    int updateByExample(@Param("record") Sprofession record, @Param("example") SprofessionExample example);

    int updateByPrimaryKeySelective(Sprofession record);

    int updateByPrimaryKey(Sprofession record);
}