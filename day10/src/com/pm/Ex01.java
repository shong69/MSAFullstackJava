package com.pm;

public class Ex01 {
	public static void main(String[] args) {
		char target = 'A';
		//1.0.2 ��� �����ϳ� - �ڵ� �ۼ� �ÿ��� ��� ��� ������
		System.out.println(Character.isDefined(target));
		//1.5 ���ڳ�
		System.out.println(Character.isLetter(target));
		//1.7 ���ڳ�
		System.out.println(Character.isAlphabetic('��'));////true
		
		//���ڳ�
		System.out.println(Character.isDigit(target));
		
		//���� �빮��
		System.out.println(Character.isUpperCase(target));
		//���� �ҹ���
		System.out.println(Character.isUpperCase(target));
		
		//����
		System.out.println(Character.isSpace(target)); //deprecated ->
		System.out.println(Character.isWhitespace(target)); //�Ȱ��� �޼���
		
		
	} 
}
