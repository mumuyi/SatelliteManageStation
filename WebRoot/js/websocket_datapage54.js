	
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
		var v1=jsonObj[0].yzl169;
		var v2=jsonObj[0].yzl170;
		var v3=jsonObj[0].yzl171;
		var v4=jsonObj[0].yzl172;
		var v5=jsonObj[0].yzl173;
		var v6=jsonObj[0].yzl174;
		var v7=jsonObj[0].yzl175;
		var v8=jsonObj[0].yzl176;
		var v9=jsonObj[0].yzl177;
		var v10=jsonObj[0].yzl178;
		var v11=jsonObj[0].yzl179;
		var v12=jsonObj[0].yzl180;
		var v13=jsonObj[0].yzl182;
		var v14=jsonObj[0].yzl183;
		//添加数据;
		document.getElementById("yzl169").innerHTML="待执行图像成像指令计数<br><br>"+v1;
		document.getElementById("yzl170").innerHTML="已执行图像成像指令计数<br><br>"+v2;
		document.getElementById("yzl171").innerHTML="待执行隐身试验指令计数<br><br>"+v3;
		document.getElementById("yzl172").innerHTML="已执行隐身试验指令计数<br><br>"+v4;
		document.getElementById("yzl173").innerHTML="已正确执行姿控参数计数<br><br>"+v5;
		document.getElementById("yzl174").innerHTML="已执行供配电开关指令计数<br><br>"+v6;
		document.getElementById("yzl175").innerHTML="已正确执行模式控制指令计数<br><br>"+v7;
		document.getElementById("yzl176").innerHTML="已执行下行定制指令计数<br><br>"+v8;
		document.getElementById("yzl177").innerHTML="已正确执行地面调试指令计数<br><br>"+v9;
		document.getElementById("yzl178").innerHTML="已正确执行通信系统指令计数<br><br>"+v10;
		document.getElementById("yzl179").innerHTML="已正确执行电源系统指令计数<br><br>"+v11;
		document.getElementById("yzl180").innerHTML="已正确执行数据综合系统指令计数<br><br>"+v12;
		document.getElementById("yzl182").innerHTML="收到所有入站指令计数<br><br>"+v13;
		document.getElementById("yzl183").innerHTML="所有控制指令入站计数<br><br>"+v14;
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