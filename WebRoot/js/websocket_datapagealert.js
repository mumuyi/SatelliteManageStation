	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat10.ws");
		
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
		var v1=jsonObj[0].ygd040;
		v1=v1-0.1;
		var v2=jsonObj[0].ygd041;
		v2=v2-0.1;
		var v3=jsonObj[0].ygd042;
		v3=v3-0.1;
		var v4=jsonObj[0].ygd043;
		v4=v4-0.1;
		var v5=jsonObj[0].ygd044;
		v5=v5-0.1;
		var v6=jsonObj[0].ygd045;
		v6=v6-0.1;
		var v7=jsonObj[0].ysj023;
		var v8=jsonObj[0].ysj024;
		var v9=jsonObj[0].ygn035;
		v9=v9-0.1;
		var v10=jsonObj[0].ygn036;
		v10=v10-0.1;
		var v11=jsonObj[0].ygn037;
		v11=v11-0.1;
		var v12=jsonObj[0].ygn038;
		v12=v12-0.1;
		var v13=jsonObj[0].ygn039;
		v13=v13-0.1;
		
		alert("11111");
		
		//实时修改表格数据;
		jQuery("#table_list1").jqGrid('setCell',0,'value',""+(v1+0.1));
		jQuery("#table_list1").jqGrid('setCell',1,'value',""+(v2+0.1));
		jQuery("#table_list1").jqGrid('setCell',2,'value',""+(v3+0.1));
		jQuery("#table_list1").jqGrid('setCell',3,'value',""+(v4+0.1));
		jQuery("#table_list1").jqGrid('setCell',4,'value',""+(v5+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v6+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v9+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v10+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v11+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v12+0.1));
		jQuery("#table_list1").jqGrid('setCell',5,'value',""+(v13+0.1));
		
		jQuery("#table_list1").jqGrid('setCell',0,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',1,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',2,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',3,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',4,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
		jQuery("#table_list1").jqGrid('setCell',5,'times',""+v7);
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