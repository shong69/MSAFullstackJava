<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<img alt="" src="http://www.kibwa.org/data/skin/default/images/da_image/hd_logo.png">
<jsp:useBean scope="session" id="login" class="com.web08.model.Bbs07Bean"></jsp:useBean>
<a href="./">[HOME]</a>
<a href="./bbs/">[BBS]</a>
<a href="./login/">[login]</a>
<%=login.getLvl() %>
<hr>
<h1>index page</h1>
</body>
</html>