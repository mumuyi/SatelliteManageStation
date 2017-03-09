	var websocket = null;
	
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat.ws");
		
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
		//setMessageInnerHTML(event.data);
		//alert("get message");
		//document.getElementById("message").innerHTML+=jsonObj[2].age+ '<br/>';
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
		var test='1111111';
		jQuery("#table_list").jqGrid('setCell',1,'id',test);
		jQuery("#table_list").setCell(2, 'name', test,{background:'#ff0000'});
		var val = jQuery("#table_list").getCell( 3,0 );
		
		alert("get value:"+val);
		
		
		//jQuery("#table_list").trigger("reloadGrid");
		//jQuery("#table_list").trigger("setCell(3, 'name', '1212',{background:'#ff0000'}");
		alert("send");
		
		var message = document.getElementById('text').value;
		websocket.send(message);
	}	