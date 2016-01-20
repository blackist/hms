<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者姓名</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm">
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者性别</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm">
					</div>
				</div>

				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者年龄</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm">
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者科室</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<input type="text" class="am-input-sm">
					</div>
				</div>
				
				<div class="am-g am-margin-top-sm">
					<div class="am-u-sm-4 am-u-md-2 am-text-right">患者病史</div>
					<div class="am-u-sm-8 am-u-md-4 am-u-end">
						<textarea rows="4"></textarea>
					</div>
				</div>
			
		</div>

		

		

	</div>
</div>

<div class="am-margin">
	<button onclick = "revise()"type="button" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
	<button onclick = "goback()" type="button" class="am-btn am-btn-primary am-btn-xs">返回</button>
</div>
<script src="assets/script/patient/patient-goback.js"></script>