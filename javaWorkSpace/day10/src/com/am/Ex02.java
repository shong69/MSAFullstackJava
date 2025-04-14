package com.am;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("시작");
		func01();
		System.out.println("종료");
	}
	
	//return : (생성자 메서드)-메모리 기준으로 호출한 쪽으로 돌아가는 것 
	//break : 중괄호 탈출 -(반복문, switch문)
	//continue : (반복문)continue 이하 내용을 무시하고 처음으로 돌아간다.
	public static void func01() {
		for (int i = 0; i < 10; i++) {
			if(i==5)break;
			System.out.println("i="+i);
		}
		System.out.println("일단 종료");
	}
	public static void func02() {
		for (int i = 0; i < 10; i++) {
			if(i==5)return;
			System.out.println("i="+i);
		}
	}
	public static void func03() {
		for (int i = 0; i < 10; i++) {
			if(i==5)continue;
			System.out.println("i="+i);
		}
	}
}
