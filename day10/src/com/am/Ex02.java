package com.am;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("����");
		func01();
		System.out.println("����");
	}
	
	//return : (������ �޼���)-�޸� �������� ȣ���� ������ ���ư��� �� 
	//break : �߰�ȣ Ż�� -(�ݺ���, switch��)
	//continue : (�ݺ���)continue ���� ������ �����ϰ� ó������ ���ư���.
	public static void func01() {
		for (int i = 0; i < 10; i++) {
			if(i==5)break;
			System.out.println("i="+i);
		}
		System.out.println("�ϴ� ����");
	}
	public static void func02() {
		for (int i = 0; i < 10; i++) {
			if(i==5)return;
			System.out.println("i="+i);
		}
	}
	public static void func03() {
		for (int i = 0; i < 10; i++) {
			if(i==5)continue;
			System.out.println("i="+i);
		}
	}
}
