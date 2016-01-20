<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">表单</strong> / <small>form</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		
		
		<li>病人信息修改</li>
	</ul>
	
	<div class="am-tabs-bd">
		<div class="am-tab-panel am-fade am-in am-active" id="tab1">
		<form class="am-form" id="patientForm">
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者姓名</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm"
						 value='<s:property value='patient.PName'/>'  name="PName" id="PName"
						 required="required" >
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者性别</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm"
						value='<s:property value='patient.PSex'/>'
						name="PSex" id="PSex" required="required">
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者年龄</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm"
						value='<s:property value='patient.PAge'/>'
						name="PAge" id="PAge" required="required">请输入1-100的数字
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者科室</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm"
						value='<s:property value='patient.PRoom'/>'
						name="PRoom" id="PRoom" required="required">
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者病史</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm"
						value='<s:property value='patient.PHistory'/>' size = "50"
						name="PHistory" id="PHistory" required="required">
					</div>
				</div>
				<input type="hidden" value='<s:property value='patient.PNo'/>'
				name="PNo" id="PNo" required="required">
			</form>
		</div>

		

		

	</div>
</div>

<div class="am-margin">
	<button onclick = "updatePatient()" type="button" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
	<button onclick = "goback()" type="button" class="am-btn am-btn-primary am-btn-xs">返回</button>
</div>
<script src="assets/script/patient/patient-goback.js"></script>
<script type="text/javascript">
	function updatePatient() {
		// 参数校验
		var pNo = $("#PNo").val();
		var pName = $("#PName").val();
		var pSex = $("#PSex").val();
		var pAge = $("#PAge").val();
		var pRoom = $("#PRoom").val();
		var pHistory = $("#PHistory").val();
		if (pName != null && pName != "" 
				&& pSex != null&& pSex != "" 
				 && pAge != null && pAge != ""
					&& pRoom != null && pRoom != ""
						&& pHistory != null && pHistory != "") {
			var patientForm = $("#patientForm").serialize();
			$.post("patient/updatePatient.action", patientForm, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>