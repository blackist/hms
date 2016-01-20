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
		<div class="admin-content">

			<!-- content start -->
			<div class="admin-content">
				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">病人诊断</strong> / <small>DiagnosticInfo</small>
					</div>
				</div>
				<hr />
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-4 am-u-md-push-8"></div>
					<div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
						<form action="diag/saveDiag.action" method="post" id="diagForm">



							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">诊断记录：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<input type="text" class="am-input-sm" name="diagnosticInfo.DInfo"
										id="diagnosticInfo.DInfo" required="required">
								</div>
								<div class="am-hide-sm-only am-u-md-6">*必填</div>
							</div>

							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">医生姓名：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<input type="text" class="am-input-sm" name="diagnosticInfo.DName"
										id="diagnosticInfo.DName" required="required">
								</div>
								<div class="am-hide-sm-only am-u-md-6">*必填</div>
							</div>

							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">病人姓名：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<input type="text" class="am-input-sm" name="diagnosticInfo.PName"
										id="diagnosticInfo.PName" required="required">
								</div>
								<div class="am-hide-sm-only am-u-md-6">*必填</div>
							</div>

							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">电子处方：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<input type="text" class="am-input-sm" name="diagnosticInfo.PMnos"
										id="diagnosticInfo.PMnos" required="required">
								</div>
								<div class="am-hide-sm-only am-u-md-6">*必填</div>
							</div>

							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">所属科室：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<input type="text" class="am-input-sm" name="diagnosticInfo.SName"
										id="diagnosticInfo.SName" required="required">
								</div>
								<div class="am-hide-sm-only am-u-md-6">*必填</div>
							</div>

							<div class="am-g am-margin-top">
								<div class="am-u-sm-4 am-u-md-2 am-text-right">时间：</div>
								<div class="am-u-sm-8 am-u-md-4">
									<div class="am-form-group am-form-icon">
										<i class="am-icon-calendar"></i> <input type="text"
											class="am-form-field" data-am-datepicker readonly
											name="diagnosticInfo.DDate" id="DDate">
									</div>
								</div>
								<div class="am-hide-sm-only am-u-md-6"></div>
							</div>
							<div class="am-form-group">
								<div class="am-u-sm-9 am-u-sm-push-3">
									<input type="submit" class="am-btn am-btn-primary" value="提交诊断"></input>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- content end -->



		</div>

	</div>

	<a href="#" class="am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"> <span
		class="am-icon-btn am-icon-th-list"></span>
	</a>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>
</body>

<script type="text/javascript">
	function addDiagSubmit() {
		// 参数校验
		var DDate = $("#DDate").val();
		var DInfo = $("#DInfo").val();
		var DName = $("#DName").val();
		var PName = $("#PName").val();
		var PMnos = $("#PMnos").val();
		var SName = $("#SName").val();
		if (DDate != null && DDate != "" && DInfo != null && DInfo != ""
				&& DName != null && DName != "" && PName != null && PName != ""
				&& PMnos != "" && PMnos != null && DName != "" && SName != null
				&& SName != "") {
			var diagForm = $("#diagForm").serialize();
			$.post("diag/saveDiag.action", userForm, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>
<script type="text/javascript">
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
</html>
