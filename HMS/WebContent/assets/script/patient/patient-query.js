$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryPatients);
});

function queryPatients(pagecode) {
	
	var queryPtr = $("#queryPtr").val();
	$.post("patient/queryPatient.action", {"pagecode":pagecode,"queryPtr":queryPtr}, function(data) {
		$("#admin-content").html(data);
	});
}

function revise() {
	$.post("patient/revisePatient.action",function(data){
		$("#admin-content").html(data);
	});
}

function addyemian() {
	$.post("patient/addyemianPatient.action",function(data){
		$("#admin-content").html(data);
	});
}