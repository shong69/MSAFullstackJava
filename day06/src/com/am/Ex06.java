package com.am;

public class Ex06 {
	public static void main(String[] args) {
		//문자열
		//문자열들의 집합
		String msg1;
		msg1 = "Hello World";
		//Strin msg2 = new String("Hello World"); -> String 객체 생성은 불가하다
		//	객체로 생성하게 되면 해당 변수를 저장하는 위치가 달라지기 때문에 문자열 비교가 불가능하다.
		//  동등성(값 비교, equals()) 비교를 하는 경우 똑같지만 동일성 비교(메모리 비교, ==)시 다르다.
//		System.out.println(msg2==msg1); -> false
//		System.out.println(msg2.equals(msg1)); -> true
		
		//문자 배열
		char[] arr1 = msg1.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]); //문자 배열로 뽑아내기
		}
		
		String msg4 = new String(arr1); //문자 배열을 문자열로 변환
		System.out.println(msg4);
	}
}
