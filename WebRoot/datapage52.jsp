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
		<div class="row mtbox">
			<div class="col-md-2 col-sm-2 col-md-offset-3 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz093">图像片选(写)<br>4134144</h3>
				</div>
				<p id="ydz0931">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz094">图像行(写)<br>1058340864</h3>
				</div>
				<p id="ydz0941">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz095">图像块(写)<br>21</h3>
				</div>
				<p id="ydz0951">Some information if it's need</p>
			</div>
			
			<div class="col-md-2 col-sm-2 col-md-offset-3 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz096">图像片选(读)<br>1377799</h3>
				</div>
				<p id="ydz0961">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz097">图像行(读)<br>352716544</h3>
				</div>
				<p id="ydz0971">Some information if it's need</p>
			</div>
			
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz098">图像块(读)<br>117440522</h3>
				</div>
				<p id="ydz0981">Some information if it's need</p>
			</div>
			
			
			<div class="col-md-2 col-sm-2 col-md-offset-3 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz099">遥测片选(写)<br>666627</h3>
				</div>
				<p id="ydz0991">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz100">遥测行(写)<br>170656512</h3>
				</div>
				<p id="ydz1001">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz101">遥测块(写)<br>50331651</h3>
				</div>
				<p id="ydz1011">Some information if it's need</p>
			</div>
			
			
			<div class="col-md-2 col-sm-2 col-md-offset-3 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz102">遥测片选(读)<br>207617</h3>
				</div>
				<p id="ydz1021">Some information if it's need</p>
			</div>

			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz103">遥测行(读)<br>53149952</h3>
				</div>
				<p id="ydz1031">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ydz104">遥测块(读)<br>16777216</h3>
				</div>
				<p id="ydz1041">Some information if it's need</p>
			</div>
		</div>
		<div class="font_bk1"></div>
		<div class="font_bk2">
			<div class="font_bk" onclick="showTable()">查看历史记录</div>
		</div>
		<div class="jqGrid_wrapper">
			<table id="table_list"></table>
			<div id="pager_list" class="text-center"></div>
		</div>
		<div class="font_bk1"></div>
		<!-- /row mt -->
	</body>
	<script src="${ctx}/js/websocket_datapage52.js"></script>
	
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
						url:'${ctx}/MainContentController/getData/5-2', 
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
						colNames:["星上时间 秒","星上时间 毫秒","图像片选(写)","图像行(写)","图像块(写)","图像片选(读)","图像行(读)","图像块(读)","遥测片选(写)","遥测行(写)","遥测块(写)","遥测片选(读)","遥测行(读)","遥测块(读)"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"ydz093",index:"ydz093",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz094",index:"ydz094",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydz095",index:"ydz095",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydz096",index:"ydz096",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ydz097",index:"ydz097",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz098",index:"ydz098",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz099",index:"ydz099",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz100",index:"ydz100",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz101",index:"ydz101",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz102",index:"ydz102",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz103",index:"ydz103",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ydz104",index:"ydz104",editable:true,width:100,align:"center",sorttype:"text",search:true}
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"图像信息历史数据查询",
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
</html>