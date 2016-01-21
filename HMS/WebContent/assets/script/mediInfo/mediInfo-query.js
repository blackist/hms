$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryMediInfo);
});
//药品信息查询
function queryMediInfo(pagecode) {
	var queryStr = $("#queryStr").val();
	$.post("mediInfo/queryMediInfo.action", {"pagecode":pagecode,"queryStr":queryStr}, function(data) {
		$("#admin-content").html(data);
	});
}
/*添加药品信息*/
function addMediInfo(){
	$("#admin-content").load("mediInfo/addMediInfo.action");
}
/*删除药品信息*/
function deleteMediInfo(id){
	$.post("mediInfo/deleteMediInfo.action", {"mediinfo.MNo":id}, function(data) {
		$("#admin-content").html(data);
	});
}
/*更新药品信息*/
function updateMediInfo(id){
	$.post("mediInfo/updateMediInfo.action", {"mediinfo.MNo":id}, function(data){
		$("#admin-content").html(data);
	});
}





