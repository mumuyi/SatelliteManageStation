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
				  <li class="card card-1"><img src="${ctx}/telescopicmenu/img/01.jpg"/>
				    <div class="content-1">
				      <p>指令计数</p>
				    </div>
				  </li>
				  <li class="card card-2"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>CPU</p>
				    </div>
				  </li>
				  <li class="card card-3"><img src="${ctx}/telescopicmenu/img/03.jpg"/>
				    <div class="content">
				      <h1>数据综合</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div class="font_bk">
				<ul class="cards">
				  <li class="card card-1"><img src="${ctx}/telescopicmenu/img/01.jpg"/>
				    <div class="content-1">
				      <p>蓄电池</p>
				    </div>
				  </li>
				  <li class="card card-2"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>太阳电池阵</p>
				    </div>
				  </li>
				  <li class="card card-3"><img src="${ctx}/telescopicmenu/img/03.jpg"/>
				    <div class="content">
				      <h1>电源</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div class="font_bk1">
				<ul class="cards">
					<li class="card card-1"><img src="${ctx}/telescopicmenu/img/01.jpg"></img>
				    <div class="content-1">
				      <p>通信接收机</p>
				    </div>
				  </li>
				  <li class="card card-2"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>通信发射机</p>
				    </div>
				  </li>
				  <li class="card card-3"><img src="${ctx}/telescopicmenu/img/03.jpg"/>
				    <div class="content">
				      <h1>通信</h1>
				    </div>
				  </li>
				</ul>
			</div>
			
			<div>
				<ul class="cards">
				  <li class="card card-1"><img src="${ctx}/telescopicmenu/img/01.jpg"/>
				    <div class="content-1">
				      <p>太敏探头</p>
				    </div>
				  </li>
				  <li class="card card-2"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>磁强计</p>
				    </div>
				  </li>
				  <li class="card card-4"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>姿态</p>
				    </div>
				  </li>
				  <li class="card card-5"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>位置</p>
				    </div>
				  </li>
				  <li class="card card-6"><img src="${ctx}/telescopicmenu/img/02.jpg"/>
				    <div class="content-1">
				      <p>速度</p>
				    </div>
				  </li>
				  <li class="card card-3"><img src="${ctx}/telescopicmenu/img/03.jpg"/>
				    <div class="content">
				      <h1>姿控</h1>
				    </div>
				  </li>
				</ul>
			</div>

		<!-- <button onclick="add()">add</button> -->
		<script>
			function datapagejump(src) {
				parent.document.getElementById("MainContentPage").src=src;
			}
		</script>
	</body>
	
	<script type="text/javascript">
		function add() {
			document.getElementById("datapage5").className="font_bk1";
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
</html>