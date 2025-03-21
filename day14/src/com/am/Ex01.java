package com.am;

import java.util.*; //��ƿ��Ƽ ����

public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		String msg1 = Arrays.toString(arr1); 
		//Returns a string representation of the contents of the specified array
		System.out.println(arr1);
		System.out.println(msg1);
		
		int[] arr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 4); //�迭�� �Ϻθ� ����
		int[] arr4 = Arrays.copyOfRange(arr1, 0,arr1.length);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		
		
		System.out.println(arr2 == arr4); //false
		System.out.println(arr2.equals(arr4)); //false
		System.out.println(Arrays.equals(arr2, arr4));//true -> �� �񱳸� ���ش�
		
		int[][] arr5 = {{1,2,3},{4,5,6}};
		int[][] arr6 = {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.equals(arr5, arr6)); 
		//false -�迭�� ��� �迭�̶� �迭 ��ü�� �ּҸ� ���ϰԵ�(�迭 �ȿ� new �����Ǿ� ����)
		System.out.println(Arrays.deepEquals(arr5, arr6)); 
		// �迭 ���� ������ ��(�迭�� ��� ���ε� ���X)
		
		
		Arrays.fill(arr1, 1111); //���� ä����(void ��ȯ)
		System.out.println(Arrays.toString(arr1));
		
		
	}
}
