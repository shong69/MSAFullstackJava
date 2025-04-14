package com.am;

public class Ex10 {
	public static void main(String[] args) {
		char ch1 = 'a';
		Character ch2 = 'b';
		Character ch3 = new Character('c'); //생성자는 문자 하나밖에 없음
		Character ch4 = new Character((char)65);
		
		char[] arr1 = Character.toChars('\uac00');
		System.out.println((int)Character.MAX_VALUE); //65535 출력 < int 값의 표현범위 
		for (int i = 0; i < arr1.length; i++) {//-> 표현범위를 벗어나면 2바이트씩 잘라서 표현해줌
			System.out.println(arr1[i]);
				
		}
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
	}
}
