package com.pm;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr1 = {-2,-1,0,1,2};
		
//		try {
//			for (int i = 0; i < arr1.length; i++) {
//				System.out.println(0/arr1[i]);
//			}//0을0으로 나누는 순간 에러 발생
//			
//		} catch (java.lang.ArithmeticException e) { //에러 발생시 나머지 반복문 실행 X
//			System.out.println(e +"에러 발생");
//		}
//		
		//----------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		//for문 안에서만 에러 감지하도록 하면 반복문 전체 실행 가능
		for (int i = 0; i <= arr1.length; i++) {
			try {
				System.out.println(0/arr1[i]);
			} catch (java.lang.ArithmeticException e) { 
				System.out.println(e +"에러 캐치");
			} catch (Exception e) {
				e.printStackTrace();
				
//				System.out.println("인덱스를 벗어나는 에러 캐치");
//				String msg = e.getMessage();
//				String msg2 = e.getLocalizedMessage();
//				String msg3 = e.toString();
//				StackTraceElement[] stack = e.getStackTrace();
//				for (int j = 0; j < stack.length; j++) {
//					StackTraceElement element = stack[j];
//					System.out.print(element.getClassName()+"\t");
//					System.out.print(element.getMethodName()+"\t");
//					System.out.println(element.getLineNumber());
//					//com.pm.Ex02	main	25 출력됨
//				}
				
//				System.out.println(msg);
//				System.out.println(msg2);
//				System.out.println(msg3);
			} 
//			catch(RuntimeException e){ 
//				//RuntimeException은 상위 에러 클래스이기 때문에 앞에 있으면 나머지 에러를 받지 못함
//				String msg = e.getMessage();
//				String msg2 = e.getLocalizedMessage();
//				String msg3 = e.toString();
//				System.out.println(msg);
//				System.out.println(msg2);
//				System.out.println(msg3);
//			}
		}

		
		
	}
}
