package com.am;

public class Ex10 {
	public static void main(String[] args) {
		char ch1 = 'a';
		Character ch2 = 'b';
		Character ch3 = new Character('c'); //�����ڴ� ���� �ϳ��ۿ� ����
		Character ch4 = new Character((char)65);
		
		char[] arr1 = Character.toChars('\uac00');
		System.out.println((int)Character.MAX_VALUE); //65535 ��� < int ���� ǥ������ 
		for (int i = 0; i < arr1.length; i++) {//-> ǥ�������� ����� 2����Ʈ�� �߶� ǥ������
			System.out.println(arr1[i]);
				
		}
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
	}
}
