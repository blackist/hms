<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script src="assets/js/amazeui.min.js"></script>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>住院管理</small>
		/<small>添加病人信息</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		<li class="am-active"><a href="#userform">住院信息</a></li>
	</ul>
	<div class="am-tabs-bd">

		<div class="am-tab-panel am-fade am-in am-active" id="userform">
			<form class="am-form" id="inform">
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">病人姓名</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select name="Inpatient.PNo" id="PNo">
							<option value="病人">姓名</option>
							<s:iterator value="palist">
								<option value="<s:property   value="PNo"/>">
									<s:property value="PName" />
								</option>

							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">房号</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="Inpatient.hrNo"
							id="hrNo" required="required">
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">病床编号</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select name="Inpatient.BNo" id="BNo">
							<option value="床号">床号</option>
							<s:iterator value="list">
								<option value="<s:property   value="BNo"/>">
									<s:property value="BNo" />
								</option>

							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">科室</div>
					<div class="am-u-sm-8 am-u-md-4">

						<select name="Inpatient.PSno" id="PSno">
							<option value="">科室号</option>
							<s:iterator value="slist">
								<option value="<s:property   value="SNo"/>">
									<s:property value="SName" />
								</option>

							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">医生姓名</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select name="Inpatient.DName" id="DName">
							<option value="医生">姓名</option>
							<s:iterator value="doclist">
								<option value="<s:property   value="DName"/>">
									<s:property value="DName" />
								</option>

							</s:iterator>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">医嘱</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
						<textarea rows="" cols="" name="Inpatient.DAdvice" id="DAdvice"></textarea>
					</div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">入院时间</div>
					<div class="am-u-sm-8 am-u-md-4">
						<div class="am-form-group am-form-icon">
							<i class="am-icon-calendar"></i> <input type="text"
								class="am-form-field" data-am-datepicker readonly
								name="Inpatient.ITime" id="ITime">
						</div>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">出院时间</div>
					<div class="am-u-sm-8 am-u-md-4">
						<div class="am-form-group am-form-icon">
							<i class="am-icon-calendar"></i> <input type="text"
								class="am-form-field" data-am-datepicker readonly
								name="Inpatient.OTime" id="OTime">
						</div>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">预付金额</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="Inpatient.YChange"
							id="YChange" required="required">
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="addinpSubmit()">提交保存</button>
</div>
<script type="text/javascript">
	function addinpSubmit() {
		// 参数校验
		var PNo = $("#PNo").val();
		var hrNo = $("#hrNo").val();
		var BNo = $("#BNo").val();
		var PSno = $("#PSno").val();
		var DName = $("#DName").val();
		var ITime = $("#ITime").val();
		var OTime = $("#OTime").val();
		var YChange = $("#YChange").val();
		if (PNo != null && PNo != "" && hrNo != null && hrNo != ""
				&& PSno != null && PSno != "" && YChange != null
				&& YChange != "") {
			// 获取表单参数
			var inform = $("#inform").serialize();
			// 提交后台
			$.post("inhospital/addinpatientSubmit.action", inform, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>
