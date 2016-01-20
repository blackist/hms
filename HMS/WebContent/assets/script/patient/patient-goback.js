function goback() {
	
	$.post("patient/queryPatient.action",function(data){
		$("#admin-content").html(data);
	});
}



