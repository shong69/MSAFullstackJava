package com.pm;

public class Ex01 {
	public static void main(String[] args) {
//		System.out.println(); //System : 클래스, out : 객체 참조변수, println : 메서드
//		java.io.PrintStream myOut = System.out; //out의 객체는 io.PrintStream의 객체
//		myOut.println(); //PrintStream의 메서드
		
		char[] arr1 = new char[]{'a','b','c'};
		char[] arr2 = new char[3];
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
//		System.console().printf("aaaa", new Object[] {});  //a \nb \nc 출력
		//sts 내에 콘솔이 진짜 콘솔이 아니라 cmd 콘솔에서 실행 시 확인 가능
		
		
		long beforeTime = System.currentTimeMillis();
		long afterTime = System.currentTimeMillis();
		System.out.println(afterTime - beforeTime);
		
		long beforeNano = System.nanoTime();
		// 코드 수행..
		long afterNano = System.nanoTime();
		System.out.println(afterNano - beforeNano);
		
		
		System.out.println("시작");
		//System.exit(0); //매개변수 값은 아무 상관 없다.
		
		
		System.gc(); //가비지컬렉션 작동
		
		System.out.println("a"+System.lineSeparator()+"b");
		
		
		System.out.println(System.getenv());//환경변수를 비롯한 시스템 환경 정보를 알려줌
	}
}
