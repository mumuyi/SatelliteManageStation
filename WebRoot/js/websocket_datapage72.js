	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat7.ws");
		
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
		var v1=jsonObj[0].ykl057;
		v1=v1-0.1;
		var v2=jsonObj[0].ykl058;
		v2=v2-0.1;
		var v3=jsonObj[0].ykl059;
		v3=v3-0.1;
		var v4=jsonObj[0].ykl053;
		v4=v4-0.1;
		var v5=jsonObj[0].ykl054;
		v5=v5-0.1;
		var v6=jsonObj[0].ykl055;
		v6=v6-0.1;
		var v7=jsonObj[0].ykl056;
		v7=v7-0.1;
		//添加数据;
		var chart = $('#ykl057').highcharts();
		chart.series[0].addPoint([ (new Date()).getTime(), v1+0.1 ]);
		var chart2 = $('#ykl058').highcharts();
		chart2.series[0].addPoint([ (new Date()).getTime(), v2+0.1 ]);
		var chart3 = $('#ykl059').highcharts();
		chart3.series[0].addPoint([ (new Date()).getTime(), v3+0.1 ]);
		var chart4 = $('#ykl053').highcharts();
		chart4.series[0].addPoint([ (new Date()).getTime(), v4+0.1 ]);
		var chart5 = $('#ykl054').highcharts();
		chart5.series[0].addPoint([ (new Date()).getTime(), v5+0.1 ]);
		var chart6 = $('#ykl055').highcharts();
		chart6.series[0].addPoint([ (new Date()).getTime(), v6+0.1 ]);
		var chart7 = $('#ykl056').highcharts();
		chart7.series[0].addPoint([ (new Date()).getTime(), v7+0.1 ]);
		//手动删除第一个点;
		num=num+1;
		if(num>=10){
			chart.series[0].removePoint(0,true,true);
			chart2.series[0].removePoint(0,true,true);
			chart3.series[0].removePoint(0,true,true);
			chart4.series[0].removePoint(0,true,true);
			chart5.series[0].removePoint(0,true,true);
			chart6.series[0].removePoint(0,true,true);
			chart7.series[0].removePoint(0,true,true);
		}
	};
	
	//连接关闭的回调方法
	websocket.onclose = function() {
		alert("close");
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