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
			<tr height=50></tr>
			<tr>
				<th></th>
				<th></th>
				<th><div  class="font_bk" id="ykm001">控制模式信息<br>Value</div></th>
			</tr>
			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp157">CPUA看门狗输出<br>Value</div></th>
				<th><div  class="font_bk" id="ydp158">CPUB看门狗输出<br>Value</div></th>
				<th><div  class="font_bk" id="ydp159">CPUA系统失效<br>Value</div></th>
				<th><div  class="font_bk" id="ydp160">CPUB系统失效<br>Value</div></th>
				<th><div  class="font_bk" id="ydp161">CPUA工作状态<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp162">CPUB工作状态<br>Value</div></th>
				<th><div  class="font_bk" id="ydp163">CPU自动切机使能<br>Value</div></th>
				<th><div  class="font_bk" id="ydp164">CPUB过流<br>Value</div></th>
				<th><div  class="font_bk" id="ydp165">CPUA过流<br>Value</div></th>
				<th><div  class="font_bk" id="ydp166">星箭分离遥测1<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ydp167">星箭分离遥测2<br>Value</div></th>
				<th><div  class="font_bk" id="ygz185">陀螺有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz186">GPS有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz187">磁力矩器有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz188">太敏有效<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="ygz189">磁强计A有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz190">磁强计B有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz191">动量轮有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz192">动量轮控制器有效<br>Value</div></th>
				<th><div  class="font_bk" id="ygz193">相机有效<br>Value</div></th>
			</tr>
			
			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="yxs504">通信体制标识<br>Value</div></th>
				<th><div  class="font_bk" id="yxs505">蓄电池过放保护标识<br>Value</div></th>
				<th><div  class="font_bk" id="yxs601">通信体制切换禁止标识<br>Value</div></th>
				<th><div  class="font_bk" id="yxs602">星箭分离表示<br>Value</div></th>
				<th><div  class="font_bk" id="yxs603">理论轨道可用标识<br>Value</div></th>
			</tr>
			
			<tr height=100></tr>
			<tr>
				<th><div  class="font_bk" id="yxs610">地面电测模式标识<br>Value</div></th>
			</tr>
			<tr height=100></tr>
		</table>
	
	</body>
	<script src="${ctx}/js/websocket_datapage55.js"></script>
</html>