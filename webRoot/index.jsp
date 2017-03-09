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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!-- Bootstrap core CSS -->
<link href="dashgum/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="dashgum/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="dashgum/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css" href="dashgum/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="dashgum/css/style.css" rel="stylesheet">
<link href="dashgum/css/style-responsive.css" rel="stylesheet">



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
	<a href="index.html" class="logo"><b>DASHGUM FREE</b></a> 
	<!--logo end-->
	
	<div class="top-menu">
		<ul class="nav pull-right top-menu">
			<li><a class="logout" href="login.html">Logout</a></li>
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
					<img src="dashgum/img/ui-sam.jpg"class="img-circle" width="60">
				</a>
			</p>
			<h5 class="centered">Marcel Newman</h5>
			
			<li class="mt">
				<a class="active" href=""> 
					<i class="fa fa-dashboard"></i> 
					<span>主页</span>
				</a>
			</li>

			<li class="sub-menu"><a href="javascript:;"><i class="fa fa-desktop"></i><span>UI Elements</span></a>
				<ul class="sub">
					<li onclick="changeSrc('${ctx}/MainContentController/1')"><a>General</a></li>
					<li onclick="changeSrc('${ctx}/MainContentController/2')"><a>Buttons</a></li>
					<li><a href="panels.html">Panels</a></li>
				</ul>
			</li>

			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-cogs"></i> <span>Components</span>
			</a>
				<ul class="sub">
					<li><a href="calendar.html">Calendar</a></li>
					<li><a href="gallery.html">Gallery</a></li>
					<li><a href="todo_list.html">Todo List</a></li>
				</ul></li>
			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-book"></i> <span>Extra Pages</span>
			</a>
				<ul class="sub">
					<li><a href="blank.html">Blank Page</a></li>
					<li><a href="login.html">Login</a></li>
					<li><a href="lock_screen.html">Lock Screen</a></li>
				</ul></li>
			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-tasks"></i> <span>Forms</span>
			</a>
				<ul class="sub">
					<li><a href="form_component.html">Form Components</a></li>
				</ul></li>
			<li class="sub-menu"><a href="javascript:;"> <i
					class="fa fa-th"></i> <span>Data Tables</span>
			</a>
				<ul class="sub">
					<li><a href="basic_table.html">Basic Table</a></li>
					<li><a href="responsive_table.html">Responsive Table</a></li>
				</ul></li>
			<li class="sub-menu"><a href="javascript:;"> <i
					class=" fa fa-bar-chart-o"></i> <span>Charts</span>
			</a>
				<ul class="sub">
					<li><a href="morris.html">Morris</a></li>
					<li><a href="chartjs.html">Chartjs</a></li>
				</ul></li>

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
				<iframe id ="MainContentPage" src="${ctx}/IndexController" width="100%" height="100%"></iframe>
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
	<script src="dashgum/js/jquery.js"></script>
	<script src="dashgum/js/jquery-1.8.3.min.js"></script>
	<script src="dashgum/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="dashgum/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="dashgum/js/jquery.scrollTo.min.js"></script>
	<script src="dashgum/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="dashgum/js/jquery.sparkline.js"></script>


	<!--common script for all pages-->
	<script src="dashgum/js/common-scripts.js"></script>

	<script type="text/javascript"
		src="dashgum/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="dashgum/js/gritter-conf.js"></script>

	<!--script for this page-->
	<script src="dashgum/js/sparkline-chart.js"></script>
	<script src="dashgum/js/zabuto_calendar.js"></script>

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
		document.getElementById("MainContentPage").src=src;
	}
	</script>
	
	
	
	</body>
</html>
