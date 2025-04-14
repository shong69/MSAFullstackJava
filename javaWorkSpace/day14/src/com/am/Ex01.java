package com.am;

import java.util.*; //유틸리티 도구

public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		String msg1 = Arrays.toString(arr1); 
		//Returns a string representation of the contents of the specified array
		System.out.println(arr1);
		System.out.println(msg1);
		
		int[] arr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4); //배열의 일부만 복사
		int[] arr4 = Arrays.copyOfRange(arr1, 0,arr1.length);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		
		System.out.println(arr2 == arr4); //false
		System.out.println(arr2.equals(arr4)); //false
		System.out.println(Arrays.equals(arr2, arr4));//true -> 값 비교를 해준다
		
		int[][] arr5 = {{1,2,3},{4,5,6}};
		int[][] arr6 = {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.equals(arr5, arr6)); 
		//false -배열을 담는 배열이라 배열 자체의 주소를 비교하게됨(배열 안에 new 생략되어 있음)
		System.out.println(Arrays.deepEquals(arr5, arr6)); 
		// 배열 안의 값들을 비교(배열이 몇개로 감싸도 상관X)
		
		
		Arrays.fill(arr1, 1111); //값을 채워줌(void 반환)
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
