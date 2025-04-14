package com.am;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
//		java.io.InputStream src = System.in;
		String src = "java web spring\n11 22 33";
		Scanner sc = new Scanner(src);
		
//		System.out.println("input : "+sc.nextLine()+1); //nextLine() : 개행 전까지 스캔한다.
//		System.out.println("input : "+sc.nextLine()+1); //숫자도 읽어낸다 - 구분자(space)를 기준으로 나눠서 스캔한다
//		System.out.println("input : "+sc.nextLine());
		
		while(sc.hasNext()) {
			System.out.println("input : "+(sc.nextInt()+1));
		}
	}
}
