package com.pm;

public class Ex05 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());//빈 string buffer의 용적률이 16이 나온다
		for (int i = 0; i < 35; i++) {
			sb.append("a");
			System.out.print(sb + "\t");
			System.out.println(sb.capacity());
		}
		sb.trimToSize();
		
		System.out.println(sb.capacity());
	}
}
