$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryMedilist);
});

function queryMedilist(pagecode) {
	var queryStr = $("#queryStr").val();
	$.post("medilist/queryMedilist.action", {"pagecode":pagecode,"queryStr":queryStr}, function(data) {
		$("#admin-content").html(data);
	});
}

/*删除药单信息*/
function deleteMedilist(id){
	$.post("medilist/deleteMedilist.action", {"medilist.MNo":id}, function(data) {
		$("#admin-content").html(data);
	});
}