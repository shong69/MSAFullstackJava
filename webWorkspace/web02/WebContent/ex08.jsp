<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>response 내장 객체</h1>
	
	<%
		response.addHeader("me","abcd"); 
	
	/*try( //1)auto close를 이용한 방식
			java.io.OutputStream os = response.getOutputStream();
	){
		os.write("abcd".getBytes());
	}*/
		java.io.OutputStream os = null;
	try{
		os = response.getOutputStream();
		os.write("abcd".getBytes());
	}finally{
		if(os != null) os.close();
	}
	%>
	
	
	<!-- addHeader : 헤더에 항목과 값으로 들어감 -->
</body>
</html>