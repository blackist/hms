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

			<div class="am-cf am-padding">
				<div class="am-fl am-cf">
					<strong class="am-text-primary am-text-lg">首页</strong> / <small>一些常用模块</small>
				</div>
			</div>

			<ul
				class="am-avg-sm-1 am-avg-md-4 am-margin am-padding am-text-center admin-content-list ">
				<li><a href="patient/indexPatient.action"
					class="am-text-success"><span
						class="am-icon-btn am-icon-file-text"></span><br />新增患者<br />2300</a></li>
				<li><a href="inhospital/indexinHospital.action"
					class="am-text-warning"><span
						class="am-icon-btn am-icon-briefcase"></span><br />住院人数<br />308</a></li>
				<li><a href="hospital/indexHospital.action" class="am-text-danger"><span
						class="am-icon-btn am-icon-recycle"></span><br />医院管理<br />80082</a></li>
				<li><a href="javascript:;" class="am-text-secondary"><span
						class="am-icon-btn am-icon-user-md"></span><br />在线医生<br />3000</a></li>
			</ul>
		</div>

	</div>

	<a href="#" class="am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"> <span
		class="am-icon-btn am-icon-th-list"></span>
	</a>

	<%@ include file="/WEB-INF/jsp/common/footer.jsp"%>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>
</body>
</html>
