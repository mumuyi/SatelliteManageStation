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
			<div class="col-md-2 col-sm-2 col-md-offset-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl169">待执行图像成像指令计数<br>4134144</h3>
				</div>
				<p id="yzl1691">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl170">已执行图像成像指令计数<br>1058340864</h3>
				</div>
				<p id="yzl1701">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl171">待执行隐身试验指令计数<br>21</h3>
				</div>
				<p id="yzl1711">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl172">已执行隐身试验指令计数<br>1377799</h3>
				</div>
				<p id="yzl1721">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 col-md-offset-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl173">已正确执行姿控参数计数<br>352716544</h3>
				</div>
				<p id="yzl1731">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl174">已执行供配电开关指令计数<br>4134144</h3>
				</div>
				<p id="yzl1741">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl175">已正确执行模式控制指令计数<br>1058340864</h3>
				</div>
				<p id="yzl1751">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl176">已执行下行定制指令计数<br>21</h3>
				</div>
				<p id="yzl1761">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 col-md-offset-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl177">已正确执行地面调试指令计数<br>1377799</h3>
				</div>
				<p id="yzl1771">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl178">已正确执行通信系统指令计数<br>352716544</h3>
				</div>
				<p id="yzl1781">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl179">已正确执行电源系统指令计数<br>4134144</h3>
				</div>
				<p id="yzl1791">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl180">已正确执行数据综合系统指令计数<br>1058340864</h3>
				</div>
				<p id="yzl1801">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 col-md-offset-4 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl182">收到所有入站指令计数<br>21</h3>
				</div>
				<p id="yzl1821">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="yzl183">所有控制指令入站计数<br>1377799</h3>
				</div>
				<p id="yzl1831">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage54.js"></script>
</html>