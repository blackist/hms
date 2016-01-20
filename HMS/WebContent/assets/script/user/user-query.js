$(function() {
	/* 绑定查询函数 */
	_pageIndexBond(queryUsers);
});

function queryUsers(pagecode) {
	var queryPtr = $("#queryPtr").val();
	$.post("user/queryUsers.action", {"pagecode":pagecode,"queryPtr":queryPtr}, function(data) {
		$("#admin-content").html(data);
	});
}

function addUser(){
	$("#admin-content").load("user/addUser.action");
}

function deleteUser(id){
	$.post("user/deleteUser.action", {"userId":id}, function(data) {
		alert(data);
		$("#admin-content").html(data);
	});
}





