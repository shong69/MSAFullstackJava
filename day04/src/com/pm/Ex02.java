package com.pm;


/* static -> static         func01(); (�ٷ� ȣ�� ����)
 * static -> non-static     ��������.func01();
 * non-static -> non-static func01(); (�ٷ� ȣ�� ����)
 * non-static -> static     func01(); (�ٷ� ȣ�� ����) 
 * */

public class Ex02 {
//**�޼���(Ŭ�����޼���, static method)**
	public static void func01() {
		System.out.println("Ŭ���� �޼���");
		
	}
		
	
//**�޼���(����޼���, �ν��Ͻ� �޼���, non-static method)**
	public void func02() {
		System.out.println("��� �޼���");
		func01(); //static method�� �ٷ� ȣ�� ����
	}
	
	//1. �����ε� ���� + return ���� ����
	public void func02(int a) {
		int su = func03(); 
		System.out.println("su="+su);
		return;
	}
	
	//2. �ν��Ͻ� �޼��� ���� ȣ���� ����
	public int func03() {
		return 1234;
	}
	
	public static void main(String[] args) {
		func01();
		//��������
		
		Ex02 me = new Ex02(); //��ü ����
		me.func02();
		me.func02(1111); 
	}
	
}
