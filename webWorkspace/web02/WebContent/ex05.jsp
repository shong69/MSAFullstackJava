<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>내장 객체</h1>

<%
String addr = request.getRemoteAddr();
out.print("<p>clinet ip : "+addr+"</p>");


int port = request.getRemotePort();
out.print("<p>client port : "+port+"</p>");

String addr2 = request.getServerName();
out.print("<p>server ip : "+addr+"</p>");


int port2 = request.getServerPort();
out.print("<p>server port : "+port+"</p>");


//요청 종류 get or post
String method = request.getMethod();
out.print(method +"<br>");

//요청 주소 /web02
String path = request.getContextPath();
out.print(path + "<br>");

//요청 주소2  /web02/ex05.jsp
String url = request.getRequestURI();
out.print(url + "<br>");

//사용자의 요청을 알려줌 null
String query = request.getQueryString();
out.print(query + "<br>");

%>
</body>
</html>