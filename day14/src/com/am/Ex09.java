package com.am;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
//		java.io.InputStream src = System.in;
		String src = "java web spring\n11 22 33";
		Scanner sc = new Scanner(src);
		
//		System.out.println("input : "+sc.nextLine()+1); //nextLine() : ���� ������ ��ĵ�Ѵ�.
//		System.out.println("input : "+sc.nextLine()+1); //���ڵ� �о�� - ������(space)�� �������� ������ ��ĵ�Ѵ�
//		System.out.println("input : "+sc.nextLine());
		
		while(sc.hasNext()) {
			System.out.println("input : "+(sc.nextInt()+1));
		}
	}
}
