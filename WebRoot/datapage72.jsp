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
		<script src="${ctx}/js/highcharts72.js"></script>
	</head>
	<body>
		<script src="${ctx}/highcharts/js/highcharts.js"></script>
		<script src="${ctx}/highcharts/js/exporting.js"></script>
		
		
		<table width="100%" border="0">
		  <tr>
    		<th><div id="ykl057" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ykl058" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ykl059" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ykl053" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ykl054" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ykl055" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ykl056" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=100></tr>
		</table>
	</body>
	<script src="${ctx}/js/websocket_datapage72.js"></script>
</html>