$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryinpatient);
});

function queryinpatient(pagecode) {
	var condidtions=$("#condidtions").val();
	$.post("inhospital/queryinpatient.action", {"pagecode":pagecode,"condidtions":condidtions}, function(data) {
		$("#admin-content").html(data);
	});
}