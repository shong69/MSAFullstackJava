package com.am;

import java.util.Arrays;

class Ball implements Comparable<Ball>{

	int num;
	public Ball(int num) {
		this.num = num;
	}
	@Override
	public int compareTo(Ball ord) {
		return ord.num - this.num;
	}
	@Override
	public String toString() {

		return num + "공";
	}
}

public class Ex02 {
	public static void main(String[] args) {
		int[] lotto = {2,44,32,12,38,8};
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		//대소문자, 알파벳순, 길이를 고려하여 정렬해준다
		String[] arr2 = {"b","Ab","Aa","B"};
		Arrays.parallelSort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		Ball[] arr3 = {new Ball(1), new Ball(3), new Ball(2)};
		Arrays.sort(arr3);
//		System.out.println(arr3); ClassCastException이 일어남 -> Comparable로 정렬 정의하기
		
		System.out.println("--------------------------------------------");
		System.out.println(Arrays.binarySearch(lotto, 44));
		//Searches the specified array of ints for the specified value using the binary search algorithm.
		
		
	}
}
