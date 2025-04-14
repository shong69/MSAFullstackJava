package com.pm;

public class Ex08 {

	public static void main(String[] args) {
		
		//메서드 - 함수
		
		//1. 클래스 메서드(static 메서드, 함수) : 메모리의 static 영역
		// static 영역 - 패키지 경로.클래스명.메서드명
		//public static 리턴타입(void) 메서드명(매개변수){구현;} 
		
		//2. 인스턴스 메서드(non-static 메서드, 멤버 메서드) : 메모리의 heap 영역
		//heap 영역 - 객체로 존재
		//public 리턴타입(void) 메서드명(매개변수) {구현;}
		
		
		// static -> static : [패키지 경로].[클래스명].func01();
		// static -> non-static : 참조변수.func01();
		// non-static -> static : [패키지 경로].[클래스명].func01();
		// non-static -> non-static : [this.]func01();

	}

}
