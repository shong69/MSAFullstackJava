package com.am;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] lotto = {2,44,32,12,38,8};
		System.out.println(Arrays.binarySearch(lotto, 12)); //-2 ���ٰ� ��
		Arrays.sort(lotto); //���� Ʈ�� Ž���� ���� ������ �ؾ� ��Ȯ�� ���� ���´�
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.binarySearch(lotto, 12));//2 
		
		
		
	}
}
