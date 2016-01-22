<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>住院病人管理</small>
	</div>
</div>


<div class="am-g">
	<div class="am-u-sm-12 am-u-md-6">
		<div class="am-btn-toolbar">
			<div class="am-btn-group am-btn-group-xs">
				<button type="button" class="am-btn am-btn-default"
					onclick="javascript:getsaveinpatient(1)">
					<span class="am-icon-plus"></span> 新增
				</button>

			</div>
		</div>
	</div>

	<div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input type="text" class="am-form-field" id="condidtions"
				value="${condidtions}"
				onkeypress="if(event.keyCode==13){search.click();return false;}">
			<span class="am-input-group-btn">
				<button class="am-btn am-btn-default" type="button"
					onclick="javascript:queryinpatient(1)" id="search">搜索</button>
			</span>
		</div>
	</div>

	<div class="am-g">
		<div class="am-u-sm-12">
			<form class="am-form">
				<table
					class="am-table am-table-bd am-table-striped admin-content-table">
					<thead>
						<tr>
							<th>病人姓名</th>
							<th>房号</th>
							<th>床位号</th>
							<th>所在科室</th>
							<th>医生姓名</th>
							<th>医嘱</th>
							<th>入院时间</th>
							<th>出院时间</th>
							<th>预交金额</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="pb.beanlist" var="inpatient">
							<tr>
								<td><s:property value="#inpatient.PName" /></td>
								<td><s:property value="#inpatient.hrNo" /></td>
								<td><s:property value="#inpatient.BNo" /></td>
								<td><s:property value="#inpatient.SName" /></td>
								<td><s:property value="#inpatient.DName" /></td>
								<td><s:property value="#inpatient.DAdvice" /></td>
								<td><s:property value="#inpatient.ITime" /></td>
								<td><s:property value="#inpatient.OTime" /></td>
								<td><s:property value="#inpatient.YChange" /></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</form>
			<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
		</div>

	</div>
</div>
<script type="text/javascript">
	$(function() {
		_pageIndexBond(queryinpatient);
	});

	function getsaveinpatient() {
		$.post("inhospital/getsaveinpatient.action", function(data) {
			$("#admin-content").html(data);
		});
	}

	function queryinpatient(pagecode) {
		var condidtions = $("#condidtions").val();
		$.post("inhospital/queryinpatient.action", {
			"pagecode" : pagecode,
			"condidtions" : condidtions
		}, function(data) {
			$("#admin-content").html(data);
		});
	}

	
</script>