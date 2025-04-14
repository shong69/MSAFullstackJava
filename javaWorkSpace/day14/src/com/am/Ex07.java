package com.am;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) {
		String msgs = "java db web  framework";
		
		String[] arr1 = msgs.split(" ");
		System.out.println(Arrays.toString(arr1));
		
		//StringTokenizer
		StringTokenizer stk= new StringTokenizer(msgs); //두번째 매개변수로 나누고자 하는 구획을 정해준다
		System.out.println("split length : "+ arr1.length);
		System.out.println("string tokenizer length : "+stk.countTokens());
//		while(stk.hasMoreTokens()) {
//			String temp = stk.nextToken();
//			System.out.println(temp);
//		}
		
		while(stk.countTokens() != 0) {
			System.out.println(stk.nextToken());
		}
	}
}
