package com.zhiyuan.frank.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyuan.frank.pojo.Sbasicmessage;
import com.zhiyuan.frank.service.BasicService;
import com.zhiyuan.frank.util.Msg;

@Controller
public class BasicmessageController {
	@Autowired
	BasicService basicService;
	
	@RequestMapping("allstu")
	@ResponseBody
	public Msg getAllStuInfo(@RequestParam(value="pn",defaultValue="1") Integer pn,Model model){
		//当没有参数传入进来的时候，defaultValue默认值将被设置为1
		PageHelper.startPage(pn, 5);//从pn页开始查，每次查5条数据
		List<Sbasicmessage> list = basicService.getallStu();
		PageInfo page = new PageInfo(list,3);//连续页显示3页
		//使用PageInfo包装查询后的结果
		model.addAttribute("PageInfo",page);
		//将封装结果放入Model，一并传入页面
		return Msg.succss().add("PageInfo", page);
	}
	
	/**
	 * 删除学生信息
	 * 批量删除带-
	 * 单个删除不带-
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/emp/{ids}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			basicService.deleteBatch(del_ids);
		}else{
			//单个删除
			Integer id = Integer.parseInt(ids);
			basicService.deleteEmp(id);
		}
		return Msg.succss();
	}
	
	/**
	 * 修改学生信息
	 */
	@RequestMapping(value="/update/{sBid}",method=RequestMethod.PUT)
	@ResponseBody
	public Msg saveUpdate(Sbasicmessage sbasicmessage){
		basicService.saveUpdate(sbasicmessage);
		return Msg.succss();
	}
	
	/**
	 * 查询学生信息
	 */
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getUpdate(@PathVariable("id")Integer id){
		Sbasicmessage sbasicmessage = basicService.getUpdate(id);
		return Msg.succss().add("update", sbasicmessage);
	}
	
	/**
	 * 学生保存
	 * @return
	 */
	@RequestMapping(value="bas",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Sbasicmessage sbasicmessage,BindingResult result){
		if(result.hasErrors()){
			//校验失败，返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		}else{
			basicService.saveEmp(sbasicmessage);
			return Msg.succss();
		}
	}
	
	/**
	 * 检验用户名是否可用
	 * @param sName
	 * @return
	 */
	@RequestMapping("/checkuser")
	@ResponseBody
	public Msg checkuser(@RequestParam("sName")String sName){
		boolean bsName = basicService.checkUser(sName);
		if(bsName){
			return Msg.succss();
		}else{
			return Msg.fail();
		}
	}
}
