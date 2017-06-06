<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	 <!-- <base href="<%=basePath%>"> --> 
   
   	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
    <title>PassWord Change</title>
	
    <!-- Bootstrap core CSS -->
    <link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${ctx}/dashgum/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
    <link href="${ctx}/dashgum/css/style-responsive.css" rel="stylesheet">

  </head>
  <body>
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->

	  <div id="login-page">
	  	<div class="container">
	  	
		      <form class="form-login" action="${ctx}/PassWordChangeController/ChangePassWord" method="post" onsubmit="return check()">
		        <h2 class="form-login-heading">Change your password</h2>
		        <div class="login-wrap">
		            <input type="password" class="form-control" placeholder="Old Password" name="oldpassword" id="oldpassword">
		            <br>
		            <input type="password" class="form-control" placeholder="New Password" name="newpassword" id="newpassword">
		            <br>
		            <input type="password" class="form-control" placeholder="New Password Confirm" name="newpassword1" id="newpassword1">
		            <label class="checkbox">
		                <span class="pull-right"></span>
		            </label>
		            <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i> Change now</button>
		        </div>
		      </form>	  	
	  	</div>
	  </div>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="${ctx}/dashgum/js/jquery.js"></script>
    <script src="${ctx}/dashgum/js/bootstrap.min.js"></script>

    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="${ctx}/dashgum/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("${ctx}/dashgum/img/background.jpg", {speed: 100});
    </script>
  </body>
</html>
