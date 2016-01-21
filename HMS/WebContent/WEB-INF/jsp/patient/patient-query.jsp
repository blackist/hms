<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">表单</strong> / <small>form</small>
	</div>
</div>
<div class="am-g">
	<div class="am-u-sm-12 am-u-md-6">
		<div class="am-btn-toolbar">
			<div class="am-btn-group am-btn-group-xs">
			<button type="button" onclick = "addyemian()" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增患者</button>
			</div>
		</div>
	</div>
	
	<div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input id="queryPtr" type="text" class="am-form-field" value="${queryPtr}" >
			<span class="am-input-group-btn"  >
				<button onclick = "queryPatients()"class="am-btn am-btn-default" type="button">搜索</button>
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
						<th class="table-id">ID</th>
						<th class="table-title">姓名</th>
						<th class="table-type">性别</th>
						<th class="table-author am-hide-sm-only">年龄</th>
						<th class="table-date am-hide-sm-only">病史</th>
						<th class="table-date am-hide-sm-only">科室</th>
						<th class="table-set">操作</th>
					</tr>
				</thead>
				<tbody>
				<s:iterator value="pb.beanlist" var="patient">
					<tr>
						<td><input type="checkbox" /></td>
						<td><s:property value="#patient.PNo" /></td>
						<!-- ID -->
						<td><s:property value="#patient.PName" /></td>
						<td><s:property value="#patient.PSex" /></td>
						<td><s:property value="#patient.PAge" /></td>
						<td><s:property value="#patient.PHistory" /></td>
						<td><s:property value="#patient.PRoom" /></td>
						<td>
							<div class="am-btn-toolbar">
								<div class="am-btn-group am-btn-group-xs">
									<button onclick="revise('<s:property value='#patient.PNo'/>')" type="button"
										class="am-btn am-btn-default am-btn-xs am-text-secondary">
										<span class="am-icon-pencil-square-o"></span> 编辑
									</button>
									<button onclick="deletepatient('<s:property value='#patient.PNo'/>')" type="button"
										class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only">
										<span class="am-icon-trash-o"></span> 删除
									</button>
								</div>
							</div>
						</td>
					</tr>
				</s:iterator>
				</tbody>
			</table>
		</form>
		<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
	</div>
</div>
<script src="assets/script/patient/patient-query.js"></script>
