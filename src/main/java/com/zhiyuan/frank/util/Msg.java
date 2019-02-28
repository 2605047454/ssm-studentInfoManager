package com.zhiyuan.frank.util;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	//状态码：100：成功；200：失败
	private int code;
	//提示信息，操作成功或者异常等
	private String msg;
	//用户要返回给浏览器的数据封装对象map
	private Map<String,Object> map = new HashMap<String,Object>();
	
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Map<String, Object> getMap() {
		return map;
	}


	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	//常用的成功方法
	public static Msg succss(){
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("操作成功!");
		return result;
	}
	
	//常用的失败方法
	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("操作失败!");
		return result;
	}
	
	//定义一个链式操作的添加方法
	public Msg add(String key,Object value){
		this.getMap().put(key, value);
		return this;
	}
}
