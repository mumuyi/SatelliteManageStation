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
    
    <!-- Custom styles for this template -->
    <link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
	<style>
		.font_bkaa{
			width:200px;
			height:80px;
			background-color:#3bb7fc;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:10px;
			font-size:48;
			color:#ffffff;
		}
		
		.font_bkaa1{
			width:200px;
			height:80px;
			background-color:#1189cc;
			border-radius:20px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:10px;
			font-size:48;
			color:#ffffff;
		}
	</style>

	<!-- Custom styles for this template -->
	<link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/bootstrap.min.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/font-awesome.min.css" rel="stylesheet">
	<!-- jqgrid-->
	<link href="${ctx}/jqgrid/css/ui.jqgrid.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/animate.min.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/style.min.css" rel="stylesheet">
	
	<style>
		.font_bk{
			width:200px;
			height:30px;
			background-color:#7fbd5a;
			border-radius:10px;//左上，右上，右下，坐下都是10px
			margin:0 auto;
			text-align:center;
			padding-top:5px;
			font-size:20px;
			color:#ffffff;
			horizontal-align:middle;
			display:table-cell;
		}
		.font_bk1{
			height:100px;
		}
		.font_bk2{
			width:100%;
			display:table;
		}
		.font_bk:hover{background-color:#65934a;}
	</style>    
    
    
	</head>
	<body>
		<table class="container">
			<tr height=300></tr>
			<tr>
				<th><div  class="font_bkaa" id="ydp147">通信机接收机锁定<br>Value</div></th>
				<th><div  class="font_bkaa" id="ydp148">应答机接收机锁定<br>Value</div></th>
				<th><div  class="font_bkaa" id="ydp149">通信机发射机<br>Value</div></th>
				<th><div  class="font_bkaa" id="ydp150">通信机发射功率<br>Value</div></th>
				<th><div  class="font_bkaa" id="ydp151">应答机发射机<br>Value</div></th>
			</tr>

			<tr height=100></tr>
			<tr>
				<th><div  class="font_bkaa1" id="ydp152">应答机接收机<br>Value</div></th>
				<th><div  class="font_bkaa1" id="ydp153">应答机测距<br>Value</div></th>
				<th><div  class="font_bkaa1" id="ydp154">应答机相干<br>Value</div></th>
				<th><div  class="font_bkaa1" id="ydp155">通信机加电状态<br>Value</div></th>
				<th><div  class="font_bkaa1" id="ydp156">USB加电状态<br>Value</div></th>
			</tr>

			<tr height=100></tr>
		</table>
		<div class="font_bk1"></div>
		<div class="font_bk1"></div>
		<div class="font_bk2">
			<div class="font_bk" onclick="showTable()">查看历史记录</div>
		</div>
		<div class="jqGrid_wrapper">
			<table id="table_list"></table>
			<div id="pager_list" class="text-center"></div>
		</div>
		<div class="font_bk1"></div>
	</body>
	<script src="${ctx}/js/websocket_datapage93.js"></script>
	
	<script type="text/javascript" src="${ctx}/highcharts/js/jquery-1.8.3.min.js"></script>
	<script src="${ctx}/jqgrid/js/bootstrap.min.js"></script>
	<script src="${ctx}/jqgrid/js/jquery.peity.min.js"></script>
	<script src="${ctx}/jqgrid/js/grid.locale-cn.js"></script>
	<script src="${ctx}/jqgrid/js/jquery.jqGrid.min.js"></script>
	<script src="${ctx}/jqgrid/js/content.min.js"></script>
	<script src="${ctx}/jqgrid/js/jquery-ui-1.10.4.min.js"></script>
	<script type="text/javascript"> jQuery.jgrid.no_legacy_api = true; </script> 
	<script>
		//$(function(){ TableInit(); });
		
		function TableInit(){
					$.jgrid.defaults.styleUI="Bootstrap";
					$("#table_list").jqGrid(
					{
						url:'${ctx}/MainContentController/getData/9-3', 
						datatype : "json",
						postData:{
								page : $('#table_list').getGridParam('page'), // current page
								rows : $('#table_list').getGridParam('rows'), // rows  
								sidx : $('#table_list').getGridParam('sidx'), // sidx
								sord : $('#table_list').getGridParam('sord'), // sord
						},
						height:'100%',
						width:'90%',
						autowidth:true,
						shrinkToFit:true,
						rowNum:10,
						rowList:[10,20,30],
						colNames:["星上时间 秒","星上时间 毫秒","通信机接收机锁定","应答机接收机锁定","通信机发射机","通信机发射功率","应答机发射机","应答机接收机","应答机测距","应答机相干","通信机加电状态","USB加电状态"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"ydp147",index:"ydp147",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp148",index:"ydp148",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydp149",index:"ydp149",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydp150",index:"ydp150",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydp151",index:"ydp151",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp152",index:"ydp152",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp153",index:"ydp153",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp154",index:"ydp154",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp155",index:"ydp155",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydp156",index:"ydp156",editable:true,width:100,align:"center",sorttype:"text",search:true},
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"开关量历史数据查询",
						//hidegrid:true,
						//loadonce:true,
						
						
						gridComplete: function(){
							$('#table_list').closest("div.ui-jqgrid-view")
							.children("div.ui-jqgrid-titlebar")
							.css("text-align", "center")
							.children("span.ui-jqgrid-title")
							.css("float", "none");
							}
						});
						
			
			 
						//$("#table_list").setSelection(4,true);
						
						$("#table_list").jqGrid(
							"navGrid","#pager_list",
							{edit:true,add:true,del:true,search:true},
							{height:200,reloadAfterSubmit:true}
						);
						
						$(window).bind("resize",function(){
										var width=$(".jqGrid_wrapper").width();
										//width="document.body.clientHeight";
										$("#table_list").setGridWidth((width))
									}
								)
			}    
	
	function showTable(){
		TableInit();
	}
	</script>
</html>