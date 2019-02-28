package com.zhiyuan.frank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyuan.frank.dao.SclassMapper;
import com.zhiyuan.frank.pojo.Sclass;

@Service
public class SclassService {
	
	@Autowired
	private SclassMapper sclassMapper;

	public List<Sclass> getDepts() {
		List<Sclass> list = sclassMapper.selectByExample(null);
		return list;
	}

}
