package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		// 평상시에는 패키지명을 생략해서 적어도 되도록 함 -> 컴파일러가 모든 클래스에 패키지명 붙여줌
		java.lang.String msg = "Hello World";
		java.lang.System.out.println(msg);
		
		
		//----------------------------------------------
		//String 객체를 만드는 방식들
		String msg1 = new String(); //기본생성자로 String 객체 생성
		String msg2 = new String(msg);
		String msg3 = new String(new char[] {'a', 'b','c'});
		String msg4 = new String(new byte[] {65, 66, 67});
		
		//-----------------------------------------------
		//String 관련 메서드
		char ch1 = msg.charAt(1); //1번째 문자를 char로 반환
		String concatMsg = msg.concat("!!!"); //매개변수로 받은 문자열을 합쳐서 문자열을 반환
		String msg5 = "ja";
		String msg6 = "va";
		String msg7 = "java";
		String msg8 = msg5 + msg6; // + 기호로 문자열을 합치면 새로운 문자열 객체를 반환해야 한다
		String msg9 = msg5.concat(msg6);// concat도 새로운 객체를 반환함
		System.out.println(msg7==msg8); //동일성 비교(메모리 주소 비교)
		System.out.println(msg7==msg9);
		System.out.println(msg8==msg9);
		
		
	}
}
     