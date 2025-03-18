package com.am;

/**
 * 클래스의 구성요소
 * 
 * 1. 메서드
 * 2. 필드
 * 3. 생성자
 *	모든 클래스는 생성자가 존재함
 *  이름이 반드시 클래스명이다.
 *  - 오버로드를 통해 다중 생성자가 가능하다
 *  public 클래스명(매개변수..){코드}
 */
public class Ex01 {
	//전역 변수 
	public final static int b = 2222; //final 변수 -> 수정 불가
	public final static int a = 2222; 
	public final int c;
	
	
	public Ex01() { //기본 생성자
		c=4444; // 기본생성자로 생성한 객체의 경우 c의 값은 상수인 4444가 된다.
	}
	
	public Ex01(int a) { //매개변수 생성자
		c=a; //매개변수 생성자로 생성한 객체의 경우 c의 값이 상수인 2222가 된다
		return;
	}
	public static void main(String[] args) {
		//지역 변수 - final : 상수형 변수를 생성
		final int a;
		a = 1111;
		
		System.out.println("a="+a); //지역변수 a
		System.out.println("com.am.Ex01.a = "+ com.am.Ex01.a); //전역변수 a 
		//-> 해당 변수명이 지역변수로도 존재하지 않고 루트 경로가 안적혀있으면 기계어로 변경되며 컴파일러가 붙여줌
		//모든 변수는 컴파일 과정에서 경로를 다 붙여준다.
		
		//final 예약어
		//a = 2222;  final 변수는 값의 변경이 불가능하다.
		System.out.println("a = "+a);
		//func02(final int c)에 매개변수로 3333, 4444를 넣을 수 있다- 매개변수 넣는건데 당연
		func02(3333); func02(4444);

	}
	
	public static void func01() {
		//b++;
		//a++; -> 지역 변수 a는 선언한 메서드 밖에서 수정할 수 없다.
	}	
	public static void func02(final int c) {
		//c++; final 변수 수정 불가
		System.out.println("c= "+c);
	}
	
	
}
