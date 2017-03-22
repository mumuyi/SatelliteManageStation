	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat9.ws");
		
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
		var v1=jsonObj[0].ytx075;
		var v2=jsonObj[0].ytx076;
		var v3=jsonObj[0].ytx077;
		var v4=jsonObj[0].ytx078;
		var v5=jsonObj[0].yty506;
		var v6=jsonObj[0].yty507;
		var v7=jsonObj[0].yty508;
		var v8=jsonObj[0].yty509;
		//添加数据;
		document.getElementById("ytx075").innerHTML=v1;
		document.getElementById("ytx076").innerHTML=v2;
		document.getElementById("ytx077").innerHTML=v3;
		document.getElementById("ytx078").innerHTML=v4;
		document.getElementById("yty506").innerHTML=v5;
		document.getElementById("yty507").innerHTML=v6;
		document.getElementById("yty508").innerHTML=v7;
		document.getElementById("yty509").innerHTML=v8;
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