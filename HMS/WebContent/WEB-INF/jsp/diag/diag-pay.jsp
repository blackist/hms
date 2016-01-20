<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
			<table class="am-table am-table-striped am-table-hover table-main">
				<thead>
					<tr>

						<th class="table-id">药品名称</th>
						<th class="table-id">药品类型</th>
						<th class="table-title">药品价格</th>
						<th class="table-id">药品数量</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="pb.beanlist" var="cost">
						<tr>

							<td><s:property value="#cost.MName" /></td>
							<td><s:property value="#cost.MType" /></td>
							<td><s:property value="#cost.MPrice" /></td>
							<td><s:property value="#cost.MCount" /></td>
							<td>
								<button type="button"
									class="am-btn am-btn-default am-btn-xs am-text-secondary"
									onclick="updateDiag('<s:property value="#cost.MNo"/>')">
									<span class="am-icon-pencil-square-o"></span> 选择
								</button>
							</td>

						</tr>
					</s:iterator>
				</tbody>
			</table>
			<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
		</div>
		<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
	</div>

	<a href="#" class="am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"> <span
		class="am-icon-btn am-icon-th-list"></span>
	</a>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/amazeui.min.js"></script>
	<script src="assets/js/app.js"></script>
	<script src="assets/script/diag/diag-update.js"></script>
</body>
<script type="text/javascript">
	$(function(){
		_pageIndexBond(queryInhospCost);
	});
	
	function getAddpage(){
		$("#content-box").load("diag/getaddpage.action");
	}
	
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
</html>
