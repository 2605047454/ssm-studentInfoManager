package com.zhiyuan.frank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyuan.frank.pojo.Sclass;
import com.zhiyuan.frank.service.SclassService;
import com.zhiyuan.frank.util.Msg;

/**
 * 处理班级有关的请求
 * @author Administrator
 *
 */
@Controller
public class SclassController {
	
	@Autowired
	private SclassService sclassService;
	/**
	 * 返回所有的班级信息
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		//查出的所有班级信息
		List<Sclass> list = sclassService.getDepts();
		return Msg.succss().add("depts", list);
	}
	
}
