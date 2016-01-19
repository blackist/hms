$(function() {
	// user side bar 打开
	$("#bar-patient").attr("class", "am-list am-collapse admin-sidebar-sub am-in");
	
	$.post("patient/queryPatient.action",function(data){
		$("#admin-content").html(data);
	});
	
});

