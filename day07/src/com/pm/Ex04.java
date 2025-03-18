package com.pm;

public class Ex04 {
	public static void main(String[] args) {
		String msg1 = "Hello World";
		
		//starsWith(), endsWith() -> 논리 자료형 반환
		System.out.println(msg1.startsWith("He")); 
		System.out.println(msg1.endsWith("ld"));
		System.out.println(msg1.startsWith("he"));
		System.out.println(msg1.endsWith("l"));
		
		// equals() - 동등성 비교
		System.out.println(msg1 == "Hello World"); //동일성 비교
		System.out.println(msg1.equals("Hello World"));
		
		//byte 배열, 문자 배열로 반환
		byte[] arr1 = msg1.getBytes();
		char[] arr2 = msg1.toCharArray(); 
		
		//byte배열과 문자배열의 길이가 같다고 나오고 있음 -> ms949를 쓰고 있어서 
		System.out.println(arr1.length == arr2.length); //true
		System.out.println(arr1.length);
		System.out.println(arr2.length); 
		
		//문자 배열에 문자열의 문자들을 각각 넣기
		char[] arr3 = new char[msg1.length()];
		msg1.getChars(0, 11, arr3, 0);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		//문자가 위치하는 곳 정수 반환
		int idx = msg1.indexOf((int)'W');
		int idx2 = msg1.indexOf('W'); // 쌍따옴표로 넣어도 오토캐스팅 되니까 결과가 같음
		System.out.println(idx);
		System.out.println(idx2);
		
		//문자열의 길이
		int length = msg1.length();
		
		//원하는 위치에서 문자열 수정
		String msg2 = msg1.replace('H', 'h');
		msg2 = msg2.replace("he", "H");
		System.out.println(msg2);
		
		String msg3 = msg1.substring(0,5); 
		msg3 = msg3.substring(2);
		System.out.println(msg3);
		String msg4 = msg3.toUpperCase();
		msg4 = msg4.toLowerCase();
		
	}
}
