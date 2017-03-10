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
<title>Highstock Example</title>

<script type="text/javascript" src="${ctx}/highcharts/js/jquery-1.8.3.min.js"></script>
<style type="text/css">
${
demo


.css


}
</style>
	<script type="text/javascript">
		$(function () {
		
		    Highcharts.setOptions({
		        global: {
		            useUTC: false
		        }
		    });
		
		    // Create the chart
		    Highcharts.stockChart('container', {
		        chart: {
		        },
		
		        rangeSelector: {
		            buttons: [{
		                count: 1,
		                type: 'minute',
		                text: '1M'
		            }, {
		                count: 5,
		                type: 'minute',
		                text: '5M'
		            }, {
		                type: 'all',
		                text: 'All'
		            }],
		            inputEnabled: false,
		            selected: 0
		        },
		
		        title: {
		            text: 'Live random data'
		        },
		
		        exporting: {
		            enabled: false
		        },
		
		        series: [{
		            name: 'Random data',
		            data: 'url'
		        }]
		    });
		
		});
	</script>
	<script type="text/javascript">
		function add() {
			    var chart = $('#container').highcharts();
	        	chart.series[0].addPoint([(new Date()).getTime(),Math.round(Math.random() * 100)]);
	    }
	</script>
</head>
<body>
	<script src="${ctx}/highcharts/js/highstock.js"></script>
	<script src="${ctx}/highcharts/js/exporting.js"></script>

	<div id="container" style="height: 600px; min-width: 310px ; max-width: 800px; margin:0 auto;"></div>
	
	<button onclick="add()">add</button>
</body>
</html>

