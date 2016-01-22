<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<li class="admin-parent"><a class="am-cf"
	data-am-collapse="{target: '#bar-patient'}"><span
		class="am-icon-file"></span> 病患管理 <span
		class="am-icon-angle-right am-fr am-margin-right"></span></a>
	<ul class="am-list am-collapse admin-sidebar-sub" id="bar-patient">
		<li><a href="patient/indexPatient.action" class="am-cf"><span
				class="am-icon-check"></span>查询患者</a></li>
		<li><a href="diag/addDiag.action"><span
				class="am-icon-puzzle-piece"></span> 病人诊断</a></li>
		<li><a href="diag/queryDiag.action"><span class="am-icon-th"></span>
				诊断统计</a></li>
	</ul></li>