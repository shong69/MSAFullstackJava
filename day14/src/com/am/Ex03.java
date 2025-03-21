package com.am;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] lotto = {2,44,32,12,38,8};
		System.out.println(Arrays.binarySearch(lotto, 12)); //-2 없다고 뜸
		Arrays.sort(lotto); //이진 트리 탐색을 위해 정렬을 해야 정확한 값이 나온다
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.binarySearch(lotto, 12));//2 
		
		
		
	}
}
