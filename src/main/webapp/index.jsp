<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%-- <jsp:forward page="/allstu"></jsp:forward> --%>
	<!-- 跳转 -->
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
	pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<!-- href：里面的路径是你导入在static文件夹里面下面bootstrap.min.css所在的路径 -->
<script type="text/javascript"
	src="<%=basePath%>/static/bootstrap-3.3.7/js/tests/vendor/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body style="background:#87CEEB">
<script src="<%=basePath%>/static/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
	<!-- 学生修改的模态框 -->
	<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">学生修改</h4>
				</div>
				<!-- 模态框内容 -->
				<div class="modal-body">
					<form class="form-horizontal">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">姓名</label>
					    <div class="col-sm-10">
					      <p class="form-control-static" id="sName_update_p"></p>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">性别</label>
					    <div class="col-sm-10">
							<label class="radio-inline">
							  <input type="radio" name="sSex" id="sSex1_update_input" value="0" checked="checked"> 男
							</label>
							<label class="radio-inline">
							  <input type="radio" name="sSex" id="sSex2_update_input" value="1"> 女
							</label>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">班级</label>
					    <div class="col-sm-3">
							<select class="form-control" name="sClass" id="sClass_update_select">
							</select>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">本人电话</label>
					    <div class="col-sm-10">
					      <input type="text" name="sPhone" class="form-control" id="sPhone_update_input" placeholder="请输入本人电话">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">身份证号</label>
					    <div class="col-sm-10">
					      <input type="text" name="sIdcard" class="form-control" id="sIdcard_update_input" placeholder="请输入身份证号">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">家长姓名</label>
					    <div class="col-sm-10">
					      <input type="text" name="sFname" class="form-control" id="sFname_update_input" placeholder="请输入家长姓名">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">家长电话</label>
					    <div class="col-sm-10">
					      <input type="text" name="sFphone" class="form-control" id="sFphone_update_input" placeholder="请输入家长电话">
					      <span class="help-block"></span>
					    </div>
					  </div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="empUpdate_save_btn">提交更改</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 学生添加的模态框 -->
	<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">学生添加</h4>
				</div>
				<!-- 模态框内容 -->
				<div class="modal-body">
					<form class="form-horizontal">
					  <div class="form-group">
					    <label class="col-sm-2 control-label">姓名</label>
					    <div class="col-sm-10">
					      <input type="text" name="sName" class="form-control" id="sName_add_input" placeholder="请输入姓名">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">性别</label>
					    <div class="col-sm-10">
							<label class="radio-inline">
							  <input type="radio" name="sSex" id="sSex1_add_input" value="0" checked="checked"> 男
							</label>
							<label class="radio-inline">
							  <input type="radio" name="sSex" id="sSex2_add_input" value="1"> 女
							</label>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">班级</label>
					    <div class="col-sm-3">
							<select class="form-control" name="sClass" id="sClass_add_select">
							</select>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">本人电话</label>
					    <div class="col-sm-10">
					      <input type="text" name="sPhone" class="form-control" id="sPhone_add_input" placeholder="请输入本人电话">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">身份证号</label>
					    <div class="col-sm-10">
					      <input type="text" name="sIdcard" class="form-control" id="sIdcard_add_input" placeholder="请输入身份证号">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">家长姓名</label>
					    <div class="col-sm-10">
					      <input type="text" name="sFname" class="form-control" id="sFname_add_input" placeholder="请输入家长姓名">
					      <span class="help-block"></span>
					    </div>
					  </div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label">家长电话</label>
					    <div class="col-sm-10">
					      <input type="text" name="sFphone" class="form-control" id="sFphone_add_input" placeholder="请输入家长电话">
					      <span class="help-block"></span>
					    </div>
					  </div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="emp_save_btn">提交更改</button>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="col-md-12 col-md-offset-1">
			<h1>苗  管  家</h1>
		</div>
		<!-- 第一层结构 -->
		<div class="col-md-4 col-md-offset-1">
			<form class="navbar-form navbar-left">
        		<div class="form-group">
          			<input type="text" class="form-control" id="select_input" placeholder="请输入学号">
        		</div>
        		<button type="submit" class="btn btn-default">
        			<span class="glyphicon glyphicon-search" id="emp_select_modal_btn"></span>查询
     		   	</button>
     		</form>
    	</div>
    	
    	<!-- 第二层结构 -->
		<div class="col-md-4 col-md-offset-8"  align="left">
			<div class="row">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-success" id="emp_add_modal_btn">
					<span class="glyphicon glyphicon-plus"></span>添加
				</button>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<button type="button" class="btn btn-danger" id="emp_delect_modal_btn">
					<span class="glyphicon glyphicon-trash"></span>批量删除
				</button>
			</div>
		</div>
		
		<!-- 第三层结构 -->
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<table class="table table-hover">
					<thead>
						<tr>
							<td>
								<input type="checkbox" id="checkbox_delect">
							</td>
							<td>#</td>
							<td>姓名</td>
							<td>性别</td>
							<td>班级</td>
							<td>本人电话</td>
							<td>身份证号</td>
							<td>家长姓名</td>
							<td>家长电话</td>
							<td colspan="3">操作</td>
						</tr>
					</thead>
					<tbody id="stuTable">
						
					</tbody>
				</table>
			</div>
		</div>
	
		<!-- 第四层结构 -->
		<div class="col-md-4 col-md-offset-8">
			<div class="row" id="page"></div>
		</div>
	
		<!-- 第五层结构 -->
		<div class="col-md-4 col-md-offset-4">
			<div class="row">
				<nav aria-label="Page navigation">
				<ul class="pagination" id="navigatepageNums">
					
				</ul>
				</nav>
			</div>
		</div>
	</div>
	
	<script type="text/javascript">
		var totalRecord,currentPage;
		//页面一旦加载完成，执行此方法
		$(function(){
			to_page(1)
		});
		
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/allstu",
				data:"pn="+pn,
				type:"GET",
				success:function(result){
					/* console.log("成功");
					alert("操作状态码:"+result.code+" "+"提示信息:"+result.msg+" ")
					console.log("人名:"+result.map.PageInfo.list[0].sName); */
					fulltable(result);
					page(result);
					navigatepageNums(result);
				}
			});
		}
		
		//填充表格数据函数
		function fulltable(result){
			//清空table表格
			$("#stuTable").empty();
			var stu = result.map.PageInfo.list;
			//调用的遍历方法
			$.each(stu,function(index,item){//index:下标，item:元素
				var tr = $("<tr></tr>");
				var checkBoxTd = $("<td><input type='checkbox' class='checkbox_item'></input></td>");
				var sBid = $("<td></td>").append(item.sBid);
				var Name = $("<td></td>").append(item.sName);
				var Sex = $("<td></td>").append(item.sSex==0?'男':'女');
				var Class = $("<td></td>").append(item.sClass);
				var Phone = $("<td></td>").append(item.sPhone);
				var Idcard = $("<td></td>").append(item.sIdcard);
				var Fname = $("<td></td>").append(item.sFname);
				var Fphone = $("<td></td>").append(item.sFphone);
				
				var update = $("<button></button>").addClass("btn btn-warning update_btn");
				//为修改按钮添加一个自定义的属性，来表示当前id
				update.attr("update_id",item.sBid);
				var span1 = $("<span></span>").addClass("glyphicon glyphicon-pencil");
				update.append(span1).append("修改");
				
				var delect = $("<button></button>").addClass("btn btn-danger delect_btn");
				delect.attr("delect_id",item.sBid);
				var span2 = $("<span></span>").addClass("glyphicon glyphicon-trash");
				delect.append(span2).append("删除");
				
				var select = $("<button></button>").addClass("btn btn-info select_btn");
				select.attr("select_id",item.sBid);
				var span3 = $("<span></span>").addClass("glyphicon glyphicon-user");
				select.append(span3).append("详情");
				
				var btuuonTd = $("<td></td>").append(update).append("&nbsp;&nbsp;&nbsp;").append(delect).append("&nbsp;&nbsp;&nbsp;").append(select);
				
				tr.append(checkBoxTd).append(sBid).append(Name).append(Sex).append(Class).append(Phone).append(Idcard).append(Fname).append(Fphone).append(btuuonTd);
				$("#stuTable").append(tr);
			});
		}
		
		//填充分页信息
		function page(result){
			$("#page").empty();
			$("#page").append("当前是第"+result.map.PageInfo.pageNum+"页，总共"+result.map.PageInfo.pages+"页");
			totalRecord = result.map.PageInfo.pages;
			currentPage = result.map.PageInfo.pageNum;
		}
		
		//分页码
		function navigatepageNums(result){
			$("#navigatepageNums").empty();
			//首页
			if(result.map.PageInfo.isFirstPage==true){
				var home = $("<li></li>").addClass("previous disabled");
				var home1 = $("<a></a>").attr("href","#").append("首页");
				$("#navigatepageNums").append(home.append(home1));
			}else{
				var home = $("<li></li>").addClass("next");
				var home1 = $("<a></a>").append("首页");
				$("#navigatepageNums").append(home.append(home1));
				home.click(function(){
					to_page(1)
				})
			}
			
			//上一页
			if(result.map.PageInfo.hasPreviousPage!=true){
				var previous = $("<li></li>").addClass("previous disabled");
				var previous1 = $("<a></a>").append("&laquo;");
				$("#navigatepageNums").append(previous.append(previous1));
			}else{
				var previous = $("<li></li>").addClass("next");
				var previous1 = $("<a></a>").append("&laquo;");
				$("#navigatepageNums").append(previous.append(previous1));
				previous.click(function(){
					to_page(result.map.PageInfo.prePage)
				})
			}
			
			//显示页码
			$.each(result.map.PageInfo.navigatepageNums,function(index,item){//index:下标，item:元素
				if(result.map.PageInfo.pageNum==result.map.PageInfo.navigatepageNums[index]){
					var page = $("<li></li>").addClass("active");
					var page1 = $("<a></a>").attr("href","#").append(result.map.PageInfo.pageNum);
					$("#navigatepageNums").append(page.append(page1));
				}else{
					var page = $("<li></li>");
					var page1 = $("<a></a>").append(result.map.PageInfo.navigatepageNums[index]);
					$("#navigatepageNums").append(page.append(page1));
					page.click(function(){
						to_page(result.map.PageInfo.navigatepageNums[index])
					})
				}
			})
			
			//下一页
			if(result.map.PageInfo.hasNextPage!=true){
				var next = $("<li></li>").addClass("previous disabled");
				var next1 = $("<a></a>").attr("href","#").append("&raquo;");
				$("#navigatepageNums").append(next.append(next1));
			}else{
				var next = $("<li></li>").addClass("next");
				var next1 = $("<a></a>").append("&raquo;");
				$("#navigatepageNums").append(next.append(next1));
				next.click(function(){
					to_page(result.map.PageInfo.nextPage)
				})
			}
			
			//末页
			if(result.map.PageInfo.isLastPage==true){
				var last = $("<li></li>").addClass("previous disabled");
				var last1 = $("<a></a>").attr("href","#").append("末页");
				$("#navigatepageNums").append(last.append(last1));
			}else{
				var last = $("<li></li>").addClass("next");
				var last1 = $("<a></a>").append("末页");
				$("#navigatepageNums").append(last.append(last1));
				last.click(function(){
					to_page(result.map.PageInfo.pages)
				})
			}
		}
		
		//点击事件
		$("#emp_add_modal_btn").click(function(){
			//清除表单数据
			$("#empAddModal form")[0].reset();
			//发送ajax请求，查出班级信息，显示在下拉列表中
			getsClass("#sClass_add_select");
			<!-- alert("good"); -->
			//弹出模态框
			$("#empAddModal").modal({
				backdrop:"static"
			});
		});
		
		//查出所有的班级并显示在下拉列表中
		function getsClass(ele){
			//清空之前下拉列表的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/depts",
				type:"GET",
				success:function(result){
					//console.log(result)
					//$("#sClass_add_select").append("")
					$.each(result.map.depts,function(){
						var optionEle = $("<option></option>").append(this.sclName).attr("value",this.sclName);
						optionEle.appendTo(ele);
					})
				}
			})
		}
		
		//添加校验表单数据
		function emp_Add_form(){
			//姓名
			var sName = $("#sName_add_input").val();
			var regsName = /(^[A-Za-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			if(!regsName.test(sName)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#sName_add_input","error","用户名可以是2-5位中文或者6-16位英文和数字的组合");
				return false;
			}else{
				show_validate_msg("#sName_add_input","success","");
			}
			
			//本人电话
			var sPhone = $("#sPhone_add_input").val();
			var regsPhone = /^[0-9]{11}$/;
			if(!regsPhone.test(sPhone)){
				//alert("电话只能由11位的数字组成");
				show_validate_msg("#sPhone_add_input", "error", "电话只能由11位的数字组成")
				return false;
			}else{
				show_validate_msg("#sPhone_add_input", "success", "")
			}
			
			//身份证号
			var sIdcard = $("#sIdcard_add_input").val();
			var regsIdcard = /(^[X0-9]{16}$)|(^[0-9]{16})/;
			if(!regsIdcard.test(sIdcard)){
				//alert("身份证号可以是X和15位数字或者16位数字组成");
				show_validate_msg("#sIdcard_add_input", "error", "身份证号可以是X和15位数字或者16位数字组成")
				return false;
			}else{
				show_validate_msg("#sIdcard_add_input", "success", "")
			}
			
			//家长姓名
			var sFname = $("#sFname_add_input").val();
			var regsFname = /(^[A-Za-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			if(!regsFname.test(sFname)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#sFname_add_input", "error", "用户名可以是2-5位中文或者6-16位英文和数字的组合")
				return false;
			}else{
				show_validate_msg("#sFname_add_input", "success", "")
			}
			
			//家长电话
			var sFphone = $("#sFphone_add_input").val();
			var regsFphone = /^[0-9]{11}$/;
			if(!regsFphone.test(sFphone)){
				//alert("电话只能由11位的数字组成");
				show_validate_msg("#sFphone_add_input", "error", "电话只能由11位的数字组成")
				return false;
			}else{
				show_validate_msg("#sFphone_add_input", "success", "")
			}
			return true;
		}
		
		//显示校验结果的提示信息
		function show_validate_msg(ele,status,msg) {
			//清除当前元素的校验状态
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
			if("success"==status){
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text(msg);
			}else if("error"==status){
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
			}
		}
		
		//校验用户名是否可用
		$("#sName_add_input").change(function() {
			var sName = this.value;
			$.ajax({
				url:"${APP_PATH}/checkuser",
				type:"POST",
				data:"sName="+sName,
				success:function(result){
					if(result.code==100){
						show_validate_msg("#sName_add_input","success","用户名可用");
						$("#emp_save_btn").attr("ajax-va","success");
					}else{
						show_validate_msg("#sName_add_input","error","用户名已存在");
						$("#emp_save_btn").attr("ajax-va","error");
					}
				}
			})
		});
		
		$("#emp_save_btn").click(function(){
			//对数据进行校验
			if(!emp_Add_form()){
				return false;
			}
			//alert($("#empAddModal form").serialize());
			//判断之前的ajax用户名校验是否成功
			if($(this).attr("ajax-va")=="error"){
				return false;
			}
			//模态框中填写的表单数据提交给服务器进行保存
			$.ajax({
				url:"${APP_PATH}/bas",
				type:"POST",
				data:$("#empAddModal form").serialize(),
				success:function(result){
					if(result.code == 100){
						//关闭模态框
						$("#empAddModal").modal('hide');
						//来到最后一页，显示数据
						to_page(totalRecord);
					}else{
						//显示失败信息
						//console.log(result);
						if(undefined != result.map.errorFields.sName){
							//显示姓名错误信息
							show_validate_msg("#sName_add_input","error",result.map.errorFields.sName);
						}
						if(undefined != result.map.errorFields.sPhone){
							//显示本人电话错误信息
							show_validate_msg("#sPhone_add_input", "error", result.map.errorFields.sPhone)
						}
						if(undefined != result.map.errorFields.sIdcard){
							//显示身份证号错误信息
							show_validate_msg("#sIdcard_add_input", "error", result.map.errorFields.sIdcard)
						}
						if(undefined != result.map.errorFields.sFname){
							//显示家长姓名错误信息
							show_validate_msg("#sFname_add_input", "error", result.map.errorFields.sFname)
						}
						if(undefined != result.map.errorFields.sFphone){
							//显示家长电话错误信息
							show_validate_msg("#sFphone_add_input", "error", result.map.errorFields.sFphone)
						}
					}
				}
			})
		})
		
		//修改
		$(document).on("click",".update_btn",function(){
			//发送ajax请求，查出班级信息，显示在下拉列表中
			getsClass("#empUpdateModal select");
			//查出学生信息，并显示
			getUpdate($(this).attr("update_id"));
			<!-- alert("good"); -->
			//把学生的id传递给模态框的修改按钮
			$("#empUpdate_save_btn").attr("update_id",$(this).attr("update_id"));
			//弹出模态框
			$("#empUpdateModal").modal({
				backdrop:"static"
			});
		})
		
		//获取学生信息
		function getUpdate(id) {
			$.ajax({
				url:"${APP_PATH}/update/"+id,
				type:"GET",
				success:function(result){
					//console.log(result)
					var updateData = result.map.update;
					$("#sName_update_p").text(updateData.sName);
					$("#empUpdateModal input[name=sSex]").val([updateData.sSex]);
					$("#empUpdateModal select").val([updateData.sClass]);
					$("#sPhone_update_input").val(updateData.sPhone);
					$("#sIdcard_update_input").val(updateData.sIdcard);
					$("#sFname_update_input").val(updateData.sFname);
					$("#sFphone_update_input").val(updateData.sFphone);
				}
			})
		}
		
		$("#empUpdate_save_btn").click(function(){
			//本人电话
			var sPhone = $("#sPhone_update_input").val();
			var regsPhone = /^[0-9]{11}$/;
			if(!regsPhone.test(sPhone)){
				//alert("电话只能由11位的数字组成");
				show_validate_msg("#sPhone_update_input", "error", "电话只能由11位的数字组成")
				return false;
			}else{
				show_validate_msg("#sPhone_update_input", "success", "")
			}
			
			//身份证号
			var sIdcard = $("#sIdcard_update_input").val();
			var regsIdcard = /(^[X0-9]{16}$)|(^[0-9]{16})/;
			if(!regsIdcard.test(sIdcard)){
				//alert("身份证号可以是X和15位数字或者16位数字组成");
				show_validate_msg("#sIdcard_update_input", "error", "身份证号可以是X和15位数字或者16位数字组成")
				return false;
			}else{
				show_validate_msg("#sIdcard_update_input", "success", "")
			}
			
			//家长姓名
			var sFname = $("#sFname_update_input").val();
			var regsFname = /(^[A-Za-z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
			if(!regsFname.test(sFname)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#sFname_update_input", "error", "用户名可以是2-5位中文或者6-16位英文和数字的组合")
				return false;
			}else{
				show_validate_msg("#sFname_update_input", "success", "")
			}
			
			//家长电话
			var sFphone = $("#sFphone_update_input").val();
			var regsFphone = /^[0-9]{11}$/;
			if(!regsFphone.test(sFphone)){
				//alert("电话只能由11位的数字组成");
				show_validate_msg("#sFphone_update_input", "error", "电话只能由11位的数字组成")
				return false;
			}else{
				show_validate_msg("#sFphone_update_input", "success", "")
			}
			
			//发送ajax请求保存修改后的学生信息
			$.ajax({
				url:"${APP_PATH}/update/"+$(this).attr("update_id"),
				type:"PUT",
				data:$("#empUpdateModal form").serialize(),
				success:function(result){
					$("#empUpdateModal").modal('hide');
					//来到最后一页，显示数据
					to_page(currentPage);
				}
			})
		})
		
		//删除单条学生信息
		$(document).on("click",".delect_btn",function(){
			var sName = $(this).parents("tr").find("td:eq(2)").text();
			var delectId = $(this).attr("delect_id");
			if(confirm("确定删除【"+sName+"】的全部信息吗？")){
				//确定删除，发送ajax请求进行删除
				$.ajax({
					url:"${APP_PATH}/emp/"+delectId,
					type:"DELETE",
					success:function(result){
						to_page(currentPage);
					}
				})
			}
		})
		
		//全选/全不选功能
		$("#checkbox_delect").click(function(){
			$(".checkbox_item").prop("checked",$(this).prop("checked"));
		})
		
		$(document).on("click",".checkbox_item",function(){
			var flag = $(".checkbox_item:checked").length == $(".checkbox_item").length;
			$("#checkbox_delect").prop("checked",flag);
		})
		
		//批量删除
		$("#emp_delect_modal_btn").click(function(){
			var sNames = "";
			var del_idstr = "";
			$.each($(".checkbox_item:checked"),function(){
				//组装学生姓名字符串
				sNames += $(this).parents("tr").find("td:eq(2)").text()+",";
				//组装学生id字符串
				del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
			})
			//去掉多余的,
			sNames = sNames.substring(0,sNames.length-1);
			//去掉多余的-
			del_idstr = del_idstr.substring(0,sNames.length-1);
			if(confirm("确定删除【"+sNames+"】的全部信息吗？")){
				$.ajax({
					url:"${APP_PATH}/emp/"+del_idstr,
					type:"DELETE",
					success:function(result){
						to_page(currentPage);
					}
				})
			}
		})
		
		//按输入的学号进行查询
		$(document).on("click","#emp_select_modal_btn",function(){
			//alert($("#select_input").val());
			var selectData = "";
			var select_sNumber = $("#select_input").val();
			$.ajax({
				url:"${APP_PATH}/update/"+select_sNumber,
				type:"GET",
				success:function(result){
					//console.log(result)
					selectData = result.map.update;
					var selectSex = selectData.sSex==0?'男':'女';
					alert("学生姓名：【"+selectData.sName
							+"】\n性别：【"+selectSex
							+"】\n本人电话：【"+selectData.sPhone
							+"】\n家长电话：【"+selectData.sFphone
							+"】\n家长姓名：【"+selectData.sFname
							+"】\n身份证号：【"+selectData.sIdcard
							+"】\n班级：【"+selectData.sClass
							+"】");
				}
			})
		})
		
		//详情
		$(document).on("click",".select_btn",function(){
			$.ajax({
				url:"${APP_PATH}/update/"+$(this).attr("select_id"),
				type:"GET",
				success:function(result){
					//console.log(result)
					selectData = result.map.update;
					var selectSex = selectData.sSex==0?'男':'女';
					var selectIsspe = "";
					if(selectData.sIsspe==0){
						selectIsspe = "正常";
					}else if(selectData.sIsspe==1){
						selectIsspe = "低保户";
					}else if(selectData.sIsspe==2){
						selectIsspe = "单亲家庭";
					}else if(selectData.sIsspe==3){
						selectIsspe = "残疾家庭";
					}else if(selectData.sIsspe==4){
						selectIsspe = "建档立卡";
					}else{
						selectIsspe = "雨露计划户";
					}
					var selectIsfreshg = selectData.sIsfreshg==0?'是':'不是';
					var selectStatus = "";
					if(selectData.sStatus==0){
						selectStatus = "已注册";
					}else if(selectData.sStatus==1){
						selectStatus = "已注销";
					}else if(selectData.sStatus==2){
						selectStatus = "已退学";
					}else{
						selectStatus = "已毕业";
					}
					var selectIsdegree = selectData.sIsdegree==0?'有':'没有';
					alert("学生姓名：【"+selectData.sName
							+"】\n性别：【"+selectSex
							+"】\n出生日期：【"+selectData.sBirthday
							+"】\n家庭住址：【"+selectData.sAddr
							+"】\n本人电话：【"+selectData.sPhone
							+"】\n本人QQ：【"+selectData.sQq
							+"】\n本人微信：【"+selectData.sWeixin
							+"】\n家长电话：【"+selectData.sFphone
							+"】\n家长姓名：【"+selectData.sFname
							+"】\n身份证号：【"+selectData.sIdcard
							+"】\n特殊家庭：【"+selectIsspe
							+"】\n毕业学校：【"+selectData.sGschool
							+"】\n是否应届生：【"+selectIsfreshg
							+"】\n班级：【"+selectData.sClass
							+"】\n学号：【"+selectData.sNumber
							+"】\n进校时间：【"+selectData.sIndate
							+"】\n离校时间：【"+selectData.sOutdate
							+"】\n专业：【"+selectData.sProfession
							+"】\n记录时间：【"+selectData.sRecordtime
							+"】\n最后一次更新：【"+selectData.sLasttime
							+"】\n状态：【"+selectStatus
							+"】\n是否有大专：【"+selectIsdegree
							+"】")
				}
			})
		})
	</script>
</body>
</html>