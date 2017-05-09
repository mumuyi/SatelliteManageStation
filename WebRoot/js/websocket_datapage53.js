	
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
		var v1=jsonObj[0].ysj001;
		var v2=jsonObj[0].ysj002;
		var v3=jsonObj[0].ysj003;
		var v4=jsonObj[0].ysj004;
		var v5=jsonObj[0].ysj005;
		var v6=jsonObj[0].ysj006;
		//添加数据;
		setdata("ysj001",v1);
		setdata("ysj002",v2);
		setdata("ysj003",v3);
		setdata("ysj004",v4);
		setdata("ysj005",v5);
		setdata("ysj006",v6);
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
	
	function setdata(id,value){
		var day=Math.floor(value/86400);
		var hour=Math.floor((value%(86400))/3600);
		var min=Math.floor(((value%86400)%3600)/60);
		var sec=Math.floor(((value%86400)%3600)%60);
		document.getElementById(id+"d").innerHTML=day;
		document.getElementById(id+"h").innerHTML=hour;
		document.getElementById(id+"m").innerHTML=min;
		document.getElementById(id+"s").innerHTML=sec;
	}