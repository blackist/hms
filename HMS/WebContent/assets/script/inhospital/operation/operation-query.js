$(function() {
	/* 绑定查询函数 */
	_pageIndexBond(queryOper);
});
/*查询用户*/
function queryOper(pagecode) {
	var queryStr = $("#queryStr").val();
	$.post("user/queryOper.action", {"pagecode":pagecode,"queryStr":queryStr}, function(data) {
		$("#admin-content").html(data);
	});
}
/*添加用户*/
function addOper(){
	$("#admin-content").load("operation/addOper.action");
}
/*删除用户*/
function deleteOper(id){
	$.post("operation/deleteOper.action", {"id":id}, function(data) {
		$("#admin-content").html(data);
	});
}
/*更新用户*/
function updateOper(id){
	$.post("operation/updateOper.action", {"id":id}, function(data){
		$("#admin-content").html(data);
	});
}





