<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">表单</strong> / <small>form</small>
	</div>
</div>
<div class="am-g">
	<div class="am-u-sm-12 am-u-md-6">
		<div class="am-btn-toolbar">
			<div class="am-btn-group am-btn-group-xs"></div>
		</div>
	</div>
	<div class="am-u-sm-12 am-u-md-3">
		<div class="am-form-group">
			<select data-am-selected="{btnSize: 'sm'}">
				<option value="option1">所有类别</option>
				<option value="option2">IT业界</option>
				<option value="option3">数码产品</option>
				<option value="option3">笔记本电脑</option>
				<option value="option3">平板电脑</option>
				<option value="option3">只能手机</option>
				<option value="option3">超极本</option>
			</select>
		</div>
	</div>
	<div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input type="text" class="am-form-field"> <span
				class="am-input-group-btn">
				<button class="am-btn am-btn-default" type="button">搜索</button>
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
						<th class="table-title">姓名</th>
						<th class="table-type">性别</th>
						<th class="table-author am-hide-sm-only">年龄</th>
						<th class="table-date am-hide-sm-only">病史</th>
						<th class="table-set">操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="checkbox" /></td>
						<td></td>
						<!-- ID -->
						<td>Business management</td>
						<td>default</td>
						<td>测试1号</td>
						<td>2014年9月4日 7:28:47</td>
						<td>
							<div class="am-btn-toolbar">
								<div class="am-btn-group am-btn-group-xs">
									<button onclick="updatePatient()"
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
				</tbody>
			</table>
		</form>
	</div>
</div>
<script src="assets/script/patient/patient-query.js"></script>
