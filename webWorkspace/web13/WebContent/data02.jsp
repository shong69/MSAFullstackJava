<?xml version="1.0" encoding="UTF-8"?><!-- doc 타입의 선언은 문장 첫 줄에 나와야 한다 -->
<%@ page language="java" contentType="application/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<stus>
	<%@ page import="java.sql.*" %>
	<%
	String sql = "select * from stu01 order by num";
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "scott";
	String password = "tiger";
	try(
			Connection conn = DriverManager.getConnection(url,user,password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			){
		while(rs.next()){
	%>
	<stu>
		<num><%=rs.getInt("num") %></num>
		<name><%=rs.getInt("name")  %></name>
		<kor><%=rs.getInt("kor")  %></kor>
		<eng><%=rs.getInt("math")  %></eng>
		<math><%=rs.getInt("eng")  %></math>
	</stu>
	<% }}%>
</stus>
</stus>