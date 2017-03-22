	
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
		var v1=jsonObj[0].ydp157;
		var v2=jsonObj[0].ydp158;
		var v3=jsonObj[0].ydp159;
		var v4=jsonObj[0].ydp160;
		var v5=jsonObj[0].ydp161;
		var v6=jsonObj[0].ydp162;
		var v7=jsonObj[0].ydp163;
		var v8=jsonObj[0].ydp164;
		var v9=jsonObj[0].ydp165;
		var v10=jsonObj[0].ydp166;
		var v11=jsonObj[0].ydp167;
		var v12=jsonObj[0].ygz185;
		var v13=jsonObj[0].ygz186;
		var v14=jsonObj[0].ygz187;
		var v15=jsonObj[0].ygz188;
		var v16=jsonObj[0].ygz189;
		var v17=jsonObj[0].ygz190;
		var v18=jsonObj[0].ygz191;
		var v19=jsonObj[0].ygz192;
		var v20=jsonObj[0].ygz193;
		var v21=jsonObj[0].yxs504;
		var v22=jsonObj[0].yxs505;
		var v23=jsonObj[0].yxs601;
		var v24=jsonObj[0].yxs502;
		var v25=jsonObj[0].yxs603;
		var v26=jsonObj[0].yxs610;
		var v27=jsonObj[0].ykm001;
		
		//添加数据;
		document.getElementById("ydp157").innerHTML=("CPUA看门狗输出<br><br>"+v1);
		document.getElementById("ydp158").innerHTML=("CPUB看门狗输出<br><br>"+v2);
		document.getElementById("ydp159").innerHTML=("CPUA系统失效<br><br>"+v3);
		document.getElementById("ydp160").innerHTML=("CPUB系统失效<br><br>"+v4);
		document.getElementById("ydp161").innerHTML=("CPUA工作状态<br><br>"+v5);
		document.getElementById("ydp162").innerHTML=("CPUB工作状态<br><br>"+v6);
		document.getElementById("ydp163").innerHTML=("CPU自动切机使能<br><br>"+v7);
		document.getElementById("ydp164").innerHTML=("CPUB过流<br><br>"+v8);
		document.getElementById("ydp165").innerHTML=("CPUA过流<br><br>"+v9);
		document.getElementById("ydp166").innerHTML=("星箭分离遥测1<br><br>"+v10);
		document.getElementById("ydp167").innerHTML=("星箭分离遥测2<br><br>"+v11);
		document.getElementById("ygz185").innerHTML=("陀螺有效<br><br>"+v12);
		document.getElementById("ygz186").innerHTML=("GPS有效<br><br>"+v13);
		document.getElementById("ygz187").innerHTML=("磁力矩器有效<br><br>"+v14);
		document.getElementById("ygz188").innerHTML=("太敏有效<br><br>"+v15);
		document.getElementById("ygz189").innerHTML=("磁强计A有效<br><br>"+v16);
		document.getElementById("ygz190").innerHTML=("磁强计B有效<br><br>"+v17);
		document.getElementById("ygz191").innerHTML=("动量轮有效<br><br>"+v18);
		document.getElementById("ygz192").innerHTML=("动量轮控制器有效<br><br>"+v19);
		document.getElementById("ygz193").innerHTML=("相机有效<br><br>"+v10);
		document.getElementById("yxs504").innerHTML=("通信体制标识<br><br>"+v21);
		document.getElementById("yxs505").innerHTML=("蓄电池过放保护标识<br><br>"+v22);
		document.getElementById("yxs601").innerHTML=("通信体制切换禁止标识<br><br>"+v23);
		document.getElementById("yxs602").innerHTML=("星箭分离表示<br><br>"+v24);
		document.getElementById("yxs603").innerHTML=("理论轨道可用标识<br><br>"+v25);
		document.getElementById("yxs610").innerHTML=("地面电测模式标识<br><br>"+v26);
		document.getElementById("ykm001").innerHTML=("控制模式信息<br><br>"+v27);
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