	
	var databuf = new Array(100);
	var dataflag=0;
	var websocket = null;
	var num=0;
	//判断当前浏览器是否支持WebSocket
	if ('WebSocket' in window) {
		websocket = new WebSocket("ws://localhost:8080/SatelliteManageStation/chat1.ws");
		
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
		var v1=jsonObj[0].alerttype;
		var v2=jsonObj[0].alertsort;
		var v3=jsonObj[0].alertsort1;
		var v4=jsonObj[0].name;
		//alert("111 "+v1+v2+v3);
		if(v1=="warning"){
			alert("warning");
			if(v2=="1"){
				document.getElementById("data1").className="card card-33";
				if(v3=="1"){
					document.getElementById("data11").className="card card-11";
				}else if(v3=="2"){
					document.getElementById("data12").className="card card-22";
				}
			}else if(v2=="2"){
				document.getElementById("data2").className="card card-33";
				if(v3=="1"){
					document.getElementById("data21").className="card card-11";
				}else if(v3=="2"){
					document.getElementById("data22").className="card card-22";
				}
			}else if(v2=="3"){
				document.getElementById("data3").className="card card-33";
				if(v3=="1"){
					document.getElementById("data31").className="card card-11";
				}else if(v3=="2"){
					document.getElementById("data32").className="card card-22";
				}
			}else if(v2=="4"){
				document.getElementById("data4").className="card card-33";
				if(v3=="1"){
					document.getElementById("data41").className="card card-11";
				}else if(v3=="2"){
					document.getElementById("data42").className="card card-22";
				}else if(v3=="4"){
					document.getElementById("data44").className="card card-44";
				}else if(v3=="5"){
					document.getElementById("data45").className="card card-55";
				}else if(v3=="6"){
					document.getElementById("data46").className="card card-66";
				}
			}
		}else if(v1=="error"){
			alert(v4+" 出现错误,请检查");
			if(v2=="1"){
				document.getElementById("data1").className="card card-333";
				if(v3=="1"){
					document.getElementById("data12").className="card card-222";
				}else if(v3=="2"){
					document.getElementById("data11").className="card card-111";
				}
			}else if(v2=="2"){
				document.getElementById("data2").className="card card-333";
				if(v3=="1"){
					document.getElementById("data21").className="card card-111";
				}else if(v3=="2"){
					document.getElementById("data22").className="card card-222";
				}
			}else if(v2=="3"){
				document.getElementById("data3").className="card card-333";
				if(v3=="1"){
					document.getElementById("data31").className="card card-111";
				}else if(v3=="2"){
					document.getElementById("data32").className="card card-222";
				}
			}else if(v2=="4"){
				document.getElementById("data4").className="card card-333";
				if(v3=="1"){
					document.getElementById("data41").className="card card-111";
				}else if(v3=="2"){
					document.getElementById("data42").className="card card-222";
				}else if(v3=="4"){
					document.getElementById("data44").className="card card-444";
				}else if(v3=="5"){
					document.getElementById("data45").className="card card-555";
				}else if(v3=="6"){
					document.getElementById("data46").className="card card-666";
				}
			}			
		}
		
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