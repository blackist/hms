//页面一运行就调用的一个分页函数
$(function() {

	/* 绑定查询函数 */
	_pageIndexBond(queryPatients);
});

//查询所有的患者
function queryPatients(pagecode) {
	
	var queryPtr = $("#queryPtr").val();
	$.post("patient/queryPatient.action", {"pagecode":pagecode,"queryPtr":queryPtr}, function(data) {
		$("#admin-content").html(data);
	});
}

//修改患者信息
function revise(no) {//传入no根据No进行修改
	$.post("patient/revisePatient.action",{"PNo":no},function(data){
		$("#admin-content").html(data);
	});
}

//添加一个患者（已挂过挂号）
function addyemian() {
	$.post("patient/addyemianPatient.action",function(data){
		$("#admin-content").html(data);
	});
}

//删除一个患者（已挂过挂号）
function deletepatient(no){
	$.post("patient/deletePatient.action",{"PNo":no},function(data){
		$("#admin-content").html(data);
	});
}