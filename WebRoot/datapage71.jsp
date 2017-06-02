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
	<title>CPU相关信息</title>
	
	<script type="text/javascript" src="${ctx}/highcharts/js/jquery-1.8.3.min.js"></script>
	<style type="text/css">
	${
	demo
	.css
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

		<script src="${ctx}/js/highcharts71.js"></script>
	</head>
	<body>
		<script src="${ctx}/highcharts/js/highcharts.js"></script>
		<script src="${ctx}/highcharts/js/exporting.js"></script>
		
		
		<table width="100%" border="0">
		  <tr>
    		<th><div id="ygd040" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ygd041" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ygd042" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ygd043" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ygd044" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ygd045" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=100></tr>
		</table>
		<div class="jqGrid_wrapper">
			<table id="table_list1" class="container"></table>
			<div id="pager_list1" class="text-center"></div>
		</div>
		<div class="font_bk2">
			<div class="font_bk" onclick="showTable()">查看历史记录</div>
		</div>
		<div class="jqGrid_wrapper">
			<table id="table_list"></table>
			<div id="pager_list" class="text-center"></div>
		</div>
		<div class="font_bk1"></div>
	</body>
	<script src="${ctx}/js/websocket_datapage71.js"></script>
	
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
						url:'${ctx}/MainContentController/getData/7-1', 
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
						colNames:["星上时间 秒","星上时间 毫秒","轨道解算X位置","轨道解算X位置","轨道解算X位置","轨道解算X位置","轨道解算X位置","轨道解算X位置"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"ygd040",index:"ygd040",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ygd041",index:"ygd041",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygd042",index:"ygd042",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygd043",index:"ygd043",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygd044",index:"ygd044",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ygd045",index:"ygd045",editable:true,width:100,align:"center",sorttype:"text",search:true},
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"轨道解算历史数据查询",
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
							{edit:false,add:false,del:false,search:true},
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
	
	<script>
		$(function(){ TableInit1(); });
		
		function TableInit1(){
					$.jgrid.defaults.styleUI="Bootstrap";
					$("#table_list1").jqGrid(
					{
						url:'${ctx}/MainContentController/getTableShowData/7-1-1', 
						datatype : "json",
						postData:{
								page : $('#table_list1').getGridParam('page'), // current page
								rows : $('#table_list1').getGridParam('rows'), // rows  
								sidx : $('#table_list1').getGridParam('sidx'), // sidx
								sord : $('#table_list1').getGridParam('sord'), // sord
						},
						height:'100%',
						width:'90%',
						autowidth:true,
						shrinkToFit:true,
						rowNum:30,
						colNames:["参数名称","值","星上时间 秒","星上时间 毫秒","最小值","最大值"],
						colModel:[
									{name:"name",index:"name",editable:true,align:"center",sorttype:"text",search:true},
									{name:"value",index:"value",editable:true,align:"center",sorttype:"text",search:true},
									{name:"times",index:"times",editable:true,align:"center",sorttype:"text",search:true},
									{name:"timems",index:"times",editable:true,align:"center",sorttype:"text",search:true},
									{name:"min",index:"min",editable:true,align:"center",sorttype:"text",search:true},
									{name:"max",index:"max",editable:true,align:"center",sorttype:"text",search:true},
						],
						
						pager:"#pager_list1",
						viewrecords:true,
						caption:"开关量数据查询",
						//hidegrid:true,
						//loadonce:true,
						
						
						gridComplete: function(){
							$('#table_list1').closest("div.ui-jqgrid-view")
							.children("div.ui-jqgrid-titlebar")
							.css("text-align", "center")
							.children("span.ui-jqgrid-title")
							.css("float", "none");
							}
						});
						
			
			 
						//$("#table_list1").setSelection(4,true);
						
						$("#table_list1").jqGrid(
							"navGrid","#pager_list1",
							{edit:false,add:false,del:false,search:true},
							{height:200,reloadAfterSubmit:true}
						);
						
						$(window).bind("resize",function(){
										var width=$(".jqGrid_wrapper").width();
										//width="document.body.clientHeight";
										$("#table_list1").setGridWidth((width))
									}
								)
			}    
	</script>
</html>