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
		<form action="diag/saveDiag.action" method="post">诊断日期：<input 
		name="diagnosticInfo.DDate"><br /> 诊断记录：<input
		name="diagnosticInfo.DInfo"><br /> 医生姓名：<input
		name="diagnosticInfo.DName"><br /> 病人姓名：<input
		name="diagnosticInfo.PName"><br /> 电子处方：<input
		name="diagnosticInfo.PMnos"><br /> 所属科室：<input
		name="diagnosticInfo.SName"><br /> <input type="submit"
		value="提交诊断">
</form>
		</div>
		<!-- content end -->

	</div>

	<a href="#" class="am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"> <span
		class="am-icon-btn am-icon-th-list"></span>
	</a>

	<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>

	<script src="assets/script/user-index.js"></script>

</body>
<script type="text/javascript">
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
</html>
