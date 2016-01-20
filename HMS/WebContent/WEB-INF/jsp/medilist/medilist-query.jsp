<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>用户管理</small>
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
					<span class="am-icon-trash-o"></span> 批量删除
				</button>
			</div>
		</div>
	</div>
	<div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input id="queryStr" placeholder="药品名" type="text" value="${queryStr}"
			 class="am-form-field" onkeypress="if(event.keyCode==13){queryBtn.click();return false;}"> 
			 <span class="am-input-group-btn" onclick="if()">
				<button class="am-btn am-btn-default" type="button"
				id="queryBtn" onclick="queryMedilist(1)">搜索</button>
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
						<th class="table-Name">药品名</th>
						<th class="table-dName">开药医生</th>
						<th class="table-pName">病人姓名</th>
						<th class="table-Quality">数量</th>
						<th class="table-MPrice">零售价</th>
						<th class="table-Sumprice">总价</th>
						<th class="table-isinHos">是否住院</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="pb.beanlist" var="medilist">
						<tr>
							<td><input type="checkbox" /></td>
							<td><s:property value="#medilist.MNo" /></td>
							<td><a href="#"><s:property value="#medilist.MName" /></a></td>
							<td><s:property value="#medilist.DName" /></td>
							<td><s:property value="#medilist.PName" /></td>
							<td><s:property value="#medilist.MQuantily" /></td>
							<td><s:property value="#medilist.MPrice" /></td>
							<td><s:property value="#medilist.sumprice" /></td>
							<td><s:property value="#medilist.isinHos" /></td>
							<td>
								<div class="am-btn-toolbar">
									<div class="am-btn-group am-btn-group-xs">
										<button
											class="am-btn am-btn-default am-btn-xs am-text-secondary">
											<span class="am-icon-pencil-square-o"></span> 编辑
										</button>
										<button
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
<script src="assets/script/medilist/medilist-query.js"></script>
