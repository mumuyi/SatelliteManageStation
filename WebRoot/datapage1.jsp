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
			width:300px;
			height:200px;
			background-color:#65934a;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:60px;
			font-size:36px;
			color:#ffffff;
		}
		.font_bk1{
			width:300px;
			height:200px;
			background-color:#fae371;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:60px;
			font-size:36px;
			color:#ffffff;
		}
	</style>




    
	</head>
	<body>
		<table class="container">
			<tr height=50></tr>
			<tr>
				<th></th>
				<th></th>
				<th><div  class="font_bk" id="datapage5">数据综合系统遥测信息</div></th>
			</tr>
			
			<tr height=80></tr>
			<tr>
				<th></th>
				<th><div  class="font_bk" id="datapage6">姿控原始测量遥测信息</div></th>
				<th></th>
				<th><div  class="font_bk" id="datapage7">姿控功能遥测信息</div></th>
			</tr>
			<tr height=80></tr>
			<tr>
				<th></th>
				<th><div  class="font_bk" id="datapage8">电源系统遥测信息</div></th>
				<th></th>
				<th><div  class="font_bk" id="datapage9">通信系统遥测信息</div></th>
			</tr>
			
		</table>
		<!-- <button onclick="add()">add</button> -->
	</body>
	
	<script type="text/javascript">
	function add() {
		document.getElementById("datapage5").className="font_bk1";
	}
	</script>
</html>