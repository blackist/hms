<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="am-cf am-padding">
		<div class="am-fl am-cf">
			<strong class="am-text-primary am-text-lg">住院费用</strong> / <small>住院费用查询</small>
		</div>
	</div>
	<hr/>

	<div class="am-g">
		<div class="am-u-sm-12 am-u-md-6">
			<div class="am-btn-toolbar">
				<div class="am-btn-group am-btn-group-xs">
					<button type="button" class="am-btn am-btn-default" onclick="javascript:getAddpage()">
						<span class="am-icon-plus"></span> 生成住院费用单
					</button>
					<!--  <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
            <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 审核</button>
            <button type="button" class="am-btn am-btn-default"><span class="am-icon-trash-o"></span> 删除</button> -->
				</div>
			</div>
		</div>
		<div class="am-u-sm-12 am-u-md-3">
			<div class="am-input-group am-input-group-sm">
				<input type="text" class="am-form-field" placeholder="病人姓名 / 主治医师" id="conditions" value="${conditions}" onkeypress="if(event.keyCode==13){search.click();return false;}"
				> 
				<span class="am-input-group-btn">
					<button class="am-btn am-btn-default" type="button" onclick="javascript:queryInhospCost(1)" id="search">搜索</button>
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
							<th class="table-id">序号</th>
							<th class="table-title">病人姓名</th>
							<th class="table-type">主治医师</th>
							<th class="table-author am-hide-sm-only">床位号</th>
							<th class="table-date am-hide-sm-only">入院时间</th>
							<th class="table-set">出院时间</th>
							<th>住院费用</th>
							<th>药品费用</th>
							<th>总费用</th>
							<th>操作</th>
						</tr>
					</thead>
					       <tbody>
         	<s:iterator value="pb.beanlist" var="cost" status="status">
             <tr>
           	<th><s:property value="#status.count"/></th>
             	<td><s:property value="#cost.PName"/></td>
             	<td><s:property value="#cost.DName"/></td>
             	<td><s:property value="#cost.BNo"/></td>
             	<td><s:property value="#cost.ITime"/></td>
             	<td><s:property value="#cost.OTime"/></td>
             	<td><s:property value="#cost.YChange"/></td>
             	<td><s:property value="#cost.sumprice"/></td>
             	<td><s:property value="#cost.total"/></td>
           	<td>
           		<button type="button" class="am-btn am-btn-default am-radius am-btn-xs" style="color: red" onclick='javascript:delete_order(<s:property value="#cost.INo"/>)'>删除</button></td>
             </tr>
             </s:iterator>
           </tbody>
				</table>
				<hr />
			</form>
			<%@ include file="/WEB-INF/jsp/common/pagination.jsp"%>
		</div>
	</div>
	<script type="text/javascript">
	$(function(){
		_pageIndexBond(queryInhospCost);
	});
	
	function getAddpage(){
		$("#content-box").load("inhospitalcost/getaddpage.action");
	}
	
	function queryInhospCost(pagecode){
		var conditions = $("#conditions").val();
		$.post("inhospitalcost/findinhosCost.action",{"pagecode":pagecode,"conditions":conditions},function(data){
			$("#content-box").html(data);
		});
	}
	
	function delete_order(ino){
		$("#content-box").load("inhospitalcost/deleteorder.action",{"INo":ino});
	}
	</script>
</body>
</html>