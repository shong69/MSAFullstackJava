package com.pm;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	public static void main(String[] args) {
		OracleDriver driver = new OracleDriver(); //오라클 드라이버 추가
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
//		java.sql.ResultSet rs = null;
		
		//오라클 데이터베이스 접속 문자열 url (host, port(리스너 포트 번호), sid(교육용은 xe임))
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
//		url = "jdbc:mysql://host1:33060/sakila"; //mysql의 url 형태
		//사용자 이름과 암호 Properties에 담아서 Connection에 props로 넘기기
		java.util.Properties props = new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");
		
		try {
			conn = java.sql.DriverManager.getConnection(url,props); //db정보 받아서 연결하기
			stmt = conn.createStatement(); 
			//쿼리 질의하기
			String sql = "update dept set loc ='부산' where deptno = 60";
			stmt.executeQuery(sql);
			System.out.println("입력 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
//				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn!= null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
