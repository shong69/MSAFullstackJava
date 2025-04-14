package com.am;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,4,6,8};
		
		//int[] arr2 = arr1; //주소값을 넘겨줌 얕은 복사
//		arr1[1] =3;
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		//깊은 복사하기
//		int[] arr2 = new int[4];
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i]=arr1[i];
//		}
		  
		arrPrint(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	public static void arrPrint(int[] arr2) { // == int[] arr2 = arr1;로 매개변수를 받는 거임 
											//-> 매개변수로 호출만 해도 얕은복사 일어남
		arr2[1] = 3; 
	}
}
