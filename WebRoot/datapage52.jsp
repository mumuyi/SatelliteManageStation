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


    
	</head>
	<body>
		<div class="row mtbox">
			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz093">图像片选(写)<br>4134144</h3>
				</div>
				<p id="ydz0931">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz094">图像行(写)<br>1058340864</h3>
				</div>
				<p id="ydz0941">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz095">图像块(写)<br>21</h3>
				</div>
				<p id="ydz0951">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz096">图像片选(读)<br>1377799</h3>
				</div>
				<p id="ydz0961">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz097">图像行(读)<br>352716544</h3>
				</div>
				<p id="ydz0971">Some information if it's need</p>
			</div>
			
			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz098">图像块(读)<br>117440522</h3>
				</div>
				<p id="ydz0981">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz099">遥测片选(写)<br>666627</h3>
				</div>
				<p id="ydz0991">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz100">遥测行(写)<br>170656512</h3>
				</div>
				<p id="ydz1001">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz101">遥测块(写)<br>50331651</h3>
				</div>
				<p id="ydz1011">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz102">遥测片选(读)<br>207617</h3>
				</div>
				<p id="ydz1021">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz103">遥测行(读)<br>53149952</h3>
				</div>
				<p id="ydz1031">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz104">遥测块(写)<br>16777216</h3>
				</div>
				<p id="ydz1041">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage52.js"></script>
</html>