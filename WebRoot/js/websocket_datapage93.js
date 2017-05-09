	
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
		var v1=jsonObj[0].ydp147;
		var v2=jsonObj[0].ydp148;
		var v3=jsonObj[0].ydp149;
		var v4=jsonObj[0].ydp150;
		var v5=jsonObj[0].ydp151;
		var v6=jsonObj[0].ydp152;
		var v7=jsonObj[0].ydp153;
		var v8=jsonObj[0].ydp154;
		var v9=jsonObj[0].ydp155;
		var v10=jsonObj[0].ydp156;

		
		//添加数据;
		document.getElementById("ydp147").innerHTML=("通信机接收机锁定<br><br>"+v1);
		document.getElementById("ydp148").innerHTML=("应答机接收机锁定12V<br><br>"+v2);
		document.getElementById("ydp149").innerHTML=("通信机发射机<br><br>"+v3);
		document.getElementById("ydp150").innerHTML=("通信机发射功率<br><br>"+v4);
		document.getElementById("ydp151").innerHTML=("应答机发射机<br><br>"+v5);
		document.getElementById("ydp152").innerHTML=("应答机接收机<br><br>"+v6);
		document.getElementById("ydp153").innerHTML=("应答机测距<br><br>"+v7);
		document.getElementById("ydp154").innerHTML=("应答机相干<br><br>"+v8);
		document.getElementById("ydp155").innerHTML=("通信机加电状态<br><br>"+v9);
		document.getElementById("ydp156").innerHTML=("USB加电状态<br><br>"+v10);
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