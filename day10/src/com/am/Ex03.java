package com.am;

public class Ex03 {
	public static void main(String[] args) {
		int a = 111;
		//autoBoxing
		Integer b = 222; //클래스 타입 -wrapper 클래스
//		Integer c = new Integer(); -오류 발생 -> 기본생성자가 없다
		Integer c = new Integer(333);
		//unBoxing
		Integer d = new Integer("+444"); //문자로 출력해준다. 문자를 적을 수는 없다.
		int e = new Integer("-5555");
		System.out.println(c.intValue() + 1); ///334 출력
		System.out.println(c+1); ///334 출력
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	}
}
