	
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
		var v1=jsonObj[0].ykz063;
		var v2=jsonObj[0].ykz060;
		var v3=jsonObj[0].ykz064;
		var v4=jsonObj[0].ykz061;
		var v5=jsonObj[0].ykz065;
		var v6=jsonObj[0].ykz062;
		var v7=jsonObj[0].ykz066;
		var v8=jsonObj[0].ykz067;
		var v9=jsonObj[0].ykz068;
		var v10=jsonObj[0].ykz069;
		var v11=jsonObj[0].ykz501;
		var v12=jsonObj[0].ykz502;
		var v13=jsonObj[0].ykz503;
		//添加数据;
		document.getElementById("ykz063").innerHTML="阻尼标志<br><br>"+v1;
		document.getElementById("ykz060").innerHTML="阻尼次数<br><br>"+v2;
		document.getElementById("ykz064").innerHTML="俯仰滤波标志<br><br>"+v3;
		document.getElementById("ykz061").innerHTML="滤波次数<br><br>"+v4;
		document.getElementById("ykz065").innerHTML="俯仰控制标志<br><br>"+v5;
		document.getElementById("ykz062").innerHTML="俯仰控制次数<br><br>"+v6;
		document.getElementById("ykz066").innerHTML="三轴稳定标志<br><br>"+v7;
		document.getElementById("ykz067").innerHTML="俯仰激动控制标志<br><br>"+v8;
		document.getElementById("ykz068").innerHTML="隐身保持控制标志<br><br>"+v9;
		document.getElementById("ykz069").innerHTML="隐身恢复控制标志<br><br>"+v10;
		document.getElementById("ykz501").innerHTML="自主导航标志<br><br>"+v11;
		document.getElementById("ykz502").innerHTML="自主导航接入标志<br><br>"+v12;
		document.getElementById("ykz503").innerHTML="永久阻尼标志<br><br>"+v13;
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