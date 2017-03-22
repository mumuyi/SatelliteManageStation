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
					<span class="li_stack"></span>
					<h3 id="ytx075">通信机收到指令计数<br>4134144</h3>
				</div>
				<p id="ytx0751">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ytx076">通信机收到注数计数<br>1058340864</h3>
				</div>
				<p id="ytx0761">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ytx077">应答机收到指令计数<br>21</h3>
				</div>
				<p id="ytx0771">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ytx078">应答机收到注数计数<br>1377799</h3>
				</div>
				<p id="ytx0781">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yty506">通信机送出指令计数<br>352716544</h3>
				</div>
				<p id="yty5061">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yty507">通信机送出注数计数<br>4134144</h3>
				</div>
				<p id="yty5071">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yty508">应答机送出指令计数<br>1058340864</h3>
				</div>
				<p id="yty5081">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yty509">应答机送出注数计数<br>21</h3>
				</div>
				<p id="yty5091">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage92.js"></script>
</html>