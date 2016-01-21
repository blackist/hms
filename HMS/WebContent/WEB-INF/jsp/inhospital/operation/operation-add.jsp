<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>手术管理</small>
		/ <small>添加手术</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		<li class="am-active"><a href="javascript:;">手术信息</a></li>
	</ul>
	<div class="am-tabs-bd">
		<div class="am-tab-panel am-fade am-in am-active" id="userform">
			<form class="am-form" id="operForm">
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者信息</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select data-am-selected="{btnSize: 'sm'}" class="am-input-sm"
							name="PNo" id="PNo" required="required">
							<option value="">选择患者</option>
							<s:iterator value="patientList" var="patient">
								<option value="<s:property value='#patient.PNo'/>">
									<s:property value="#patient.PName" />
								</option>
							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">主治医生</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select data-am-selected="{btnSize: 'sm'}" class="am-input-sm"
							name="DNo" id="DNo" required="required">
							<option value="">选择医生</option>
							<s:iterator value="doctorList" var="doctor">
								<option value="<s:property value='#doctor.DNo'/>">
									<s:property value="#doctor.DName" />
								</option>
							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">手术类型</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="operType"
							id="operType" required="required">
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">手术时间</div>
					<div class="am-u-sm-8 am-u-md-4">
						<div class="am-form-group am-form-icon">
							<i class="am-icon-calendar"></i> <input type="text"
								class="am-form-field" data-am-datepicker readonly
								name="operTime" id="operTime">
						</div>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">手术描述</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
						<textarea rows="" cols="" name="operDesc"></textarea>
					</div>
				</div>

			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="addOperSubmit()">提交保存</button>
	<button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
</div>

<script src="assets/js/amazeui.js"></script>

<script type="text/javascript">
	function addOperSubmit() {
		// 参数校验
		var PNo = $("#PNo").val();
		var DNo = $("#DNo").val();
		var operType = $("#operType").val();
		var operTime = $("#operTime").val();
		if (PNo != null && PNo != "" && DNo != null && DNo != ""
				&& operType != null && operType != "" && operTime != null
				&& operTime != "") {
			// 获取表单参数
			var operForm = $("#operForm").serialize();
			// 提交后台
			$.post("operation/addOperSubmit.action", operForm, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>
