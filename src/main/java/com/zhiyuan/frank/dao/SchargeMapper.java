package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Scharge;
import com.zhiyuan.frank.pojo.SchargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchargeMapper {
    long countByExample(SchargeExample example);

    int deleteByExample(SchargeExample example);

    int deleteByPrimaryKey(Integer scId);

    int insert(Scharge record);

    int insertSelective(Scharge record);

    List<Scharge> selectByExample(SchargeExample example);

    Scharge selectByPrimaryKey(Integer scId);

    int updateByExampleSelective(@Param("record") Scharge record, @Param("example") SchargeExample example);

    int updateByExample(@Param("record") Scharge record, @Param("example") SchargeExample example);

    int updateByPrimaryKeySelective(Scharge record);

    int updateByPrimaryKey(Scharge record);
}