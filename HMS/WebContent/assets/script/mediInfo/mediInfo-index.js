$(function() {
	$("#bar-mediInfo").attr("class", "am-list am-collapse admin-sidebar-sub am-in");
	$.post("mediInfo/queryMediInfo.action",function(data){
		$("#admin-content").html(data);
	});
});