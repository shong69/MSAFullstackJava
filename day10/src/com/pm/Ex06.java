package com.pm;

public class Ex06 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(new StringBuilder("abc"));
		
		StringBuffer sb3 = new StringBuffer(5);
//		System.out.println(sb.capacity());//�⺻ ũ�� 16 + abc ������ = 19 ��µ�
//		System.out.println(sb3.capacity()); //������ 16���� �����Ѵ�.
//		for (int i = 0; i < 13; i++) {
//			sb3.append('a'); //���۰� �þ���� ����� �þ��.
//		}
//		System.out.println(sb3.capacity());
		
		
		
		System.out.println(sb3.append("ja"));
		System.out.println(sb3.append("va"));
		System.out.println();
		System.out.println(sb3.substring(1));
		
		System.out.println(sb3.replace(1,3,"AV"));
		
		System.out.println(sb3.delete(1, 3));
		System.out.println(sb3.insert(1, "AV"));
		
		System.out.println(sb3.reverse());

		
	}
}
