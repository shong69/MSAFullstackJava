package com.am;

public class Ex03 {
	//String, Array -> 자바만의 특징이 존재함
	// String : + 기호를 통해 문자열 합치기 가능
	// Array : 
	public static void main(String[] args) {
		//선언 = 초기화; 구조이다.
		int[] arr1;
		arr1= new int[5]; 
		arr1 = new int[3]; //객체 재생성하며 이전에 선언한 int[5]인 객체를 가비지 컬렉션이 처리한다.
		int arr2[] = new int[5];
		int[] arr3= new int[] {1,3,5,7,9};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
