<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>药库管理</small>
		/ <small>药品信息编辑</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		<li class="am-active"><a href="#mediInfoform">药品基本信息</a></li>
	</ul>
	<div class="am-tabs-bd">

		<div class="am-tab-panel am-fade am-in am-active">
			<form class="am-form" id="mediInfoForm">
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">药品名</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MName" id="MName"
							required="required" value='<s:property value='mediinfo.MName'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">药品类型</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MType" id="MType"
							required="required" value='<s:property value='mediinfo.MType'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">成本价</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MCostprice"
							id="MCostprice" required="required"
							value='<s:property value='mediinfo.MCostprice'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">零售价</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MPrice" id="MPrice"
							required="required" value='<s:property value='mediinfo.MPrice'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">数量</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MCount" id="MCount"
							required="required" value='<s:property value='mediinfo.MCount'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">产地</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MProduce"
							id="MProduce" required="required"
							value='<s:property value='mediinfo.MProduce'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">生产批号</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MLotno" id="MLotno"
							required="required" value='<s:property value='mediinfo.MLotno'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

				<input type="hidden" name="MNo"
					value='<s:property value='mediinfo.MNo'/>'>
			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="updateMediInfoSubmit()">提交保存</button>
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="mediInfo/indexMediInfo.action">放弃保存</button>
</div>

<script type="text/javascript">
	function updateMediInfoSubmit() {
		// 参数校验
		var MName = $("#MName").val();
		var MType = $("#MType").val();
		var MCostprice = $("#MCostprice").val();
		var MPrice = $("#MPrice").val();
		var MCount = $("#MCount").val();
		var MProduce = $("#MProduce").val();
		var MLotno = $("#MLotno").val();
		if (MName != null && MName != ""
				&& MType != null && MType != "" && MCostprice != null
				&& MCostprice != "" && MPrice != null && MPrice != ""
				&& MCount != null && MCount != "" && MProduce != null
				&& MProduce != "" && MLotno != null && MLotno != "") {
			var mediInfoForm = $("#mediInfoForm").serialize();
			$.post("mediInfo/updateMediInfoSubmit.action", mediInfoForm,
					function(data) {
						$("#admin-content").html(data);
					});
		}
	}
</script>
<script src="assets/script/sidebar/bar-mediInfo.js"></script>