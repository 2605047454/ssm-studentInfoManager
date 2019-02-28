package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sclass;
import com.zhiyuan.frank.pojo.SclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SclassMapper {
    long countByExample(SclassExample example);

    int deleteByExample(SclassExample example);

    int deleteByPrimaryKey(Integer sclId);

    int insert(Sclass record);

    int insertSelective(Sclass record);

    List<Sclass> selectByExample(SclassExample example);

    Sclass selectByPrimaryKey(Integer sclId);

    int updateByExampleSelective(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByExample(@Param("record") Sclass record, @Param("example") SclassExample example);

    int updateByPrimaryKeySelective(Sclass record);

    int updateByPrimaryKey(Sclass record);
}