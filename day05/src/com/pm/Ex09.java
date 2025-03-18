package com.pm;

//클래스의 구성요소
//1. 메서드
//   : 객체의 기능을 담당함
//2. 변수
//   : 객체의 속성을 표현함

//   전역 변수의 역할
//   -> 선언과 초기화가 동시에 존재해야 함 (단, 코드 상 선언만 가능한 경우 있음. 
//											이 경우 디폴트 값(0)으로 초기화된다.)
//   2-1 클래스 변수(static)
//   2-2 멤버 필드 (non-static)

// static -> static : [패키지 경로].[클래스명].변수명;
// static -> non-static : 참조변수.변수명
// non-static -> static : [패키지 경로].[클래스명].변수명;
// non-static -> non-static : [this.]변수명;

public class Ex09 {
	public static int su1 = 1111;
	public int su2 = 2222;
//	public static int su3; -> 선언과 초기화를 동시에 하는것 불가능함
//	su3 = 3333;
	public static void main(String[] args) {
		System.out.println(com.pm.Ex09.su1);
		
		Ex09 me = new Ex09();
		System.out.println(me.su2); //non-static은 클래스객체를 생성 후 참조변수로 만들어 사용
	}
	
	
}
