	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ygn039', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'Z轴磁棒遥测磁矩'
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
	                
					min: -15,  //最小
					tickInterval: 1, //步长
					max:15,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -15,
			              to: -13.5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -13.5,
			              to: 13.5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 13.5,
			              to: 15,
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
	                name: '磁矩信息',
	            }]
	        });
	    });
	});