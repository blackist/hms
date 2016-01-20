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
						<form action="diag/saveDiag.action" method="post">
							<div class="am-form-group">
								<label for="user-name" class="am-u-sm-3 am-form-label">诊断日期：</label>

								<input name="diagnosticInfo.DDate"></input>

							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-u-sm-3 am-form-label">诊断记录：</label>

								<input name="diagnosticInfo.DInfo"></input>

							</div>

							<div class="am-form-group">
								<label for="user-phone" class="am-u-sm-3 am-form-label">医生姓名：</label>

								<input name="diagnosticInfo.DName"></input>

							</div>

							<div class="am-form-group">
								<label for="user-QQ" class="am-u-sm-3 am-form-label">病人姓名：</label>

								<input name="diagnosticInfo.PName"></input>

							</div>

							<div class="am-form-group">
								<label for="user-weibo" class="am-u-sm-3 am-form-label">电子处方：</label>

								<input name="diagnosticInfo.PMnos"></input>

							</div>

							<div class="am-form-group">
								<label for="user-intro" class="am-u-sm-3 am-form-label">所属科室：</label>

								<input name="diagnosticInfo.SName"></input>

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
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
</html>
