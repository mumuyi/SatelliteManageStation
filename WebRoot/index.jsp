<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<!-- <base href="<%=basePath%>">   -->

<title>Datapage</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!-- Bootstrap core CSS -->
<link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="${ctx}/dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="${ctx}/dashgum/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="${ctx}/dashgum/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css" href="${ctx}/dashgum/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
<link href="${ctx}/dashgum/css/style-responsive.css" rel="stylesheet">



<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<section id="container"> 
	<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
	<!--header start--> 
	<header class="header black-bg">
	<div class="sidebar-toggle-box">
		<div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
	</div>
	<!--logo start-->
	<a href="index.html" class="logo"><b>Satellite Manage Station</b></a> 
	<!--logo end-->
	
	<div class="top-menu">
		<ul class="nav pull-right top-menu">
			<li><a class="screenlock" href="${ctx}/ScreenLockController/Lock">Screen Lock</a></li>
			<li><a class="logout" href="${ctx}/Logout">Logout</a></li>
		</ul>
	</div>
	</header> 
	<!--header end--> 
	<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
	<!--sidebar start--> 
	<aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">
			<p class="centered">
				<a href="profile.html">
					<img src="${ctx}/dashgum/img/ui-sam.jpg"class="img-circle" width="60">
				</a>
			</p>
			<h5 class="centered">菜单</h5>
			
			<li class="mt" onclick="changeSrc('0-0')">
				<a class="active"> 
					<i class="fa fa-dashboard"></i> 
					<span>主页</span>
				</a>
			</li>

			<li class="sub-menu"><a href="javascript:;"><i class="fa fa-desktop"></i><span>数据综合系统遥测信息</span></a>
				<ul class="sub">
					<li onclick="changeSrc('5-1')"><a>CPU参数</a></li>
					<li onclick="changeSrc('5-2')"><a>图像信息</a></li>
					<li onclick="changeSrc('5-3')"><a>时间信息</a></li>
					<li onclick="changeSrc('5-4')"><a>计数信息</a></li>
					<li onclick="changeSrc('5-5')"><a>开关量</a></li>
				</ul>
			</li>
			<li class="sub-menu"><a href="javascript:;"> <i class="fa fa-cogs"></i> <span>姿控原始测量遥测信息</span></a>
				<ul class="sub">
					<li onclick="changeSrc('6-1')"><a>磁强计输出</a></li>
					<li onclick="changeSrc('6-2')"><a>模拟太敏输出</a></li>
					<li onclick="changeSrc('6-3')"><a>位置及速度信息</a></li>
					<li onclick="changeSrc('6-4')"><a>功能遥测参数</a></li>
					<li onclick="changeSrc('6-5')"><a>直显信息</a></li>
				</ul>
			</li>
			<li class="sub-menu"><a href="javascript:;"> <i class="fa fa-book"></i> <span>姿控功能遥测信息</span></a>
				<ul class="sub">
					<li onclick="changeSrc('7-1')"><a>轨道解算</a></li>
					<li onclick="changeSrc('7-2')"><a>力矩信息</a></li>
					<li onclick="changeSrc('7-3')"><a>俯仰信息</a></li>
					<li onclick="changeSrc('7-4')"><a>标志及统计信息</a></li>
				</ul>
			</li>
			<li class="sub-menu"><a href="javascript:;"> <i class="fa fa-tasks"></i> <span>电源系统遥测信息</span></a>
				<ul class="sub">
					<li onclick="changeSrc('8-1')"><a>电流电压信息</a></li>
					<li onclick="changeSrc('8-2')"><a>开关量</a></li>
					<li onclick="changeSrc('8-3')"><a>电池温度信息</a></li>
				</ul>
			</li>
			<li class="sub-menu"><a href="javascript:;"> <i class="fa fa-th"></i> <span>通信系统遥测信息</span></a>
				<ul class="sub">
					<li onclick="changeSrc('9-1')"><a>通信机功率场强信息</a></li>
					<li onclick="changeSrc('9-2')"><a>通信机计数信息</a></li>
					<li onclick="changeSrc('9-3')"><a>开关量</a></li>
				</ul>
			</li>
		</ul>
		<!-- sidebar menu end-->
	</div>
	</aside> 
	<!--sidebar end--> 
	<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
	<!--main content start--> 
	<section id="main-content"> 
		<section class="wrapper">
			<div class="row">
				<iframe id ="MainContentPage" src="${ctx}/IndexController/iniDataPage" width="100%" height="100%"></iframe>
			</div>
		</section>
	</section>
	<!--main content end--> 
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				NUAA CCST <a href="#" class="go-top"> <i class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
</section>




	<!-- js placed at the end of the document so the pages load faster -->
	<script src="${ctx}/dashgum/js/jquery.js"></script>
	<script src="${ctx}/dashgum/js/jquery-1.8.3.min.js"></script>
	<script src="${ctx}/dashgum/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="${ctx}/dashgum/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="${ctx}/dashgum/js/jquery.scrollTo.min.js"></script>
	<script src="${ctx}/dashgum/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="${ctx}/dashgum/js/jquery.sparkline.js"></script>


	<!--common script for all pages-->
	<script src="${ctx}/dashgum/js/common-scripts.js"></script>

	<script type="text/javascript"
		src="${ctx}/dashgum/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="${ctx}/dashgum/js/gritter-conf.js"></script>

	<!--script for this page-->
	<script src="${ctx}/dashgum/js/sparkline-chart.js"></script>
	<script src="${ctx}/dashgum/js/zabuto_calendar.js"></script>


	<script type="application/javascript">
		$(document).ready(function() {
			$("#date-popover").popover({
				html : true,
				trigger : "manual"
			});
			$("#date-popover").hide();
			$("#date-popover").click(function(e) {
				$(this).hide();
			});
	
			$("#my-calendar").zabuto_calendar({
				action : function() {
					return myDateFunction(this.id, false);
				},
				action_nav : function() {
					return myNavFunction(this.id);
				},
				ajax : {
					url : "show_data.php?action=1",
					modal : true
				},
				legend : [
					{
						type : "text",
						label : "Special event",
						badge : "00"
					},
					{
						type : "block",
						label : "Regular event",
					}
				]
			});
		});
	
	
		function myNavFunction(id) {
			$("#date-popover").hide();
			var nav = $("#" + id).data("navigation");
			var to = $("#" + id).data("to");
			console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
		}
	</script>
	
	<script>
	function changeSrc(src)
	{
		document.getElementById("MainContentPage").src="${ctx}/MainContentController/"+src;
		send(src);
	}
	</script>
	
	
	
	</body>
</html>
