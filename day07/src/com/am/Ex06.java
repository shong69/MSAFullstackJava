package com.am;

public class Ex06 {
	public static void main(String[] args) {
//		int[] arr1 = new int[] {1,2,3};
//		int[] arr2 = new int[] {4,5,6};
//		int[] arr3 = new int[] {7,8,9};
		
		
//		int[][] arr4 = new int[][] {arr1, arr2, arr3}; //�迭�� ���� �迭
		int[][] arr4 = new int[3][];
		arr4[0] =new int[] {1,2,3};
		arr4[1] = new int[] {4,5,6};
		arr4[2] =  new int[] {7,8,9}; // ���ҷ� ���� �迭�� ���� ������ ��� X
		
		for (int i = 0; i < arr4.length; i++) {
			int[] temp = arr4[i]; //arr4�� ������ arr1,2,3 ����
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[j]); //arr1,2,3�� ������ ���� ���
			}
		}
		
		///-----------------------------------------------------
		//���� �����ϱ�;
		
		int[][] arr7 = null;
		arr7 = new int[3][];
		for (int j = 0; j < arr4.length; j++) {
			int[] temp=arr4[j];
			int[] temp2=new int[temp.length]; //temp ���̸�ŭ �迭 ����
			
			for (int i = 0; i < temp.length; i++) { //���� ����� �ٲٱ�
				temp2[i] = temp[i];
			}
			arr7[j] = temp2;
		}
		
		arr4[1][1] = 1;
		
		System.out.println("-------------------------------");
		
		for (int i = 0; i < arr7.length; i++) {
			int [] temp=arr7[i];
			for (int k = 0; k < temp.length; k++) {
				System.out.println(temp[k]);
			}
		}
	}
}
