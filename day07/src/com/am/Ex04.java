package com.am;

public class Ex04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2,4,6,8};
		
		//int[] arr2 = arr1; //�ּҰ��� �Ѱ��� ���� ����
//		arr1[1] =3;
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
		//���� �����ϱ�
//		int[] arr2 = new int[4];
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i]=arr1[i];
//		}
		  
		arrPrint(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	public static void arrPrint(int[] arr2) { // == int[] arr2 = arr1;�� �Ű������� �޴� ���� 
											//-> �Ű������� ȣ�⸸ �ص� �������� �Ͼ
		arr2[1] = 3; 
	}
}
