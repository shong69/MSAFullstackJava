package com.am;

public class Ex02 {
	//정보은닉
	public static void main(String[] args) {
		com.am.Ex01.func01();
		com.am.Ex01.func02();
		//com.am.Ex01.func03();//private은 접근 불가
		System.out.println(com.am.Ex01.su1);
		System.out.println(com.am.Ex01.su2);
		//System.out.println(com.am.Ex01.su3);//private은 접근 불가
	}
}
