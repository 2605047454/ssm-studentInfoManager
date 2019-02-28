package com.zhiyuan.frank.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyuan.frank.dao.SaattendanceMapper;
import com.zhiyuan.frank.pojo.Saattendance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TextCeShiMoKuai {
	@Autowired
	SaattendanceMapper sm;
	
	@Test
	public void text(){
		Saattendance sd = new Saattendance();
		sd.setSaId(1);
		sd.setsNumber(1);
		int aa = sm.insert(sd);
		System.out.println(aa);
	}
}
