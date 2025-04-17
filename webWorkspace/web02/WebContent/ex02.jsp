<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>스크립트릿</h1>
<%
System.out.println("test");
out.print("<h2>test<h2>");

for(int i =0;i<5;i++){
%>
<h3>test</h3>
<%
}
%>
</body>
</html>