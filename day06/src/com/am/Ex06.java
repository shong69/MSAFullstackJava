package com.am;

public class Ex06 {
	public static void main(String[] args) {
		//���ڿ�
		//���ڿ����� ����
		String msg1;
		msg1 = "Hello World";
		//Strin msg2 = new String("Hello World"); -> String ��ü ������ �Ұ��ϴ�
		//	��ü�� �����ϰ� �Ǹ� �ش� ������ �����ϴ� ��ġ�� �޶����� ������ ���ڿ� �񱳰� �Ұ����ϴ�.
		//  ���(�� ��, equals()) �񱳸� �ϴ� ��� �Ȱ����� ���ϼ� ��(�޸� ��, ==)�� �ٸ���.
//		System.out.println(msg2==msg1); -> false
//		System.out.println(msg2.equals(msg1)); -> true
		
		//���� �迭
		char[] arr1 = msg1.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]); //���� �迭�� �̾Ƴ���
		}
		
		String msg4 = new String(arr1); //���� �迭�� ���ڿ��� ��ȯ
		System.out.println(msg4);
	}
}
