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
					<h3 id="ygp024">UTC累计秒<br>4134144</h3>
				</div>
				<p id="ygp0241">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp025">UTC微秒<br>1058340864</h3>
				</div>
				<p id="ygp0251">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp032">GDOP<br>21</h3>
				</div>
				<p id="ygp0321">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 col-md-offset-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp033">工作状态<br>1377799</h3>
				</div>
				<p id="ygp0331">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp034">跳秒<br>352716544</h3>
				</div>
				<p id="ygp0341">Some information if it's need</p>
			</div>
			
			<div class="col-md-2 col-sm-2  box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp046">最高信噪比<br>117440522</h3>
				</div>
				<p id="ygp0461">Some information if it's need</p>
			</div>
			<div class="col-md-2 col-sm-2 box0">
				<div class="box1">
					<span class="li_data"></span>
					<h3 id="ygp047">最低信噪比<br>666627</h3>
				</div>
				<p id="ygp0471">Some information if it's need</p>
			</div>
		</div>
		<!-- /row mt -->
		<div class="font_bk1"></div>
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
	<script src="${ctx}/js/websocket_datapage65.js"></script>
	
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
						url:'${ctx}/MainContentController/getData/6-5', 
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
						colNames:["星上时间 秒","星上时间 毫秒","UTC累计秒","UTC微秒","GDOP","工作状态","跳秒","最高信噪比","最低信噪比"],
						colModel:[
									{name:"ysj023",index:"ysj023",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"ysj024",index:"ysj024",editable:true,width:90,align:"center",sorttype:"text",search:true},
									{name:"ygp024",index:"ygp024",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ygp025",index:"ygp025",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygp032",index:"ygp032",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygp033",index:"ygp033",editable:true,width:80,align:"center",sorttype:"text",search:true},
									{name:"ygp034",index:"ygp034",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ygp046",index:"ygp046",editable:true,width:100,align:"center",sorttype:"text",search:true},
									{name:"ygp047",index:"ygp047",editable:true,width:100,align:"center",sorttype:"text",search:true},
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"直显信息历史数据查询",
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