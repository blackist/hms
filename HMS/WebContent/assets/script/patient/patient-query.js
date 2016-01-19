$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryPatients);
});

function queryPatients(pagecode) {
	$.post("patient/queryPatient.action", {"pagecode":pagecode}, function(data) {
		$("#admin-content").html(data);
	});
}

function revise() {
	$.post("patient/revisePatient.action",function(data){
		$("#admin-content").html(data);
	});
}