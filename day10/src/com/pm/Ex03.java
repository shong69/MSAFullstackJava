package com.pm;

public class Ex03 {
	public static void main(String[] args) {
		String msg1 ="java";
		String msg2 = new String("java");
		StringBuffer sb1 = new StringBuffer("java");
		StringBuilder sb2 = new StringBuilder("java");
		
//		StringBuffer sb3 = "java"; //���� �߻� -> ���ڿ� Ŭ���������� ��ü ���� �� ����ؾ��Ѵ�.
		System.out.println(sb1+"web"); //javaweb
//		StringBuffer sb3 = sb1 + "web"; �̷� ������� ���ۿ� ���ڿ� ���ϴ� ���� �ƴ� 
		//(���ڿ��� ���ϴ� ���� ���ڿ��� �Ǿ�� �ϱ� ����)
		StringBuffer sb3 = sb1.append("Web");
		System.out.println(sb3); //javaweb
		
		StringBuffer sb4 = sb3.append("Spring");
		System.out.println(sb1); //javaWebSpring
		System.out.println(sb1.append("DB")); //javaWebSpringDB
		System.out.println(sb1.append("Database")); //javaWebSpringDBDatabase
		
		
		System.out.println("����");
		for (int i = 0; i < 1000; i++) {
			sb1.append(i);
		}
		
		System.out.println("��");
		System.out.println(sb1);
	}
}
