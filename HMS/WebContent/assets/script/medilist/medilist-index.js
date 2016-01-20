$(function() {
	$("#bar-medilist").attr("class", "am-list am-collapse admin-sidebar-sub am-in");
		
	$.post("medilist/queryMedilist.action",function(data){
		$("#admin-content").html(data);
	});
});