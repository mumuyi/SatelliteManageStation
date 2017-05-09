	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat5.ws");
		
	} else {
		alert('Not support websocket');
	}
	
	//连接发生错误的回调方法
	websocket.onerror = function() {
		alert("error");
	};
	
	//连接成功建立的回调方法
	websocket.onopen = function(event) {
		//alert("open");
	};
	
	//接收到消息的回调方法
	websocket.onmessage = function() {
		//解析获取数据;
		var jsonDate = (event.data);
        var jsonObj = JSON.parse( jsonDate );  // JSON.parse(); 方法;
		var v1=jsonObj[0].yjs087;
		v1=v1-0.1;
		var v2=jsonObj[0].yjs088;
		v2=v2-0.1;
		var v3=jsonObj[0].yjs089;
		v3=v3-0.1;
		var v4=jsonObj[0].yjs090;
		v4=v4-0.1;
		var v5=jsonObj[0].yjs091;
		v5=v5-0.1;
		var v6=jsonObj[0].yjs092;
		v6=v6-0.1;
		var v7=jsonObj[0].ysj023;
		var v8=jsonObj[0].ysj024;
		//添加数据;
		var chart = $('#yjs087').highcharts();
		chart.series[0].addPoint([ (new Date()).getTime(), v1+0.1 ]);
		//chart.series[0].addPoint([v7*1000+1199145600000, v1+0.1 ]);
		var chart2 = $('#yjs088').highcharts();
		chart2.series[0].addPoint([ (new Date()).getTime(), v2+0.1 ]);
		var chart3 = $('#yjs089').highcharts();
		chart3.series[0].addPoint([ (new Date()).getTime(), v3+0.1 ]);
		var chart4 = $('#yjs090').highcharts();
		chart4.series[0].addPoint([ (new Date()).getTime(), v4+0.1 ]);
		var chart5 = $('#yjs091').highcharts();
		chart5.series[0].addPoint([ (new Date()).getTime(), v5+0.1 ]);
		var chart6 = $('#yjs092').highcharts();
		chart6.series[0].addPoint([ (new Date()).getTime(), v6+0.1 ]);
		//手动删除第一个点;
		num=num+1;
		if(num>=10){
			chart.series[0].removePoint(0,true,true);
			chart2.series[0].removePoint(0,true,true);
			chart3.series[0].removePoint(0,true,true);
			chart4.series[0].removePoint(0,true,true);
			chart5.series[0].removePoint(0,true,true);
			chart6.series[0].removePoint(0,true,true);
		}
		
		//实时修改表格数据;
		jQuery("#table_list1").jqGrid('setCell',0,'value',""+(v1+0.1));
		jQuery("#table_list1").jqGrid('setCell',1,'value',""+(v2+0.1));
		jQuery("#table_list1").jqGrid('setCell',2,'value',""+(v3+0.1));
		jQuery("#table_list1").jqGrid('setCell',3,'value',""+(v4+0.1));
		jQuery("#table_list1").jqGrid('setCell',4,'value',""+(v5+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v6+0.1));
		
		jQuery("#table_list1").jqGrid('setCell',0,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',1,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',2,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',3,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',4,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
	};
	
	//连接关闭的回调方法
	websocket.onclose = function() {
		//alert("close");
		//setMessageInnerHTML("close");
	};
	
	//监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
	window.onbeforeunload = function() {
		websocket.close();
	};
	
	//将消息显示在网页上
	function setMessageInnerHTML(innerHTML) {
		document.getElementById('message').innerHTML += innerHTML + '<br/>';
	}
	
	//关闭连接
	function closeWebSocket() {
		websocket.close();
	}
	
	//发送消息
	function send() {
		var message = document.getElementById('text').value;
		websocket.send(message);
	}
	
	function getMyData(i){
		//alert(databuf[i]);
		return databuf[i];
	}