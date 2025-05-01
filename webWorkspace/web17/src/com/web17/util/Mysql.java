package com.web17.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
	private static Connection conn;
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:33306/xe";
	private static String user="root";
	private static String password="mysql";
	
	public static Connection getConnection() {
		try {
				Class.forName(driver);
			if(conn==null || conn.isClosed())
				conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 확인");
		} catch (SQLException e) {
			e.printStackTrace();
//			System.out.println("접속정보 확인");
		}
		return conn;
	}
}
