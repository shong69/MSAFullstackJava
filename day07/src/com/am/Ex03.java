package com.am;

public class Ex03 {
	//String, Array -> �ڹٸ��� Ư¡�� ������
	// String : + ��ȣ�� ���� ���ڿ� ��ġ�� ����
	// Array : 
	public static void main(String[] args) {
		//���� = �ʱ�ȭ; �����̴�.
		int[] arr1;
		arr1= new int[5]; 
		arr1 = new int[3]; //��ü ������ϸ� ������ ������ int[5]�� ��ü�� ������ �÷����� ó���Ѵ�.
		int arr2[] = new int[5];
		int[] arr3= new int[] {1,3,5,7,9};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
