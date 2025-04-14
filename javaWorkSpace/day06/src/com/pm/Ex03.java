package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		String msg = "ABCDabcd1234";
		
		System.out.println(msg.charAt(4)); //a 출력
		
		System.out.println(msg.length()); //12 출력
		
		System.out.println(msg.contains("bc")); //포함하고 있는지 T/F 출력
		
		msg = msg.replace("abcd", "aBCD"); //새로운 객체로 받아내야 함
		//Replaces each substring of this string 같은 문자열 다 바꿔줌
		//that matches the literal targetsequence with the specified literal replacement sequence.
		
		msg = msg.concat("!@#$"); //문자열 추가

	}
}
