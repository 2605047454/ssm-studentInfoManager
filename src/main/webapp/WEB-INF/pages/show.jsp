<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	pageContext.setAttribute("APP_PATH", request.getContextPath());
	//获取项目路径(注意：它以斜杠开始，但不以斜杆结尾，所以el表达式后要加斜杆)
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/static/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<!-- href：里面的路径是你导入在static文件夹里面下面bootstrap.min.css所在的路径，下面两个属性一样 -->
<script type="text/javascript"
	src="<%=basePath%>/static/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/static/bootstrap-3.3.7/js/tests/vendor/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示学生信息页</title>
</head>
<body style="background:#87CEEB">

	<div class="col-md-4 col-md-offset-1">
		<form class="navbar-form navbar-left">
        	<div class="form-group">
          		<input type="text" class="form-control" placeholder="请输入学号">
        	</div>
        	<button type="submit" class="btn btn-default">
        		<span class="glyphicon glyphicon-search"></span>查询
     	   	</button>
     	</form>
     </div>
     
	<div class="container">
		<div class="col-md-4 col-md-offset-8"  align="center">
			<div class="row">
				<button type="button" class="btn btn-success">
					<span class="glyphicon glyphicon-plus"></span>添加
				</button>
			</div>
		</div>
	</div>
	
	<div class="row">
		<div class="col-md-10 col-md-offset-1">
		<table class="table table-hover">
			<thead>
				<tr>
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
		<tbody>
			<c:forEach items="${PageInfo.list}" var="stu">
				<tr>
					<td>${stu.sName }</td>
					<td>${stu.sSex==0?'男':'女' }</td>
					<td>${stu.sClass }</td>
					<td>${stu.sPhone }</td>
					<td>${stu.sIdcard }</td>
					<td>${stu.sFname }</td>
					<td>${stu.sFphone }</td>
					<td>
						<button type="button" class="btn btn-warning">
							<span class="glyphicon glyphicon-pencil"></span>修改</button>
					</td>
					<td>
						<button type="button" class="btn btn-danger">
							<span class="glyphicon glyphicon-trash"></span>删除</button>
					</td>
					<td>
						<button type="button" class="btn btn-info">
							<span class="glyphicon glyphicon-user"></span>详细信息</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		</table>
		</div>
	</div>
	
	<div class="col-md-4 col-md-offset-8" align="center">
		<div class="row">
			当前是第<b style="color: red;">${PageInfo.pageNum }</b>页，总<b
				style="color: red;">${PageInfo.pages }</b>共页
		</div>
	</div>
	
	<div class="col-md-4 col-md-offset-5">
		<div class="row">
			<nav aria-label="Page navigation">
			<ul class="pagination">
			<c:if test="${PageInfo.isFirstPage==true }">
			<!-- 判断是否为第一页，是就不能点击 -->
				<li class="previous disabled">
				<!-- bootstrap样式，previous disabled为不可以点击 -->
					<a href="#">首页</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.isFirstPage!=true }">
			<!-- 判断是否为第一页，不是就能点击 -->
				<li class="next">
				<!-- bootstrap样式，next为可以点击 -->
					<a href="${APP_PATH }/allstu?pn=1">首页</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.hasPreviousPage==true }">
			<!-- 判断是否有前一页，有就可以点击 -->
				<li class="next">
				<!-- bootstrap样式，next为可以点击 -->
					<a href="${APP_PATH }/allstu?pn=${PageInfo.prePage }" aria-label="Previous">
					<!-- 前一页 -->
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.hasPreviousPage!=true }">
			<!-- 判断是否有前一页，没有不可以点击 -->
				<li class="previous disabled">
				<!-- bootstrap样式，previous disabled为不可以点击 -->
					<a href="#" aria-label="Previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
			</c:if>
			<c:forEach items="${PageInfo.navigatepageNums }" var="pageNums">
			<!-- 获取所有页码集 -->
				<c:if test="${pageNums==PageInfo.pageNum }">
				<!-- 判断是否为当前页，是就显示高亮样式并且点击当前页面不会发送请求 -->
					<li class="active"><a href="#">${pageNums }</a></li>
					<!-- active:高亮样式 -->
				</c:if>
				<c:if test="${pageNums!=PageInfo.pageNum }">
				<!-- 判断是否为当前页，不是就不显示高亮模式并且点击其他页面可以发送请求 -->
					<li><a href="${APP_PATH }/allstu?pn=${pageNums }">${pageNums }</a></li>
				</c:if>
			</c:forEach>
			<c:if test="${PageInfo.hasNextPage == true }">
			<!-- 判断是否有下一页，有就可以点击 -->
				<li class="next">
				<!-- bootstrap样式，next为可以点击 -->
					<a href="${APP_PATH }/allstu?pn=${PageInfo.nextPage }" aria-label="Next">
						<spanaria-hidden="true">&raquo;</span>
					</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.hasNextPage != true }">
			<!-- 判断是否有下一页，没有就不可以点击 -->
				<li class="previous disabled">
				<!-- bootstrap样式，previous disabled为不可以点击 -->
					<a href="#" aria-label="Next">
						<spanaria-hidden="true" >&raquo;</span>
					</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.isLastPage != true }">
			<!-- 判断是否为最后一页，不是可以点击 -->
				<li class="next">
				<!-- bootstrap样式，next为可以点击 -->
					<a href="${APP_PATH }/allstu?pn=${PageInfo.pages }">未页</a>
				</li>
			</c:if>
			<c:if test="${PageInfo.isLastPage == true }">
			<!-- 判断是否为最后一页，是不可以点击 -->
				<li class="previous disabled">
				<!-- bootstrap样式，previous disabled为不可以点击 -->
					<a href="#">未页</a>
				</li>
			</c:if>
			</ul>
			</nav>
		</div>
	</div>
</body>
</html>