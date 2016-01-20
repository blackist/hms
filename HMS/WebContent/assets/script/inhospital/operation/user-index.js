$(function() {
	// user side bar 打开
	$("#bar-user").attr("class", "am-list am-collapse admin-sidebar-sub am-in");
	
	$.post("user/queryUsers.action",function(data){
		$("#admin-content").html(data);
	});
});