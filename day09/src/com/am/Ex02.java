package com.am;
//1. ����� ���ؼ� ����� �ϵ��� ����
abstract class Machine{
	public void on() {System.out.println("�Ѵ�");}
	public void off() {System.out.println("����");}
	public abstract void work();
}
class Tv extends Machine{
	@Override
	public void work() {
		System.out.println("ȭ���� �����ִ�");
	}
}
class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("�Ҹ��� ����ִ�");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Machine remote = new Tv();
		
		remote.on();
		remote.work();
		remote.off();
		
	}
}
