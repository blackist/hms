<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">表单</strong> / <small>form</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">


		<li>挂号</li>
	</ul>

	<div class="am-tabs-bd">
		<div class="am-tab-panel am-fade am-in am-active" >
			<form class="am-form" id="patientForm" method="POST">
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者姓名</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm" name="PName" id="PName">
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者性别</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm" name="PSex" id="PSex">
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者年龄</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm" name="PAge" id="PAge">请输入1-100的数字
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者科室</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm" name="PRoom" id="PRoom">
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者病史</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm" name="PHistory"
							id="PHistory">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button onclick="addPatientSubmit()" type="button"
		class="am-btn am-btn-primary am-btn-xs">提交保存</button>
	<button onclick="goback()" type="button"
		class="am-btn am-btn-primary am-btn-xs">返回</button>
</div>
<script src="assets/script/patient/patient-goback.js"></script>

<script type="text/javascript">
	function addPatientSubmit() {
		// 参数校验
		var PName = $("#PName").val();
		var PSex = $("#PSex").val();
		var PAge = $("#PAge").val();
		var PHistory = $("#PHistory").val();
		var PRoom = $("#PRoom").val();
		if (PName != null && PName != "" && PSex != null && PSex != ""
				&& PAge != null && PAge != "" && PHistory != ""
				&& PHistory != null && PRoom != "" && PRoom != null) {
			var patientForm = $("#patientForm").serialize();
			alert(patientForm);
			$.post("patient/addPatient.action", patientForm, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>