package com.am;
class Ex100{
	int a = 111;
	public Ex100(String msg) {
		
	}
	public void func01() {
		System.out.println("���");
	}
}
public class Ex10 extends Ex100 {
	int a = 222;
	public Ex10() {
		super("������");
	}
	public Ex10(int a) {
		this(); //�⺻ �����ڸ� ȣ���ؼ� �θ� ������ ȣ���ϵ��� �Ѵ�.
	}
	
	
	public void func01() {
		super.func01();
		System.out.println("�ڽ� ���" + super.a); //�θ� �ʵ� super.a / �ڽ� �ʵ� this.a
	}
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		me.func01();
	}
}
