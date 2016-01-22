<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="am-cf am-padding">
	<div class="am-fl am-cf">
		<strong class="am-text-primary am-text-lg">首页</strong> / <small>医院管理</small>
	</div>
</div>

<div class="am-g">
	<div class="am-u-sm-12 am-u-md-6">
		<div class="am-btn-toolbar">
			<div class="am-btn-group am-btn-group-xs">
				<button type="button" class="am-btn am-btn-default"
					onclick="javascript:getaddbed(1)">
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
					onclick="javascript:queryBed(1)" id="search">搜索</button>
			</span>
		</div>
	</div>
</div>
<div class="am-g">
	<div class="am-u-sm-12">
		<form class="am-form">
			<table
				class="am-table am-table-bd am-table-striped admin-content-table">
				<thead>
					<tr>
						<th>床号</th>
						<th>床的状态</th>
						<th>床的类型</th>
						<th>管理</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="pb.beanlist" var="bed">
						<tr>
							<td><s:property value="#bed.bno" /></td>
							<td><s:property value="#bed.bst" /></td>
							<td><s:property value="#bed.bty" /></td>
							<td>
								<div class="am-btn-toolbar">
									<div class="am-btn-group am-btn-group-xs">

										<button
											class="am-btn am-btn-default am-btn-xs am-hide-sm-only"
											onclick="updatebed('<s:property value='#bed.bno'/>')"
											type="button">
											<span class="am-icon-copy"></span> 修改
										</button>
										<button
											class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"
											onclick="deletebed('<s:property value='#bed.bno'/>')" type="button">
											<span class="am-icon-trash-o"></span> 删除
										</button>
									</div>
								</div>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</form>
		<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		_pageIndexBond(queryBed);
	});
	
	 function getaddbed(){
		 $.post("hospital/getaddbed.action",function(data){
				$("#admin-content").html(data);
			});
	 }
	 function deletebed(id){
		$.post("hospital/deletebed.action", {"bed.BNo":id}, function(data) {
			$("#admin-content").html(data);
		});
	 }
	 function updatebed(bno){
		$.post("hospital/updatebed.action", {"bed.BNo":bno}, function(data) {
			$("#admin-content").html(data);
		});
	}
	function queryBed(pagecode){
		var condidtions = $("#condidtions").val();
		$.post("hospital/queryBed.action", function(data){
			$("#admin-content").html(data);
		});
	}
	</script>
