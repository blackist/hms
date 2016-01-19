$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryMediInfo);
});

function queryMediInfo(pagecode) {
	$.post("mediInfo/queryMediInfo.action", {"pagecode":pagecode}, function(data) {
		$("#admin-content").html(data);
	});
}