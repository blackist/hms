<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">住院费用单</strong> / <small>新的费用单</small></div>
    </div>
    <hr/>
    
     <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">病人姓名 / PatientName ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.PName"/>
            </div>
       </div>
       <br/>
       <%--  <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">医生姓名 / DoctorName ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.DName"/>
            </div>
       </div> --%>
       <br/>
        <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">床位号 / BedNo ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.BNo"/>
            </div>
       </div>
       <br/>
        <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">入院时间 / InHospitalTime ：</label>
            <div class="am-u-sm-9">
              	<s:date name="costOrder.ITime" format="yyyy-MM-dd"/>
            </div>
       </div>
       <br/>
        <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">出院时间 / OutHospitalTime ：</label>
            <div class="am-u-sm-9">
              	<s:date name="costOrder.OTime" format="yyyy-MM-dd"/>
            </div>
       </div>
       <br/>
        <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">住院费用 / InHospitalCost ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.YChange"/>
            </div>
       </div>
       <br/>
       <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">医药费用 / MedicineCost ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.sumprice"/>
            </div>
       </div>
       <br/>
       <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">总费用 / Total ：</label>
            <div class="am-u-sm-9">
              	<s:property value="costOrder.total"/>
            </div>
       </div>
       <br/>
        <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <button type="button" class="am-btn am-btn-primary" onclick="submitOrder()">确认</button>
            </div>
          </div>
<script type="text/javascript">
function submitOrder(){
	$("#content-box").load("inhospitalcost/findinhosCost.action");
}
</script>
</body>
</html>