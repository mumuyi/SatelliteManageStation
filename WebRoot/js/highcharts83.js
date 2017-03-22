	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ywd119', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '太阳电池阵梯形板1温度'
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
	                
					min: -90,  //最小
					tickInterval: 10, //步长
					max:90,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -90,
			              to: -80,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -80,
			              to: 80,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 80,
			              to: 90,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd120', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '太阳电池阵梯形板2温度'
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
	                
					min: -90,  //最小
					tickInterval: 10, //步长
					max:90,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -90,
			              to: -80,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -80,
			              to: 80,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 80,
			              to: 90,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd121', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '太阳电池阵梯形板4温度'
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
	                
					min: -90,  //最小
					tickInterval: 10, //步长
					max:90,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -90,
			              to: -80,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -80,
			              to: 80,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 80,
			              to: 90,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd122', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '蓄电池1温度'
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
	                
					min: -10,  //最小
					tickInterval: 5, //步长
					max:40,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -10,
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
			              to: 40,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd123', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '蓄电池2温度'
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
	                
					min: -10,  //最小
					tickInterval: 5, //步长
					max:40,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -10,
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
			              to: 40,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd124', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '蓄电池4温度'
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
	                
					min: -10,  //最小
					tickInterval: 5, //步长
					max:40,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -10,
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
			              to: 40,
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
	                name: '温度',
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
	
	        Highcharts.chart('ywd125', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '能源控制板温度'
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
	                
					min: -20,  //最小
					tickInterval: 5, //步长
					max:50,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -20,
			              to: -10,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -10,
			              to: 45,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 45,
			              to: 50,
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
	                name: '温度',
	            }]
	        });
	    });
	});