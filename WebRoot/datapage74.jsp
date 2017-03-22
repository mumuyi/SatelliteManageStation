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
					<h3 id="ykz063">阻尼标志<br>4134144</h3>
				</div>
				<p id="ykz0631">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz060">阻尼次数<br>1058340864</h3>
				</div>
				<p id="ykz060">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz064">俯仰滤波标志<br>21</h3>
				</div>
				<p id="ykz0641">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz061">滤波次数<br>1377799</h3>
				</div>
				<p id="ykz0611">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz065">俯仰控制标志<br>352716544</h3>
				</div>
				<p id="ykz0651">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz062">俯仰控制次数<br>4134144</h3>
				</div>
				<p id="ykz0621">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz066">三轴稳定标志<br>1058340864</h3>
				</div>
				<p id="ykz0661">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz067">俯仰激动控制标志<br>21</h3>
				</div>
				<p id="ykz0671">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz068">隐身保持控制标志<br>1377799</h3>
				</div>
				<p id="ykz0681">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz069">隐身恢复控制标志<br>352716544</h3>
				</div>
				<p id="ykz0691">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 col-md-offset-1 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz501">自主导航标志<br>4134144</h3>
				</div>
				<p id="ykz5011">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz502">自主导航接入标志<br>1058340864</h3>
				</div>
				<p id="ykz5021">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_stack"></span>
					<h3 id="ykz503">永久阻尼标志<br>21</h3>
				</div>
				<p id="ykz5031">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage74.js"></script>
</html>