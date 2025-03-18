package com.pm;

import java.util.HashMap;

public class Ex07 {
	public static void main(String[] args) {
		//매개변수에 있는 문자를 기준으로 각각의 문자열로 나눠줌
		String msg = "java db web framework";
		String[] arr1 = msg.split(" "); 
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//Compares two strings lexicographically.The comparison is based on the Unicode value of each character inthe strings.
		//두 문자열을 유니코드 값으로 비교한다. 매개변수보다 클수록 1씩 커진다.
		String msg1 = "java";
		String msg2 = "java1";
		
		int result = msg1.compareTo(msg2);
		System.out.println(result); //-1 출력
		
	}
}
