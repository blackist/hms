<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>医院管理</small>
		/ <small>病床添加</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		<li class="am-active"><a href="#userform">病床基本信息</a></li>
	</ul>
	<div class="am-tabs-bd">
		<div class="am-tab-panel am-fade am-in am-active" id="userform">
			<form class="am-form" id="userForm">
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">病床编号</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="Bed.BNo" id="BNo"
							required="required">
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
				</div>
				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">病床状态</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select name="Bed.BSta" id="BSta">
							<option value="有">有</option>

							<option value="无">无</option>


						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">病床类型</div>
					<div class="am-u-sm-8 am-u-md-4">
						<select name="Bed.BTy" id="BTy">
							<option value="单人间">单人间</option>
							<option value="双人间">双人间</option>
							<option value="四人间">四人间</option>
							<option value="六人间">六人间</option>
						</select>
					</div>
					<div class="am-hide-sm-only am-u-md-6">*必填</div>
				</div>
			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="addbed()">提交保存</button>

</div>
<script type="text/javascript">
	function addbed() {
		// 参数校验
		var BNo = $("#BNo").val();	
		if (BNo != null && BNo != "" ) {
			var userForm = $("#userForm").serialize();
			$.post("hospital/addbedSubmit.action", userForm, function(data) {
				$("#admin-content").html(data);
			});
		}
	}
</script>
