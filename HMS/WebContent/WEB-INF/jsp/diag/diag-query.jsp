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

			<div class="am-cf am-padding">
				<div class="am-fl am-cf">
					<strong class="am-text-primary am-text-lg">表格</strong> / <small>Table</small>
				</div>
			</div>

			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-plus"></span> 新增
							</button>
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-save"></span> 保存
							</button>
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-archive"></span> 审核
							</button>
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-trash-o"></span> 删除
							</button>
						</div>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">
					<div class="am-form-group">
						<select data-am-selected="{btnSize: 'sm'}">
							<option value="option1">所有类别</option>
							<option value="option2">IT业界</option>
							<option value="option3">数码产品</option>
							<option value="option3">笔记本电脑</option>
							<option value="option3">平板电脑</option>
							<option value="option3">只能手机</option>
							<option value="option3">超极本</option>
						</select>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">
					<div class="am-input-group am-input-group-sm">
						<input type="text" class="am-form-field"> <span
							class="am-input-group-btn">
							<button class="am-btn am-btn-default" type="button">搜索</button>
						</span>
					</div>
				</div>
			</div>

			<div class="am-g">
				<div class="am-u-sm-12">
					<form class="am-form">
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th class="table-check"><input type="checkbox" /></th>
									<th class="table-id">挂号单号</th>
									<th class="table-title">诊断日期</th>
									<th class="table-type">诊断记录</th>
									<th class="table-author am-hide-sm-only">医生姓名</th>
									<th class="table-date am-hide-sm-only">病人姓名</th>
									<th class="table-set">电子处方</th>
									<th class="table-set">所属科室</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="pb.beanlist" var="cost">
									<tr>
									    <td class="table-check"><input type="checkbox" /></td>
										<td><s:property value="#cost.RId" /></td>
										<td><s:property value="#cost.DDate" /></td>
										<td><s:property value="#cost.DInfo" /></td>
										<td><s:property value="#cost.DName" /></td>
										<td><s:property value="#cost.PName" /></td>
										<td><s:property value="#cost.PMnos" /></td>
										<td><s:property value="#cost.SName" /></td>
										
									</tr>
								</s:iterator>
							</tbody>
						</table>

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
</body>
<script type="text/javascript">
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
</html>