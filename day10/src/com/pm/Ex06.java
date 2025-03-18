package com.pm;

public class Ex06 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(new StringBuilder("abc"));
		
		StringBuffer sb3 = new StringBuffer(5);
//		System.out.println(sb.capacity());//기본 크기 16 + abc 세글자 = 19 출력됨
//		System.out.println(sb3.capacity()); //용적률 16부터 시작한다.
//		for (int i = 0; i < 13; i++) {
//			sb3.append('a'); //버퍼가 늘어날수록 사이즈가 늘어난다.
//		}
//		System.out.println(sb3.capacity());
		
		
		
		System.out.println(sb3.append("ja"));
		System.out.println(sb3.append("va"));
		System.out.println();
		System.out.println(sb3.substring(1));
		
		System.out.println(sb3.replace(1,3,"AV"));
		
		System.out.println(sb3.delete(1, 3));
		System.out.println(sb3.insert(1, "AV"));
		
		System.out.println(sb3.reverse());

		
	}
}
