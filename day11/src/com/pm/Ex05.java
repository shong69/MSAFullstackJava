package com.pm;

import java.util.Scanner;

public class Ex05 {
	static class UserErr extends Exception{//Exception 클래스를 상속받아 에러가 됨
		public UserErr() {
			super("su가 1 or 2 or 5 or 10만 가능함"); //Exception 클래스의 생성자 사용
		}
		public UserErr(String msg) {
			super(msg);
		}
	} 

	public static int func01(int su) throws UserErr{//RuntimeException을 상속받지 않아서 강제로 던짐
		if(!(su == 1|| su == 2|| su==5||su==10)) 
			throw new UserErr("su가"+su+"이므로 안됨");
		
		return 10/su;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		try {
			int su = func01(input);
			System.out.println(su);
		}catch (Exception e) {
//			System.out.println("입력오류");
			e.printStackTrace();
		}
		
	}
}
