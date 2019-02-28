package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.SchargElaunch;
import com.zhiyuan.frank.pojo.SchargElaunchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchargElaunchMapper {
    long countByExample(SchargElaunchExample example);

    int deleteByExample(SchargElaunchExample example);

    int deleteByPrimaryKey(Integer sclId);

    int insert(SchargElaunch record);

    int insertSelective(SchargElaunch record);

    List<SchargElaunch> selectByExample(SchargElaunchExample example);

    SchargElaunch selectByPrimaryKey(Integer sclId);

    int updateByExampleSelective(@Param("record") SchargElaunch record, @Param("example") SchargElaunchExample example);

    int updateByExample(@Param("record") SchargElaunch record, @Param("example") SchargElaunchExample example);

    int updateByPrimaryKeySelective(SchargElaunch record);

    int updateByPrimaryKey(SchargElaunch record);
}