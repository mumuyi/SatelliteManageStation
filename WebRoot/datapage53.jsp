<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	
    <!-- Bootstrap core CSS -->
    <link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${ctx}/dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
    <link href="${ctx}/dashgum/css/style-responsive.css" rel="stylesheet">
    
    <style type="text/css">
    	td{ border-bottom:10px solid blue}
  	</style>
    
	</head>
	<body>
		<div style="width:60px; height:60px;"></div>
		<table class="container">
			<tr>
				<th width=50%>下次发射机开机时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj001d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj001h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj001m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj001s">12</button>
				</th>
			</tr>
			<tr height=50></tr>
			<tr>
				<th width=50%>待执行隐身试验开始时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj002d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj002h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj002m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj002s">12</button>
				</th>
			</tr>
			<tr height=50></tr>
			<tr>
				<th width=50%>待执行隐身试验返回时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj003d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj003h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj003m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj003s">12</button>
				</th>
			</tr>
			<tr height=50></tr>
			<tr>
				<th width=50%>待执行成像时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj004d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj004h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj004m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj004s">12</button>
				</th>
			</tr>
			<tr height=50></tr>
			<tr>
				<th width=50%>待执行行数传规划开始时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj005d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj005h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj005m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj005s">12</button>
				</th>
			</tr>
			<tr height=50></tr>
			<tr>
				<th width=50%>待执行行数传规划结束时间</th>
				<th class="container">
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj006d">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj006h">12</button>:
						<button type="button" class="btn btn-theme" style="width:60px; height:60px;" id="ysj006m">12</button>:
						<button type="button" class="btn btn-theme03" style="width:60px; height:60px;" id="ysj006s">12</button>
				</th>
			</tr>
			<tr height=150></tr>
		</table>
	</body>

</html>