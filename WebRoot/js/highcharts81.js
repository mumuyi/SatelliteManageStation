	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy079', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '母线电压'
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
	                
					min: 20,  //最小
					tickInterval: 1, //步长
					max:31,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: 20,
			              to: 21,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 21,
			              to: 30,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 30,
			              to: 31,
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
	                name: '母线电压',
	            }]
	        });
	    });
	});
	
	
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy080', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '方阵电流'
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
	                
	                
				min: -2,  //最小
				tickInterval: 0.2, //步长
				max:2,//最大 
				
				// 不同Y轴范围设置不同颜色 begin
				plotBands: [{ 
		              from: -2,
		              to: -1,
		              color: 'rgba(255, 97, 0, 0.3)',
		              label: {
		                  text: '预警',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: -1,
		              to: 1,
		              color: 'rgba(168, 255, 213, 0.3)',
		              label: {
		                  text: '正常',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: 1,
		              to: 2,
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
	                name: '方阵电流',
	            }]
	        });
	    });
	});
	
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy081', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '负载电流'
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
	                
					min: 0,  //最小
					tickInterval: 0.3, //步长
					max:3,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [ { 
			              from: 0,
			              to: 2,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 2,
			              to: 3,
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
	                name: '负载电流',
	            }]
	        });
	    });
	});
	

	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy082', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '+12V遥测'
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
	                
					min: 10,  //最小
					tickInterval: 0.5, //步长
					max:15,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: 10,
			              to: 11,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 11,
			              to: 12,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 12,
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
	                name: '电压数据',
	            }]
	        });
	    });
	});
	
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy083', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '-12V遥测'
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
	                
					min: -13,  //最小
					tickInterval: 0.3, //步长
					max:-10,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -13,
			              to: -12,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -12,
			              to: -11,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -11,
			              to: -10,
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
	                name: '电压信息',
	            }]
	        });
	    });
	});
	
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy084', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '充电电流遥测'
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
	                
				min: -2,  //最小
				tickInterval: 0.2, //步长
				max:2,//最大 
				
				// 不同Y轴范围设置不同颜色 begin
				plotBands: [{ 
		              from: -2,
		              to: -1,
		              color: 'rgba(255, 97, 0, 0.3)',
		              label: {
		                  text: '预警',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: -1,
		              to: 1,
		              color: 'rgba(168, 255, 213, 0.3)',
		              label: {
		                  text: '正常',
		                  style: {
		                      color: '#606060'
		                  }
		              }
		          },  { 
		              from: 1,
		              to: 2,
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
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy085', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '放电电流遥测'
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
	                
					min: 0,  //最小
					tickInterval: 0.3, //步长
					max:3,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: 2,
			              to: 3,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0,
			              to: 2,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
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
	
	
	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ydy086', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '蓄电池组电压遥测'
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
	                
					min: 0,  //最小
					tickInterval: 3, //步长
					max:33,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: 29,
			              to: 33,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0,
			              to: 29,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
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
	                name: '电压遥测',
	            }]
	        });
	    });
	});