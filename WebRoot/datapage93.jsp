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
	</style>

    
	</head>
	<body>
		<table class="container">
			<tr height=300></tr>
			<tr>
				<th><div  class="font_bk" id="ydp147">通信机接收机锁定<br>Value</div></th>
				<th><div  class="font_bk" id="ydp148">应答机接收机锁定<br>Value</div></th>
				<th><div  class="font_bk" id="ydp149">通信机发射机<br>Value</div></th>
				<th><div  class="font_bk" id="ydp150">通信机发射功率<br>Value</div></th>
				<th><div  class="font_bk" id="ydp151">应答机发射机<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp152">应答机接收机<br>Value</div></th>
				<th><div  class="font_bk" id="ydp153">应答机测距<br>Value</div></th>
				<th><div  class="font_bk" id="ydp154">应答机相干<br>Value</div></th>
				<th><div  class="font_bk" id="ydp155">通信机加电状态<br>Value</div></th>
				<th><div  class="font_bk" id="ydp156">USB加电状态<br>Value</div></th>
			</tr>

			<tr height=100></tr>
		</table>
	
	</body>
	<script src="${ctx}/js/websocket_datapage93.js"></script>
</html>