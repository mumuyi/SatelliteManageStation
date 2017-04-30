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
	<title>账户管理</title>
	
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

	</head>
	<body>
		<div class="jqGrid_wrapper">
			<table id="table_list"></table>
			<div id="pager_list" class="text-center"></div>
		</div>
		<div class="font_bk1"></div>
	</body>

	
    <script src="${ctx}/jqgrid/js/bootstrap.min.js"></script>
    <script src="${ctx}/jqgrid/js/jquery.peity.min.js"></script>
    <script src="${ctx}/jqgrid/js/grid.locale-cn.js"></script>
    <script src="${ctx}/jqgrid/js/jquery.jqGrid.min.js"></script>
    <script src="${ctx}/jqgrid/js/content.min.js"></script>
    <script src="${ctx}/jqgrid/js/jquery-ui-1.10.4.min.js"></script>
    <script type="text/javascript"> jQuery.jgrid.no_legacy_api = true; </script> 
    <script>
		$(function(){ TableInit(); });
		
		function TableInit(){
					$.jgrid.defaults.styleUI="Bootstrap";
					$("#table_list").jqGrid(
					{
						url:'${ctx}/UserManageController/TableIni',
						cellsubmit: 'clientArray',
						editurl:'${ctx}/UserManageController/TableOpration',
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
						rowNum:20,
						rowList:[20],
						colNames:["用户名","数据综合系统遥测信息访问权限","姿控信息访问权限","电源系统遥测信息访问权限","通信系统遥测信息访问权限","管理员权限"],
						colModel:[
									{name:"username",index:"username",editable:true,width:60,align:"center",sorttype:"text",search:true},
									{name:"permission1",index:"permission1",editable:true,width:90,align:"center",sorttype:"text",search:true,edittype:"select",editoptions:{value :"0:无;1:有"}},
									{name:"permission2",index:"permission2",editable:true,width:100,align:"center",sorttype:"text",search:true,edittype:"select",editoptions:{value :"0:无;1:有"}},
									{name:"permission3",index:"permission3",editable:true,width:80,align:"center",sorttype:"text",search:true,edittype:"select",editoptions:{value :"0:无;1:有"}},
									{name:"permission4",index:"permission4",editable:true,width:80,align:"center",sorttype:"text",search:true,edittype:"select",editoptions:{value :"0:无;1:有"}},
									{name:"permission5",index:"permission5",editable:true,width:80,align:"center",sorttype:"text",search:true,edittype:"select",editoptions:{value :"0:无;1:有"}}
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"账户管理",
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
							{height:400,reloadAfterSubmit:true}
						);
						
						$(window).bind("resize",function(){
			    						var width=$(".jqGrid_wrapper").width();
			    						//width="document.body.clientHeight";
			    						$("#table_list").setGridWidth((width))
									}
								)
			}    
    </script>
</html>