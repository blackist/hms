$(function() {
	/* 绑定查询函数 */
	_pageIndexBond(queryUsers);
});
/*查询用户*/
function queryUsers(pagecode) {
	var queryPtr = $("#queryPtr").val();
	$.post("user/queryUsers.action", {"pagecode":pagecode,"queryPtr":queryPtr}, function(data) {
		$("#admin-content").html(data);
	});
}
/*添加用户*/
function addUser(){
	$("#admin-content").load("user/addUser.action");
}
/*删除用户*/
function deleteUser(id){
	$.post("user/deleteUser.action", {"userId":id}, function(data) {
		$("#admin-content").html(data);
	});
}
/*更新用户*/
function updateUser(id){
	$.post("user/updateUser.action", {"userId":id}, function(data){
		$("#admin-content").html(data);
	});
}





