package com.pm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex02 {
	public static void main(String[] args) {
		String sql = "insert into dept values(70, '부서4', '서울')";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Properties props = new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");
//		OracleDriver driver = new OracleDriver(); 
//		클래스에 대한 정보만을 사용하기 때문에 25번 라인처럼 사용 가능
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 오라클 드라이버의 클래스 정보만 사용
			conn = DriverManager.getConnection(url,props);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {//boolean 결과를 리턴하며 다음 결과를 가리킴
				String deptNo = rs.getString("DEPTNO"); //컬럼명을 지정해 값을 가져온다
				String dName = rs.getString("DNAME");
				String loc = rs.getString("LOC");
				
				System.out.println(deptNo+" "+ dName + " "+ loc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(rs != null) rs.close();
					if(stmt != null)stmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
				
		
	}
}
