package com.pm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Ex03 {
	
	static int id = 0;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//학생 성적 관리 프로그램 (ver 0.20.0)
		//1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료 >
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Properties props = new Properties();
		props.setProperty("user", "scott");
		props.setProperty("password", "tiger");
//		String sql="create table score(ID NUMBER, LANG NUMBER, ENG NUMBER, MATH NUMBER, AVERAGE NUMBER(5,2), TOTAL NUMBER)";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,props);
			stmt = conn.createStatement();
//			stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("학생 성적 관리 프로그램 (ver 0.20.0)");
		boolean on = true;
		while(on) {
			System.out.print("1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료 >");
			int menu = sc.nextInt();
			switch (menu) {
			case 0:
				on = false;
				break;
			case 1:
				try {
					System.out.println("학번\t|국어\t|영어\t|수학\t|평균\t|총점");
					rs = stmt.executeQuery("SELECT ID, LANG, ENG, MATH, AVERAGE, TOTAL FROM SCORE");
					while(rs.next()) {
						System.out.println("-------------------------------------------------");
						System.out.printf("%d\t|%d\t|%d\t|%d\t|%.2f\t|%d\t\n",
								rs.getInt("ID"),rs.getInt("LANG"),rs.getInt("ENG"),rs.getInt("MATH"),rs.getDouble("AVERAGE"),rs.getInt("TOTAL"));
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case 2:
				id++;
				int total = 0;
				System.out.print("국어> ");
				int lang = sc.nextInt();
				total += lang;
				System.out.print("영어> ");
				int eng = sc.nextInt();
				total += eng;
				System.out.print("수학> ");
				int math = sc.nextInt();
				total += math;
				try {
					stmt.execute("insert into score values("+ id +","+lang+","+eng+","+math+","+total/3.0+","+total+")");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				if(id<=0) {
					System.out.println("데이터가 존재하지 않습니다."); break;
				}
				System.out.print("수정할 학번을 입력해 주세요> ");
				int no = sc.nextInt();
				//학번 검색하기
				try {
					rs = stmt.executeQuery("SELECT ID FROM SCORE WHERE ID ="+no);
					if(!rs.next()) {
						System.out.println("존재하지 않는 번호입니다.");
						break;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				total = 0;
				System.out.print("국어> ");
				lang = sc.nextInt();
				total += lang;
				System.out.print("영어> ");
				eng = sc.nextInt();
				total += eng;
				System.out.print("수학> ");
				math = sc.nextInt();
				total += math;
				try {
					stmt.execute("update score set LANG="+lang+", ENG="+eng+", MATH="+math+", AVERAGE="+total/3.0+",TOTAL="+total+"where ID = "+no);
					System.out.println("변경이 완료되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.print("삭제할 학번을 입력해 주세요> ");
				no = sc.nextInt();
				//학번 검색하기
				try {
					rs = stmt.executeQuery("SELECT ID FROM SCORE WHERE ID ="+no);
					if(!rs.next()) {
						System.out.println("존재하지 않는 번호입니다.");
						break;
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				try {
					stmt.execute("DELETE FROM SCORE WHERE ID="+no);
					System.out.println("삭제되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
		}
	}

}	
