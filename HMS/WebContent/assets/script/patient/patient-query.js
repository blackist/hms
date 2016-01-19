
function updatePatient() {
	$.post("patient/designPatient.action", function(data) {
		alert(data);
		$("#admin-content").html(data);
	});
}