package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Saattendance;
import com.zhiyuan.frank.pojo.SaattendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaattendanceMapper {
    long countByExample(SaattendanceExample example);

    int deleteByExample(SaattendanceExample example);

    int deleteByPrimaryKey(Integer saId);

    int insert(Saattendance record);

    int insertSelective(Saattendance record);

    List<Saattendance> selectByExample(SaattendanceExample example);

    Saattendance selectByPrimaryKey(Integer saId);

    int updateByExampleSelective(@Param("record") Saattendance record, @Param("example") SaattendanceExample example);

    int updateByExample(@Param("record") Saattendance record, @Param("example") SaattendanceExample example);

    int updateByPrimaryKeySelective(Saattendance record);

    int updateByPrimaryKey(Saattendance record);
}