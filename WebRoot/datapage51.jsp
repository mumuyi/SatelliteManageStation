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
	<title>CPU相关信息</title>
	
	<script type="text/javascript" src="${ctx}/highcharts/js/jquery-1.8.3.min.js"></script>
	<style type="text/css">
	${
	demo
	.css
	}
	</style>
		<script src="${ctx}/js/highcharts511.js"></script>
		<script src="${ctx}/js/highcharts512.js"></script>
	</head>
	<body>
		<script src="${ctx}/highcharts/js/highcharts.js"></script>
		<script src="${ctx}/highcharts/js/exporting.js"></script>
		
		 <div class="row">
		 	<div class="col">
		 		<div id="yjs087" style="height: 400px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div>
		 	</div>
			<div class="col">
		 		<div id="yjs088" style="height: 400px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div>
		 	</div>
		</div>
		
		
	</body>
	<script src="${ctx}/js/websocket_highcharts51.js"></script>
</html>