package com.pm;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,4,6,8};
		
		int[] arr2 = new int[4];
		
		//1. �ý��ۿ� ��û�� �迭 �����ϱ� System.arraycopy()
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//		System.arraycopy(arr1, 1, arr2, 1, 2); -> int[] arr2 == {0, 4, 6, 0};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//arr2�� ���� �����ص� arr1�� ���� �ٲ��� ���� System.arraycopy() -> ���� ����
		arr2[0] =3;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//--------------------------------------------------------
		//1-2. ���� �迭 ���� �غ���
		
		int[][] arr3 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr4 = new int[3][];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = new int[3];
			System.arraycopy(arr3[i], 0, arr4[i], 0, 3); //i��° �迭�� ä����
		}
		
		arr3[1][1] = 0; //arr4[1][1]�� ���� ������ ���� -> ���� ����
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[i][j]);
			}
			System.out.println();
		}
	}
}
