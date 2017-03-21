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
					<h3 id="ydp11">数字显示啊啊啊啊啊啊啊啊啊<br>222222</h3>
				</div>
				<p id="ydp111">Your server is working perfectly. Relax & enjoy.</p>
			</div>
	
		</div>
		<!-- /row mt -->
		
		<button onclick="add()">add</button>
	</body>
	<script type="text/javascript">
		function add() {
			var chart = document.getElementById("ydp11");
			chart.innerHTML="111111111111";
		}
	</script>
</html>