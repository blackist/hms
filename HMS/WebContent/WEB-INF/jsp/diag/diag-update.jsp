<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>处方管理</small>
		/ <small>处方编辑</small>
	</div>
</div>

<div class="am-tabs am-margin" data-am-tabs>
	<ul class="am-tabs-nav am-nav am-nav-tabs">
		<li class="am-active"><a href="#userform">用户基本信息</a></li>
	</ul>
	<div class="am-tabs-bd">

		<div class="am-tab-panel am-fade am-in am-active" id="userform">
			<form class="am-form" id="userForm">


				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">药品名称</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MName" id="MName"
							required="required" value='<s:property value='mediInfo.MName'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">药品类型</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MType" id="MType"
							required="required" value='<s:property value='mediInfo.MType'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">药品价格</div>
					<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm" name="MPrice" id="MPrice"
							required="required" value='<s:property value='mediInfo.MPrice'/>'>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<div class="am-g am-margin-top">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">时间：</div>
					<div class="am-u-sm-8 am-u-md-4">
						<div class="am-form-group am-form-icon">
							<i class="am-icon-calendar"></i> <input type="text"
								class="am-form-field" data-am-datepicker readonly
								name="diagnosticInfo.DDate" id="DDate">
						</div>
					</div>
					<div class="am-hide-sm-only am-u-md-6"></div>
				</div>

				<input type="hidden" name="MNo"
					value='<s:property value='mediInfo.MNo'/>'>

			</form>
		</div>
	</div>
</div>

<div class="am-margin">
	<button type="button" class="am-btn am-btn-primary am-btn-xs"
		onclick="updateUserSubmit()">打印</button>
</div>

<script src="assets/js/amazeui.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#bar-patient").attr("class",
				"am-list am-collapse admin-sidebar-sub am-in");
	});
</script>
