package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		String msg1 ="java";
		String msg2 = new String("java");
		StringBuffer sb1 = new StringBuffer("java");
		StringBuilder sb2 = new StringBuilder("java");
		
//		StringBuffer sb3 = "java"; //오류 발생 -> 문자열 클래스이지만 객체 생성 후 사용해야한다.
		System.out.println(sb1+"web"); //javaweb
//		StringBuffer sb3 = sb1 + "web"; 이런 방식으로 버퍼에 문자열 더하는 것이 아님 
		//(문자열을 더하는 순간 문자열이 되어야 하기 때문)
		StringBuffer sb3 = sb1.append("Web");
		System.out.println(sb3); //javaweb
		
		StringBuffer sb4 = sb3.append("Spring");
		System.out.println(sb1); //javaWebSpring
		System.out.println(sb1.append("DB")); //javaWebSpringDB
		System.out.println(sb1.append("Database")); //javaWebSpringDBDatabase
		
		
		System.out.println("시작");
		for (int i = 0; i < 1000; i++) {
			sb1.append(i);
		}
		
		System.out.println("끝");
		System.out.println(sb1);
	}
}
