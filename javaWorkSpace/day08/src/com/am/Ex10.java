package com.am;
class Ex100{
	int a = 111;
	public Ex100(String msg) {
		
	}
	public void func01() {
		System.out.println("기능");
	}
}
public class Ex10 extends Ex100 {
	int a = 222;
	public Ex10() {
		super("우하하");
	}
	public Ex10(int a) {
		this(); //기본 생성자를 호출해서 부모 생성자 호출하도록 한다.
	}
	
	
	public void func01() {
		super.func01();
		System.out.println("자식 기능" + super.a); //부모 필드 super.a / 자식 필드 this.a
	}
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		me.func01();
	}
}
