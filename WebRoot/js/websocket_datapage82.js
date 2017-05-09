	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat8.ws");
		
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
		var v1=jsonObj[0].ydp130;
		var v2=jsonObj[0].ydp131;
		var v3=jsonObj[0].ydp132;
		var v4=jsonObj[0].ydp133;
		var v5=jsonObj[0].ydp134;
		var v6=jsonObj[0].ydp135;
		var v7=jsonObj[0].ydp136;
		var v8=jsonObj[0].ydp137;
		var v9=jsonObj[0].ydp138;
		var v10=jsonObj[0].ydp139;
		var v11=jsonObj[0].ydp140;
		var v12=jsonObj[0].ydp141;
		var v13=jsonObj[0].ydp142;
		var v14=jsonObj[0].ydp143;
		var v15=jsonObj[0].ydp144;
		var v16=jsonObj[0].ydp145;
		var v17=jsonObj[0].ydp146;

		
		//添加数据;
		document.getElementById("ydp130").innerHTML=("磁强计A正12V<br><br>"+v1);
		document.getElementById("ydp131").innerHTML=("磁强计A负12V<br><br>"+v2);
		document.getElementById("ydp132").innerHTML=("磁强计B正12V<br><br>"+v3);
		document.getElementById("ydp133").innerHTML=("磁强计B负12V<br><br>"+v4);
		document.getElementById("ydp134").innerHTML=("模拟太敏正12V<br><br>"+v5);
		document.getElementById("ydp135").innerHTML=("模拟太敏负12V<br><br>"+v6);
		document.getElementById("ydp136").innerHTML=("陀螺正12V<br><br>"+v7);
		document.getElementById("ydp137").innerHTML=("陀螺负12V<br><br>"+v8);
		document.getElementById("ydp138").innerHTML=("GPS接收机<br><br>"+v9);
		document.getElementById("ydp139").innerHTML=("动量轮<br><br>"+v10);
		document.getElementById("ydp140").innerHTML=("动量轮控制器正12V<br><br>"+v11);
		document.getElementById("ydp141").innerHTML=("动量轮控制器负12V<br><br>"+v12);
		document.getElementById("ydp142").innerHTML=("磁力矩控制器正12V<br><br>"+v13);
		document.getElementById("ydp143").innerHTML=("磁力矩控制器负12V<br><br>"+v14);
		document.getElementById("ydp144").innerHTML=("相机状态<br><br>"+v15);
		document.getElementById("ydp145").innerHTML=("蓄电池母线接入<br><br>"+v16);
		document.getElementById("ydp146").innerHTML=("分流电路主备份工作状态<br><br>"+v17);
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