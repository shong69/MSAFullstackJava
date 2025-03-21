package com.am;

class Outter03{
	static int su1 = 1111;
	int su2 = 2222;
	//non-static 내부 클래스
	class Inner03{
		//static 영역에 non-static 내부 클래스의 값들을 올릴 수 없다.
		//-> 객체가 생성되기 전에 static 값을 먼저 올릴 수 없기 때문!
//		static int su3 = 3333; //불가능 -> 이 라인이 가능한 자바 버전이 있는데 이는 final이 생략되어 표현된 경우
//		static void func03() {} //불가능
		
		//final인 경우 값이 클래스 영역 안의 상수 영역에 올라가기 때문에 가넝한
		//(상수 영역은 애플리케이션 실행 시 바로 생성된다)
		final static int su3 = 3333;
		int su4 = 4444;
		
		/**
		 * non-static 내부 클래스의 메서드에서 
		 * non-static 외부 클래스 접근 
		 */
		void func04() {
			System.out.println(su1);
			System.out.println(su2);
			func01();
			func02();
			
		}
		
	}
	
	/**
	 * static 메서드에서 non-static 외부 클래스 접근
	 */
	static void func01() {
		//non-static inner 클래스이기 때문에 외부 클래스로 객체를 우선 생성하고
		Outter03 me = new Outter03();
		Inner03 inn = null;
		//외부 클래스 참조변수를 내부 클래스 생성 시에 붙여야 한다.
		inn = me.new Inner03();
		System.out.println(inn.su4);
	}
	/**
	 * non-static 메서드에서 non-static 외부 클래스 접근
	 */
	void func02() {
		System.out.println(Inner03.su3);
		//non-static에 접근하기 위해 나임을 알린다(this)
		Inner03 inn = null;
		inn = this.new Inner03(); //this 생략 가능
		System.out.println(inn.su4); //non-static 변수 접근
	}
}

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(Outter03.Inner03.su3);
		
		Outter03 outter = new Outter03(); //외부 객체 생성
		Outter03.Inner03 inn = null; //내부 객체 생성
		inn = outter.new Inner03(); //외부 객체.내부 객체로 초기화
		System.out.println(inn.su4); //내부 필드 호출 가능
	}
}
