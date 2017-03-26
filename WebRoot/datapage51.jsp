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
	<link href="${ctx}/jqgrid/css/bootstrap.min.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/font-awesome.min.css" rel="stylesheet">
	
	<!-- jqgrid-->
	<link href="${ctx}/jqgrid/css/ui.jqgrid.css" rel="stylesheet">
	
	<link href="${ctx}/jqgrid/css/animate.min.css" rel="stylesheet">
	<link href="${ctx}/jqgrid/css/style.min.css" rel="stylesheet">
	<style type="text/css">
	${
	demo
	.css
	}
	</style>
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
		<script src="${ctx}/js/highcharts511.js"></script>
		<script src="${ctx}/js/highcharts512.js"></script>
		<script src="${ctx}/js/highcharts513.js"></script>
		<script src="${ctx}/js/highcharts514.js"></script>
		<script src="${ctx}/js/highcharts515.js"></script>
		<script src="${ctx}/js/highcharts516.js"></script>
	</head>
	<body>
		<script src="${ctx}/highcharts/js/highcharts.js"></script>
		<script src="${ctx}/highcharts/js/exporting.js"></script>
		
		
		<table width="100%" border="0">
		  <tr>
    		<th><div id="yjs087" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="yjs088" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="yjs089" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="yjs090" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="yjs091" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="yjs092" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
		</table>
		<div class="font_bk2">
			<div class="font_bk" onclick="showTable()">查看历史记录</div>
		</div>
		<div class="jqGrid_wrapper">
			<table id="table_list"></table>
			<div id="pager_list" class="text-center"></div>
		</div>
		<div class="font_bk1"></div>
	</body>
	<script src="${ctx}/js/websocket_datapage51.js"></script>
	
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
						url:'${ctx}/MainContentController/getData/5-1', 
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
						colNames:["星上时间 秒","星上时间 毫秒","载荷数据处理器+5vA遥测","载荷数据处理器+5vB遥测","+3.3VB遥测","CPUA电流遥测","CPUB电流遥测","+3.3VA遥测"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"yjs087",index:"yjs087",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"yjs088",index:"yjs088",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"yjs089",index:"yjs089",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"yjs090",index:"yjs090",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"yjs091",index:"yjs091",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"yjs092",index:"yjs092",editable:true,width:100,align:"center",sorttype:"text",search:true}
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"CPU参数历史数据查询",
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