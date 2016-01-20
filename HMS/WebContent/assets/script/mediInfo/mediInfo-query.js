$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryMediInfo);
});

function queryMediInfo(pagecode) {
	var queryStr = $("#queryStr").val();
	$.post("mediInfo/queryMediInfo.action", {"pagecode":pagecode,"queryStr":queryStr}, function(data) {
		$("#admin-content").html(data);
	});
}