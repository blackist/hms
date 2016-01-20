<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

 <div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input type="text" class="am-form-field" id="#condidtions" value="${condidtions}" > <span
				class="am-input-group-btn">
				<button class="am-btn am-btn-default" type="button" id="queryBtn" onclick="queryinpatient(1)">搜索</button>
			</span>
		</div>
</div>
<div class="am-g">
      <div class="am-u-sm-12">
        <table class="am-table am-table-bd am-table-striped admin-content-table">
          <thead>
          <tr>
            <th>病人姓名</th><th>房号</th><th>床位号</th><th>所在科室</th><th>医生姓名</th><th>医嘱</th><th>入院时间</th><th>出院时间</th><th>预交金额</th><th>管理</th>
          </tr>
          </thead>
          <tbody>
          <s:iterator value="pb.beanlist" var="inpatient">
          <tr><td><s:property value="#inpatient.PName"/></td><td><s:property value="#inpatient.hrNo"/></td><td><s:property value="#inpatient.BNo"/></td> 
          <td><s:property value="#inpatient.SName"/></td><td><s:property value="#inpatient.DName"/></td><td><s:property value="#inpatient.DAdvice"/></td>
            <td><s:property value="#inpatient.ITime"/></td><td><s:property value="#inpatient.OTime"/></td><td><s:property value="#inpatient.YChange"/></td> 
            <td>
               <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 新增</button>
                    <button class="am-btn am-btn-default am-btn-xs am-hide-sm-only"><span class="am-icon-copy"></span> 修改</button>
                    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
                  </div>
                </div>
            </td>
          </tr>
          </s:iterator>
          </tbody>
        </table>
      </div>
    </div>
