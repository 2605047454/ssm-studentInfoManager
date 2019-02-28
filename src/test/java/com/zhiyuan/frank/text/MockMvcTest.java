package com.zhiyuan.frank.text;

import java.util.Random;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;
import com.zhiyuan.frank.dao.SbasicmessageMapper;
import com.zhiyuan.frank.pojo.Sbasicmessage;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//代表可以生成一个web模拟请求
@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/springmvc-servlet.xml"})
//@ContextConfiguration里面配置的是spring配置文件和springmvc-servlet的配置文件路径
public class MockMvcTest {
	@Autowired
	WebApplicationContext webApplicationContext;
	
	@Autowired
	SqlSession sqlsession;
	
	MockMvc mockMvc;
	//虚拟的mvc请求，可以获得处理结果
	
	@Before
	public void initMockMvc(){
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testPage() throws Exception{
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/allstu").param("pn","1")).andReturn();
		//perform:里面是模拟请求，MockMvcRequestBuilders:帮我们创建requestBuilder对象，get:请求方式allstu是路径，param:传入参数，andReturn:获取返回值
		MockHttpServletRequest mockrequest = result.getRequest();
		//获取请求对象
		PageInfo pageInfo = (PageInfo) mockrequest.getAttribute("PageInfo");
		//通过获取到的请求对象来获取PageInfo对象
		System.out.println("当前页的数量"+pageInfo.getSize());
		System.out.println("当前页"+pageInfo.getPageNum());
		System.out.println("总页数"+pageInfo.getPages());
		System.out.println("总记录数"+pageInfo.getTotal());
	}
	
	@Test
	public void testBatch(){
	//批量插入数据
		SbasicmessageMapper mapper = sqlsession.getMapper(SbasicmessageMapper.class);
		for (int i = 1; i <= 200; i++) {
			String name = UUID.randomUUID().toString().substring(0, 3)+i;
			//随机生成0-3字符
			String fname = UUID.randomUUID().toString().substring(0, 5)+i;
			//随机生成0-5字符
			Random r = new Random();
			int decade = (int)((Math.random()*9+1)*1000000000);
			//随机生成十位数
			Sbasicmessage sbasicmessage = new Sbasicmessage();
			sbasicmessage.setsBid(25+i);
			sbasicmessage.setsName(name);
			sbasicmessage.setsSex(r.nextInt(2));
			//只能生成0或1
			sbasicmessage.setsClass("安卓");
			sbasicmessage.setsPhone("1"+decade);
			sbasicmessage.setsIdcard("430682"+decade);
			sbasicmessage.setsFname(fname);
			sbasicmessage.setsFphone("1"+decade);
			mapper.insertSelective(sbasicmessage);
		}
	}
}
