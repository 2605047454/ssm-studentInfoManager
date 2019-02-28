package com.zhiyuan.frank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyuan.frank.dao.SbasicmessageMapper;
import com.zhiyuan.frank.pojo.Sbasicmessage;
import com.zhiyuan.frank.pojo.SbasicmessageExample;
import com.zhiyuan.frank.pojo.SbasicmessageExample.Criteria;

@Service
public class BasicService {
	@Autowired
	SbasicmessageMapper sbasicmessageMapper;
	
	//查询方法
	public List<Sbasicmessage> getallStu() {
		List<Sbasicmessage> list = sbasicmessageMapper.selectByExample(null);
		return list;
	}
	
	//保存方法
	public void saveEmp(Sbasicmessage sbasicmessage) {
		sbasicmessageMapper.insertSelective(sbasicmessage);
	}

	//检验用户名是否可用
	public boolean checkUser(String sName) {
		SbasicmessageExample example = new SbasicmessageExample();
		Criteria criteria = example.createCriteria();
		criteria.andSNameEqualTo(sName);
		long count = sbasicmessageMapper.countByExample(example);
		//true(0)：用户名可用   false(1)：用户名不可用
		return count == 0;
	}

	//查询学生信息
	public Sbasicmessage getUpdate(Integer id) {
		Sbasicmessage sbasicmessage = sbasicmessageMapper.selectByPrimaryKey(id);
		return sbasicmessage;
	}

	//学生修改信息
	public void saveUpdate(Sbasicmessage sbasicmessage) {
		sbasicmessageMapper.updateByPrimaryKeySelective(sbasicmessage);
	}

	//删除单条学生信息
	public void deleteEmp(Integer id) {
		sbasicmessageMapper.deleteByPrimaryKey(id);
	}

	//删除多条学生信息
	public void deleteBatch(List<Integer> ids) {
		SbasicmessageExample example = new SbasicmessageExample();
		Criteria criteria = example.createCriteria();
		criteria.andSBidIn(ids);
		sbasicmessageMapper.deleteByExample(example);
	}
}
