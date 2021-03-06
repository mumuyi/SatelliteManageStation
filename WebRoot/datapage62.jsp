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
	

		<script src="${ctx}/js/highcharts621.js"></script>
		<script src="${ctx}/js/highcharts622.js"></script>
		<script src="${ctx}/js/highcharts623.js"></script>
		<script src="${ctx}/js/highcharts624.js"></script>
		<script src="${ctx}/js/highcharts625.js"></script>
		<script src="${ctx}/js/highcharts626.js"></script>
		<script src="${ctx}/js/highcharts627.js"></script>
		<script src="${ctx}/js/highcharts628.js"></script>
	</head>
	<body>
		<script src="${ctx}/highcharts/js/highcharts.js"></script>
		<script src="${ctx}/highcharts/js/exporting.js"></script>
		
		
		<table width="100%" border="0">
		  <tr>
    		<th><div id="ytm008" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ytm009" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ytm010" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ytm011" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ytm012" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ytm013" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
   		  <tr height=30></tr>
  		  <tr>
    		<th><div id="ytm014" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
    		<th><div id="ytm015" style="height: 300px; min-width: 600px ; max-width: 200px; margin:0 auto;"></div></th>
  		  </tr>
  		  <tr height=30></tr>
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
	<script src="${ctx}/js/websocket_datapage62.js"></script>
	
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
						url:'${ctx}/MainContentController/getData/6-2', 
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
						colNames:["星上时间 秒","星上时间 毫秒","太敏A探头输出1","太敏A探头输出2","太敏A探头输出3","太敏A探头输出4","太敏B探头输出1","太敏B探头输出2","太敏B探头输出3","太敏B探头输出4"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"ytm008",index:"ytm008",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ytm009",index:"ytm009",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ytm010",index:"ytm010",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ytm011",index:"ytm011",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ytm012",index:"ytm012",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ytm013",index:"ytm013",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ytm014",index:"ytm014",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ytm015",index:"ytm015",editable:true,width:100,align:"center",sorttype:"text",search:true},
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"模拟太敏输出历史数据查询",
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
						url:'${ctx}/MainContentController/getTableShowData/6-2-1', 
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