package com.pm;

import java.util.HashMap;

public class Ex07 {
	public static void main(String[] args) {
		//�Ű������� �ִ� ���ڸ� �������� ������ ���ڿ��� ������
		String msg = "java db web framework";
		String[] arr1 = msg.split(" "); 
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//Compares two strings lexicographically.The comparison is based on the Unicode value of each character inthe strings.
		//�� ���ڿ��� �����ڵ� ������ ���Ѵ�. �Ű��������� Ŭ���� 1�� Ŀ����.
		String msg1 = "java";
		String msg2 = "java1";
		
		int result = msg1.compareTo(msg2);
		System.out.println(result); //-1 ���
		
	}
}
