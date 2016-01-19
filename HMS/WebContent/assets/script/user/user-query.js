$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryUsers);
});

function queryUsers(pagecode) {
	$.post("user/queryUsers.action", {"pagecode":pagecode}, function(data) {
		$("#admin-content").html(data);
	});
}