package com.am;

public class Ex02 {
	public Ex02() {
		System.out.println("��ü ����");
		this.func01(); //�����ڿ� �޼��� ȣ�� ��� �ο�
		//this. ���� ����
	}  
	
	public Ex02(Ex02 me) {
		me.func01(); //�����ڿ��� �ڱ⸦ �Ű������� �־ �޼��带 �����ϵ��� ��
		//-> ��ü�� �̹� �־�� �Ű������� �־� ��ü�� ������ �� ����
		//��ü�� �ΰ� �����ؾ� �Ѵ�
	}
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func01();
	}
	public void func01() {
		System.out.println("��� ȣ��");
	}
	
	public void func02(Ex02 me) { //��ü�� �Ű������� �����ؾ� ��
		me.func01();
	}
}
