package com.pm;

public class Ex05 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());//�� string buffer�� �������� 16�� ���´�
		for (int i = 0; i < 35; i++) {
			sb.append("a");
			System.out.print(sb + "\t");
			System.out.println(sb.capacity());
		}
		sb.trimToSize();
		
		System.out.println(sb.capacity());
	}
}
