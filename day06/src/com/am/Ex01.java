package com.am;

/**
 * Ŭ������ �������
 * 
 * 1. �޼���
 * 2. �ʵ�
 * 3. ������
 *	��� Ŭ������ �����ڰ� ������
 *  �̸��� �ݵ�� Ŭ�������̴�.
 *  - �����ε带 ���� ���� �����ڰ� �����ϴ�
 *  public Ŭ������(�Ű�����..){�ڵ�}
 */
public class Ex01 {
	//���� ���� 
	public final static int b = 2222; //final ���� -> ���� �Ұ�
	public final static int a = 2222; 
	public final int c;
	
	
	public Ex01() { //�⺻ ������
		c=4444; // �⺻�����ڷ� ������ ��ü�� ��� c�� ���� ����� 4444�� �ȴ�.
	}
	
	public Ex01(int a) { //�Ű����� ������
		c=a; //�Ű����� �����ڷ� ������ ��ü�� ��� c�� ���� ����� 2222�� �ȴ�
		return;
	}
	public static void main(String[] args) {
		//���� ���� - final : ����� ������ ����
		final int a;
		a = 1111;
		
		System.out.println("a="+a); //�������� a
		System.out.println("com.am.Ex01.a = "+ com.am.Ex01.a); //�������� a 
		//-> �ش� �������� ���������ε� �������� �ʰ� ��Ʈ ��ΰ� ������������ ����� ����Ǹ� �����Ϸ��� �ٿ���
		//��� ������ ������ �������� ��θ� �� �ٿ��ش�.
		
		//final �����
		//a = 2222;  final ������ ���� ������ �Ұ����ϴ�.
		System.out.println("a = "+a);
		//func02(final int c)�� �Ű������� 3333, 4444�� ���� �� �ִ�- �Ű����� �ִ°ǵ� �翬
		func02(3333); func02(4444);

	}
	
	public static void func01() {
		//b++;
		//a++; -> ���� ���� a�� ������ �޼��� �ۿ��� ������ �� ����.
	}	
	public static void func02(final int c) {
		//c++; final ���� ���� �Ұ�
		System.out.println("c= "+c);
	}
	
	
}
