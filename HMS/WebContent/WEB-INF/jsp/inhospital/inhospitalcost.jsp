<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Amaze UI Admin index Examples</title>
<%@ include file="/WEB-INF/jsp/common/meta.jsp" %>
</head>
<body>
	<!-- 头部 侧边栏 组件 -->
	<%@ include file="/WEB-INF/jsp/common/header.jsp" %>
	<%@ include file="/WEB-INF/jsp/side-bar/side-bar.jsp" %>
	
	<!-- content start -->
	<div class="admin-content" id="content-box">
	
	</div>
	<!-- content end -->
	
	<!-- javascript -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#bar-inhospital").attr("class","am-list am-collapse admin-sidebar-sub am-in");
		$("#content-box").load("inhospitalcost/findinhosCost.action");
	});
	</script>
</body>
</html>