	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('yjs091', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'CPUB电流遥测'
	            },
	            xAxis: {
	                type: 'datetime',
	                tickPixelInterval: 10,
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
	                
					min: -1,  //最小
					tickInterval: 0.1, //步长
					max:1,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -1,
			              to: 0,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0,
			              to: 1,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 3.5,
			              to: 4,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
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
	                enabled: true
	            },
	            exporting: {
	                enabled: true
	            },
	            credits: {
	                enabled: false
	            },
	            series: [{
	                name: '电流遥测',
	            }]
	        });
	    });
	});