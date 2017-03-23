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
	<title>图像信息</title>
	<!-- Bootstrap core CSS -->
    <link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">
    
    <!--external css-->
    <link href="${ctx}/dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${ctx}/dashgum/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/dashgum/lineicons/style.css">  
    
    <!-- Custom styles for this template -->
    <link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
	<style>
		.font_bk{
			width:200px;
			height:80px;
			background-color:#3bb7fc;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:10px;
			font-size:48;
			color:#ffffff;
		}
		.font_bk1{
			width:200px;
			height:80px;
			background-color:#1189cc;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:10px;
			font-size:48;
			color:#ffffff;
		}
	</style>

    
	</head>
	<body>
		<table class="container">
			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp130">磁强计A正12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp131">磁强计A负12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp132">磁强计B正12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp133">磁强计B负12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp134">模拟太敏正12V<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk1" id="ydp135">模拟太敏负12V<br>Value</div></th>
				<th><div  class="font_bk1" id="ydp136">陀螺正12V<br>Value</div></th>
				<th><div  class="font_bk1" id="ydp137">陀螺负12V<br>Value</div></th>
				<th><div  class="font_bk1" id="ydp138">GPS接收机<br>Value</div></th>
				<th><div  class="font_bk1" id="ydp139">动量轮<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp140">动量轮控制器正12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp141">动量轮控制器负12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp142">磁力矩控制器正12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp143">磁力矩控制器负12V<br>Value</div></th>
				<th><div  class="font_bk" id="ydp144">相机状态<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk1" id="ydp145">蓄电池母线接入<br>Value</div></th>
				<th><div  class="font_bk1" id="ydp146">分流电路主备份工作状态<br>Value</div></th>
			</tr>
			<tr height=100></tr>
		</table>
	
	</body>
	<script src="${ctx}/js/websocket_datapage82.js"></script>
</html>