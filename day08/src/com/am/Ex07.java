package com.am;

class Ex77{
	int su = 1111;
	public void func01() {

		System.out.println("�θ��� ���");
	}
}
public class Ex07 extends Ex77{
	public void func02() {
		System.out.println("�ڽ��� ���");
	}
	public static void main(String[] args) {
		//��� : ��� Ŭ������ �θ� Ŭ������ ��ӹ޴´�.
		//Ư�� ����� ������ �ֻ����� Object Ŭ������ ��� �޴´�.
		//���� ��Ӹ� ������
	
		Ex07 me = new Ex07();
		Ex77 parent = new Ex77();
		me.func01(); //�θ��� ����� �����޾� ��� ����
		System.out.println(parent.su);
		System.out.println(me.su);//�θ��� �ʵ嵵 �����޾� ��� ������
	}
}
