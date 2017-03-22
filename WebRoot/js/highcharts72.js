	$(function () {
	    $(document).ready(function () {
	        Highcharts.setOptions({
	            global: {
	                useUTC: false
	            }
	        });
	
	        Highcharts.chart('ykl057', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'X轴磁力矩器控制电压'
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
					tickInterval: 1, //步长
					max:10,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -6,
			              to: -5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -5,
			              to: 5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 5,
			              to: 10,
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
	                name: '控制电压',
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
	
	        Highcharts.chart('ykl058', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'Y轴磁力矩器控制电压'
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
					tickInterval: 1, //步长
					max:10,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -6,
			              to: -5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -5,
			              to: 5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 5,
			              to: 10,
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
	                name: '控制电压',
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
	
	        Highcharts.chart('ykl059', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'Z轴磁力矩器控制电压'
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
	                
					min: -6,  //最小
					tickInterval: 1, //步长
					max:6,//最大 
					
					// 不同Y轴范围设置不同颜色 begin
					plotBands: [{ 
			              from: -6,
			              to: -5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -5,
			              to: 5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 5,
			              to: 6,
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
	                name: '控制电压',
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
	
	        Highcharts.chart('ykl053', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'X轴控制力矩输出'
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
			              to: -0.5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -0.5,
			              to: 0.5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0.5,
			              to: 1,
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
	                name: '力矩输出',
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
	
	        Highcharts.chart('ykl054', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'Y轴控制力矩输出'
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
			              to: -0.5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -0.5,
			              to: 0.5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0.5,
			              to: 1,
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
	                name: '力矩输出',
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
	
	        Highcharts.chart('ykl055', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: 'Z轴控制力矩输出'
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
			              to: -0.5,
			              color: 'rgba(255, 97, 0, 0.3)',
			              label: {
			                  text: '预警',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: -0.5,
			              to: 0.5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 0.5,
			              to: 1,
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
	                name: '力矩输出',
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
	
	        Highcharts.chart('ykl056', {
	            chart: {
	                type: 'spline',
	                animation: Highcharts.svg,
	                marginRight: 10,
	            },
	            title: {
	                text: '动量轮控制电压'
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
					tickInterval: 0.5, //步长
					max:6,//最大 
					
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
			              to: 5,
			              color: 'rgba(168, 255, 213, 0.3)',
			              label: {
			                  text: '正常',
			                  style: {
			                      color: '#606060'
			                  }
			              }
			          },  { 
			              from: 5,
			              to: 6,
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
	                name: '控制电压',
	            }]
	        });
	    });
	});