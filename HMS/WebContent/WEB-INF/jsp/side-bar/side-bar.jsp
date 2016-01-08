<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
	<div class="am-offcanvas-bar admin-offcanvas-bar">
		<ul class="am-list admin-sidebar-list">
			<li><a href="admin-index.html"><span class="am-icon-home"></span>
					首页</a></li>

			<%@ include file="/WEB-INF/jsp/side-bar/bar-patient.jsp"%>
			<%@ include file="/WEB-INF/jsp/side-bar/bar-medicine.jsp"%>
			<%@ include file="/WEB-INF/jsp/side-bar/bar-inhospital.jsp"%>
			<%@ include file="/WEB-INF/jsp/side-bar/bar-hospital.jsp"%>
			<%@ include file="/WEB-INF/jsp/side-bar/bar-user.jsp"%>
			<%@ include file="/WEB-INF/jsp/side-bar/bar-role.jsp"%>

			<li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
		</ul>
		<div class="am-panel am-panel-default admin-sidebar-panel">
			<div class="am-panel-bd">
				<p>
					<span class="am-icon-bookmark"></span> 公告
				</p>
				<p>病人的痊愈是我们对自己最大的满意。—— 徐医</p>
			</div>
		</div>
	</div>
</div>
<!-- sidebar end -->