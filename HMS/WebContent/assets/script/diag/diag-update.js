
function updateDiag(id){
	$.post("diag/updateDiag.action", {"mediInfo.MNo":id}, function(data){
		$("#admin-content").html(data);
	});
}