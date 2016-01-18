<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <form action="ry/logAction!Login" method="post">
		请输入用户名：<input name="userBean.name"><br/>
		请输入密码：   <input name="userBean.pwd"><br/>
		<input type="submit"   value="登陆">
	</form>
</body>
</html>