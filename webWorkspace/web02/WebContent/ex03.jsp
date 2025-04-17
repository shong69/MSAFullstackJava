<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>선언부</h1>
<%!
int su = 1111;
void func01(int a){
	System.out.println("a="+a);
}
%>

<%
func01(su);
%>

31154
11345
31254
</body>
</html>