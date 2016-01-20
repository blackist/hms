<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="am-u-sm-12 am-u-md-3">
		<div class="am-input-group am-input-group-sm">
			<input type="text" class="am-form-field"> <span
				class="am-input-group-btn">
				<button class="am-btn am-btn-default" type="button">搜索</button>
			</span>
		</div>
</div>
<div class="am-g">
      <div class="am-u-sm-12">
        <table class="am-table am-table-bd am-table-striped admin-content-table">
          <thead>
          <tr>
            <th>床号</th><th>床的状态</th><th>床的类型</th><th>管理</th>
          </tr>
          </thead>
          <tbody>
          <s:iterator value="pb.beanlist" var="bed">
          <tr><td><s:property value="#bed.bno"/></td><td><s:property value="#bed.bst"/></td><td><s:property value="#bed.bty"/></td> 
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
   </body>
</html>