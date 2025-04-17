<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800" align="center">
		<tr>
			<td colspan="6">
				<img src="imgs/img.png">
			</td>
		</tr>
		<tr>
			<td width="100" bgcolor="gray"></td>
			<td width="150" bgcolor="gray" align="center"><a href="index.jsp">HOME</a></td>
			<td width="150" bgcolor="gray" align="center"><a href="intro.jsp">INTRO</a></td>
			<td width="150" bgcolor="gray" align="center"><a href="list.jsp">BBS</a></td>
			<td width="150" bgcolor="gray" align="center"><a href="guest.jsp">GUEST</a></td>
			<td width="100" bgcolor="gray" ></td>
		</tr>
		<tr>
			<td colspan="6" height="400" valign ="top">
				<h1>게시글</h1>
				
				<table border="1" align="center" width="80%">
					<tr>
						<td width="50">글번호</td>
						<td>제목</td>
						<td width="80">글쓴이</td>
						<td width="80">날짜</td>
					</tr>
					<%@ page import= "java.sql.*, java.sql.DriverManager" %>

					<% 
					String driver ="oracle.jdbc.driver.OracleDriver";
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "scott";
					String password = "tiger";
					Connection conn = null;
					Statement stmt = null;
					ResultSet rs = null;
					String sql = "select * from bbs01 order by num desc";
					try{
						Class.forName(driver);
						conn=DriverManager.getConnection(url,user,password);
						stmt = conn.createStatement();
						rs=stmt.executeQuery(sql);
					
						while(rs.next()){
					%>
					<tr>
						<td><%= rs.getInt(1) %></td>
						<td><%=rs.getString(2) %></td>
						<td><%=rs.getString(4) %></td>
						<td><%=rs.getDate(5) %></td>
					</tr>	
					<%
						}
					}finally{
						if(rs != null) rs.close();
						if(stmt != null) stmt.close();
						if(conn != null) conn.close();
					}
					%>


				</table>
				
			</td>
		</tr>
		<tr>
			<td colspan="6" align="center">
				<hr>
				Â© 2025 GitHub, Inc.Footer 
		</tr>
	</table>
</body>
</html>