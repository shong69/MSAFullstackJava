package com.pm;

public class Ex01 {
	public static void main(String[] args) {
		char target = 'A';
		//1.0.2 사용 가능하냐 - 코드 작성 시에는 모두 사용 가능함
		System.out.println(Character.isDefined(target));
		//1.5 문자냐
		System.out.println(Character.isLetter(target));
		//1.7 문자냐
		System.out.println(Character.isAlphabetic('감'));////true
		
		//숫자냐
		System.out.println(Character.isDigit(target));
		
		//영문 대문자
		System.out.println(Character.isUpperCase(target));
		//영문 소문자
		System.out.println(Character.isUpperCase(target));
		
		//띄어쓰기
		System.out.println(Character.isSpace(target)); //deprecated ->
		System.out.println(Character.isWhitespace(target)); //똑같은 메서드
		
		
	} 
}
