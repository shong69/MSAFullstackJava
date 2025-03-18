package com.am;

/** 어제 복습 - 참조변수와 자료형 기본값
 * @author user
 *
 */
public class Ex01 {
	
	public static String msg= null; //객체 없음, String도 클래스 타입이니까 기본값이 null(키워드로서) -> 주소값이 없다는 의미
	public static String msg2=""; //객체 있음, item은 없음
	
	public Ex01() { //기본 생성자 -> 매개변수 생성자가 있다면 생략할 수 없다
		//객체 생성 X. 생성자가 생성자를 만들어내기 때문
		this("없음");
	}
	public Ex01(int su) { //매개변수 생성자
		//객체 생성 X
		this("숫자 : " + su);
	}
	public Ex01(String msg) { //매개변수 생성자
		//객체 생성 O
		System.out.println("객체 생성 ");
		System.out.println("매개변수 ");
		System.out.println("문자열 : "+msg);
		System.out.println(this);
	}
	
	public static void main(String[] args) {
//		char ch = '\u0000'; //문자형의 기본값==null (문자로서 null -> \u0000으로 출력됨)
		Ex01 me = null; //참조변수의 기본값은 null임 (키워드로서의 null -> null이라 출력됨)
		
		me =new Ex01("java"); //참조변수에 객체를 저장한 것 (참조변수의 타입은 그래서 클래스임)
		
		

	}
}
