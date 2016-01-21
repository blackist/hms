<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html class="no-js">
<head>
<title>Amaze UI Admin index Examples</title>
<%@ include file="/WEB-INF/jsp/common/meta.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/jsp/common/header.jsp"%>

	<div class="am-cf admin-main">

		<!-- side bar -->
		<%@ include file="/WEB-INF/jsp/side-bar/side-bar.jsp"%>

		<!-- content start -->
		<div class="admin-content" id="admin-content">
		</div>
		<!-- content end -->

	</div>

	<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>
	
</body>
<script type="text/javascript">
$(function(){
	$("#bar-hospital").attr("class","am-list am-collapse admin-sidebar-sub am-in");
	$.post("hospital/queryBed.action", function(data){
		$("#admin-content").html(data);
	});
});
</script>
</html>
