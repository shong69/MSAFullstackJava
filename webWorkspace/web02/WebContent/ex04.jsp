<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<table>
	<thead>
		<tr>
		<%for(int x=2;x<10;x++) {%>
			<td><%=x%>단</td>
		<%} %>
		</tr>
	</thead>
<% for(int i=1;i<10;i++) {%>
		<tr>
		<%for(int j=2;j<10;j++){ %>
			<td><%=j%>X<%=i%>=<%=i*j%></td>
		<%} %>
		</tr>
<%} %>	
	</table>
	
<br>
<table>
	<%
		for(int i=1;i<10;i++){
			String msg = "";
			for(int j=2; j<10;j++){
				msg += setTd(func01(j,i));
			}
			
			String result = setTr(msg);
			out.print(result);
		}

	%>
</table>

<%!
String func01(int j,int i){
	return j+"X"+i+"="+(i*j);
}
String setTd(String msg){
	return "<td>"+msg+"</td>";
}
String setTr(String msg){
	return "<tr>"+msg+"</tr>";
}
%>

</body>
</html>