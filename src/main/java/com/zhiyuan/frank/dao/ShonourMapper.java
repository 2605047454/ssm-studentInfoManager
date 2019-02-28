package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Shonour;
import com.zhiyuan.frank.pojo.ShonourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShonourMapper {
    long countByExample(ShonourExample example);

    int deleteByExample(ShonourExample example);

    int deleteByPrimaryKey(Integer shId);

    int insert(Shonour record);

    int insertSelective(Shonour record);

    List<Shonour> selectByExample(ShonourExample example);

    Shonour selectByPrimaryKey(Integer shId);

    int updateByExampleSelective(@Param("record") Shonour record, @Param("example") ShonourExample example);

    int updateByExample(@Param("record") Shonour record, @Param("example") ShonourExample example);

    int updateByPrimaryKeySelective(Shonour record);

    int updateByPrimaryKey(Shonour record);
}