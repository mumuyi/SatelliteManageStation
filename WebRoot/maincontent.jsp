<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>maincontent.html</title>

<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">


<link href="${ctx}/dashgum/css/style.css" rel="stylesheet">
<link href="${ctx}/dashgum/css/bootstrap.css" rel="stylesheet">


<link href="${ctx}/jqgrid/css/bootstrap.min.css" rel="stylesheet">
<link href="${ctx}/jqgrid/css/font-awesome.min.css" rel="stylesheet">

<!-- jqgrid-->
<link href="${ctx}/jqgrid/css/ui.jqgrid.css" rel="stylesheet">

<link href="${ctx}/jqgrid/css/animate.min.css" rel="stylesheet">
<link href="${ctx}/jqgrid/css/style.min.css" rel="stylesheet">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body style="overflow-x:hidden">
	<div class="jqGrid_wrapper">
		<table id="table_list"></table>
		<div id="pager_list" class="text-center"></div>
	</div>



	<input id="text" type="text" />
	<button onclick="send()">Send</button>
	<button onclick="closeWebSocket()">Close</button>
	<div id="message"></div>

    <script src="${ctx}/jqgrid/js/jquery.min.js"></script>
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
						url:'${ctx}/MainContentController/getData', 
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
						rowList:[10,20,30],
						colNames:["序号","日期","客户","金额","运费","总额","备注"],
						colModel:[
									{name:"id",index:"id",editable:true,width:60,search:true},
									{name:"invdate",index:"invdate",editable:true,width:90,sorttype:"date",formatter:"date",align:"center"},
									{name:"name",index:"name",editable:true,width:100,align:"center"},
									{name:"amount",index:"amount",editable:true,width:80,align:"center",sorttype:"float",formatter:"number"},
									{name:"tax",index:"tax",editable:true,width:80,align:"center",sorttype:"float"},
									{name:"total",index:"total",editable:true,width:80,align:"center",sorttype:"float"},
									{name:"note",index:"note",editable:true,width:100,sortable:false,align:"center"}
						],
						
						pager:"#pager_list",
						viewrecords:true,
						caption:"jqGrid",
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
    
    </script>
    
</body>
</html>
