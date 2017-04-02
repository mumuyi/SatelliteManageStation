	var websocket = null;
	
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/wschat.ws");
		
	} else {
		alert('Not support websocket');
	}
	
	//连接发生错误的回调方法
	websocket.onerror = function() {
		alert("error");
	};
	
	//连接成功建立的回调方法
	websocket.onopen = function(event) {
		alert("open");
	};
	
	//接收到消息的回调方法
	websocket.onmessage = function() {
		var jsonDate = (event.data);
        var jsonObj = JSON.parse( jsonDate );  // JSON.parse(); 方法;
		var datatype=jsonObj[0].datatype;
		if(datatype=="timedata"){
			var v1=jsonObj[0].yjs087;
			v1=v1-0.1;
			var chart=$("#MainContentPage").contents().find("#yjs087").highcharts();
			//var chart = $('#yjs087').highcharts();
			chart.series[0].addPoint([ (new Date()).getTime(), v1+0.1 ]);
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
	function send(message) {
		websocket.send(message);
	}	