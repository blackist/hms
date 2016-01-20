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
			<strong class="am-text-primary am-text-lg">生成住院费用单</strong> / <small>选择生成费用单的病人</small>
		</div>
	</div>
	<hr/>

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
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="pb.beanlist" var="cost" status="status">
							<tr>
								<th><s:property value="#status.count" /></th>
								<td><s:property value="#cost.PName" /></td>
								<td><s:property value="#cost.DName" /></td>
								<td><s:property value="#cost.BNo" /></td>
								<td><button type="button"
										class="am-btn am-btn-default am-radius am-btn-xs"
										onclick='javascript:addCostlist(<s:property value="#cost.PNo"/>,<s:property value="#cost.BNo"/>,<s:property value="#cost.MNo"/>)'>生成费用单</button></td>
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
		_pageIndexBond(queryPatient);
	});
	
	function queryPatient(pagecode){
		var conditions = $("#conditions").val();
		$.post("inhospitalcost/getaddpage.action",{"pagecode":pagecode},function(data){
			$("#content-box").html(data);
		});
	}
	
	function addCostlist(pno,bno,mno){
		$.post("inhospitalcost/addcost.action",{"PNo":pno,"BNo":bno,"MNo":mno},function(data){
			$("#content-box").html(data);
		});
	}
	</script>
</body>
</html>