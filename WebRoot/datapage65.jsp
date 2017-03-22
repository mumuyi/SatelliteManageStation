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
					<h3 id="ygp024">UTC累计秒<br>4134144</h3>
				</div>
				<p id="ygp0241">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp025">UTC微秒<br>1058340864</h3>
				</div>
				<p id="ygp0251">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp032">GDOP<br>21</h3>
				</div>
				<p id="ygp0321">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp033">工作状态<br>1377799</h3>
				</div>
				<p id="ygp0331">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp034">跳秒<br>352716544</h3>
				</div>
				<p id="ygp0341">Some information if it's need</p>
			</div>
			
			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp046">最高信噪比<br>117440522</h3>
				</div>
				<p id="ygp0461">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp047">最低信噪比<br>666627</h3>
				</div>
				<p id="ygp0471">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage65.js"></script>
</html>