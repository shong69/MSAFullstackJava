package com.pm;

public class Ex05 {
	public static void main(String[] args) {
		String msg = "ABCD abcd ABCD";
		String msg2 = new String("ABCD abcd");
		String msg3 = "";
		//문자 포함되어있는지 논리 자료형 반환
		boolean isTrue =msg.contains("bc");
		
		//해시 값 정수형으로 반환 -> 내용으로 비교하지 메모리 비교 X
		int hash = msg.hashCode();
		int hash2 = msg2.hashCode();
		System.out.println(hash == hash2);
		
		//비어있는지 논리 자료형 반환
		boolean isTrue2 = msg.isEmpty();
		
		//해당 문자가 위치하는 제일 첫번째 위치 반환. 없으면 -1
		int idx = msg.indexOf("BC");
		System.out.println(idx);
		//해당 문자가 위치하는 중간 위치
		int idx2= msg.indexOf("BC", 5); //두번째 매개변수 fromIndex : 세기 시작하는 위치
		//해당 문자가 위치하는 제일 마지막 위치 반환
		int idx3 = msg.lastIndexOf("BC");
		System.out.println(idx2);
		
		
		//해당 시퀀스의 매개변수1부터 매개변수2 까지에 해당하는 서브시퀀스를 charSequence로 반환
		CharSequence seq = msg.subSequence(0, 5); 
		
		//매개변수로 들어간 여러가지 자료형들을 문자열로 반환해줌
		String result = String.valueOf(true);
		System.out.println(result);
		
		
		
		
	}
}
