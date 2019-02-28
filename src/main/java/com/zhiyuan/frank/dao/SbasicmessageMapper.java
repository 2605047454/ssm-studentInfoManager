package com.zhiyuan.frank.dao;

import com.zhiyuan.frank.pojo.Sbasicmessage;
import com.zhiyuan.frank.pojo.SbasicmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SbasicmessageMapper {
    long countByExample(SbasicmessageExample example);

    int deleteByExample(SbasicmessageExample example);

    int deleteByPrimaryKey(Integer sBid);

    int insert(Sbasicmessage record);

    int insertSelective(Sbasicmessage record);

    List<Sbasicmessage> selectByExample(SbasicmessageExample example);

    Sbasicmessage selectByPrimaryKey(Integer sBid);
    
    int updateByExampleSelective(@Param("record") Sbasicmessage record, @Param("example") SbasicmessageExample example);

    int updateByExample(@Param("record") Sbasicmessage record, @Param("example") SbasicmessageExample example);

    int updateByPrimaryKeySelective(Sbasicmessage record);

    int updateByPrimaryKey(Sbasicmessage record);
}