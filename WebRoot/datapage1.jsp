<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>图像信息</title>
	<!-- Bootstrap core CSS -->
    <link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">
    
    <!--external css-->
    <link href="${ctx}/dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${ctx}/dashgum/js/gritter/css/jquery.gritter.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/dashgum/lineicons/style.css">  
    
    
    <link rel="stylesheet" type="text/css" href="${ctx}/telescopicmenu/css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/telescopicmenu/css/default.css">
	<link rel="stylesheet" type="text/css" href="${ctx}/telescopicmenu/css/styles.css">
    
    <!-- Custom styles for this template -->
    <link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
    
    <script type="text/javascript" src="${ctx}/highcharts/js/jquery-1.8.3.min.js"></script>
    
	<style>
		.font_bk{
			margin:0 auto;
			text-align:center;
			float:left;
			margin-left:200px;
		}
		.font_bk1{
			margin:0 auto;
			text-align:center;
			margin-left:660px;
		}
	</style>

	</head>
	<body>
			<div style="height:100px"></div>
			<div>
				<ul class="cards">
				  <li class="card card-1" id="data11" onclick="datapagejump('5-4')"><img src="${ctx}/telescopicmenu/img/img9.jpg"/>
				    <div class="content-1">
				      <p>指令计数</p>
				    </div>
				  </li>
				  <li class="card card-2"  id="data12" onclick="datapagejump('5-1')"><img src="${ctx}/telescopicmenu/img/img10.jpg"/>
				    <div class="content-1">
				      <p>CPU</p>
				    </div>
				  </li>
				  <li class="card card-3" id="data1"><img src="${ctx}/telescopicmenu/img/img5.jpg"/>
				    <div class="content">
				      <h1>数据综合</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div class="font_bk">
				<ul class="cards">
				  <li class="card card-1" id="data21" onclick="datapagejump('8-1')"><img src="${ctx}/telescopicmenu/img/img6.jpg"/>
				    <div class="content-1">
				      <p>蓄电池</p>
				    </div>
				  </li>
				  <li class="card card-2" id="data22" onclick="datapagejump('8-3')"><img src="${ctx}/telescopicmenu/img/img7.jpg"/>
				    <div class="content-1">
				      <p>太阳电池阵</p>
				    </div>
				  </li>
				  <li class="card card-3" id="data2"><img src="${ctx}/telescopicmenu/img/img11.jpg"/>
				    <div class="content">
				      <h1>电源</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div class="font_bk1">
				<ul class="cards">
					<li class="card card-1" id="data31" onclick="datapagejump('9-1')"><img src="${ctx}/telescopicmenu/img/img2.jpg"></img>
				    <div class="content-1">
				      <p>通信接收机</p>
				    </div>
				  </li>
				  <li class="card card-2" id="data32" onclick="datapagejump('9-1')"><img src="${ctx}/telescopicmenu/img/img3.jpg"/>
				    <div class="content-1">
				      <p>通信发射机</p>
				    </div>
				  </li>
				  <li class="card card-3" id="data3"><img src="${ctx}/telescopicmenu/img/img1.jpg"/>
				    <div class="content">
				      <h1>通信</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div>
				<ul class="cards">
				  <li class="card card-1" id="data41" onclick="datapagejump('6-2')"><img src="${ctx}/telescopicmenu/img/img4.jpg"/>
				    <div class="content-1">
				      <p>太敏探头</p>
				    </div>
				  </li>
				  <li class="card card-2" id="data42" onclick="datapagejump('6-1')"><img src="${ctx}/telescopicmenu/img/img8.jpg"/>
				    <div class="content-1">
				      <p>磁强计</p>
				    </div>
				  </li>
				  <li class="card card-4" id="data44" onclick="datapagejump('7-3')"><img src="${ctx}/telescopicmenu/img/img12.jpg"/>
				    <div class="content-1">
				      <p>姿态</p>
				    </div>
				  </li>
				  <li class="card card-5" id="data45" onclick="datapagejump('6-3')"><img src="${ctx}/telescopicmenu/img/img13.jpg"/>
				    <div class="content-1">
				      <p>位置</p>
				    </div>
				  </li>
				  <li class="card card-6"  id="data46" onclick="datapagejump('6-3')"><img src="${ctx}/telescopicmenu/img/img14.jpg"/>
				    <div class="content-1">
				      <p>速度</p>
				    </div>
				  </li>
				  <li class="card card-3"  id="data4"><img src="${ctx}/telescopicmenu/img/img16.jpg"/>
				    <div class="content">
				      <h1>姿控</h1>
				    </div>
				  </li>
				</ul>
			</div>

		<!-- <button onclick="add()">add</button> -->
		<script>
			function datapagejump(src) {
				closeWebSocket();
				parent.document.getElementById("MainContentPage").src="${ctx}/MainContentController/"+src;
			}
		</script>
	</body>
	
	
	<script src="${ctx}/js/websocket_datapage1.js"></script>
	
	<script type="text/javascript">
		function add() {
			document.getElementById("data11").className="card card-111";
			document.getElementById("data21").className="card card-111";
			document.getElementById("data31").className="card card-111";
			document.getElementById("data41").className="card card-111";
		
			document.getElementById("data12").className="card card-222";
			document.getElementById("data22").className="card card-222";
			document.getElementById("data32").className="card card-222";
			document.getElementById("data42").className="card card-222";
			
			document.getElementById("data44").className="card card-444";
			document.getElementById("data45").className="card card-555";
			document.getElementById("data46").className="card card-666";
			
			document.getElementById("data1").className="card card-333";
			document.getElementById("data2").className="card card-333";
			document.getElementById("data3").className="card card-333";
			document.getElementById("data4").className="card card-333";
		}
	</script>
	
	<!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="${ctx}/dashgum/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("${ctx}/dashgum/img/background.jpg");
    </script>
    
	<script>
		jQuery(document).ready(function ($) {
		    $('ul.cards').on('click', function () {
		        $(this).toggleClass('transition');
		    });
		});
	</script>
	
    <script>
        $(function(){ 
         	var ans="${permissionverify}";
         	//alert("111"+ans+"111");
        	if(ans!=null&&ans=="false"){
         		alert("本用户无权限进行此操作");
         	}
         });
    </script>
</html>