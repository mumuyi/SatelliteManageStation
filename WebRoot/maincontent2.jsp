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
${demo.css}
		</style>
				<script type="text/javascript">
$(function () {
    $(document).ready(function () {
        Highcharts.setOptions({
            global: {
                useUTC: false
            }
        });

        Highcharts.chart('container', {
            chart: {
                type: 'spline',
                animation: Highcharts.svg, // don't animate in old IE
                marginRight: 10,
                events: {
                    load: function () {

                        // set up the updating of the chart each second
                        var series = this.series[0];
                        var dataflag=0;
                        setInterval(function () {
                            var x = (new Date()).getTime(), // current time
                                y =getMyData(dataflag);
                                //y=Math.random();
                            series.addPoint([x, y], true, false);
                            dataflag=(dataflag+1)%10;
                        }, 1000);
                    }
                }
            },
            title: {
                text: 'Live random data'
            },
            xAxis: {
                type: 'datetime',
                tickPixelInterval: 50
            },
            yAxis: {
                title: {
                    text: 'Value'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }],
                
				min: 50,  //最小
				tickInterval: 10, //步长
				max:200,//最大 
                
                // 不同Y轴范围设置不同颜色 begin
				plotBands: [{ 
		              from: 50,
		              to: 100,
		              color: 'rgba(168, 255, 213, 0.3)',
		              label: {
		                  text: '偏低',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: 100,
		              to: 150,
		              color: 'rgba(68, 70, 213, 0.3)',
		              label: {
		                  text: '正常',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: 150,
		              to: 200,
		              color: 'rgba(255, 97, 0, 0.3)',
		              label: {
		                  text: '偏高',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          }]
            },
            tooltip: {
                formatter: function () {
                    return '<b>' + this.series.name + '</b><br/>' +
                        Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x) + '<br/>' +
                        Highcharts.numberFormat(this.y, 2);
                }
            },
            legend: {
                enabled: false
            },
            exporting: {
                enabled: false
            },
            series: [{
                name: 'Random data',
                data: (function () {
                    // generate an array of random data
                    var data = [],
                        time = (new Date()).getTime(),
                        i;

                    for (i = -9; i <= 0; i += 1) {
                        data.push({
                            x: time + i * 1000,
                            y: Math.random()*100+50
                        });
                        //alert(Math.random());
                    }
                    return data;
                }())
            }]
        });
    });
});
		</script>
	</head>
	<body>
<script src="${ctx}/highcharts/js/highcharts.js"></script>
<script src="${ctx}/highcharts/js/exporting.js"></script>

<div id="container" style="height: 600px; min-width: 310px ; max-width: 800px; margin:0 auto;" ></div>
	</body>
	<script src="${ctx}/js/websocket_charts.js"></script>
</html>

