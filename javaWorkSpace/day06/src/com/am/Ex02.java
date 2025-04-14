package com.am;

public class Ex02 {
	public Ex02() {
		System.out.println("객체 생성");
		this.func01(); //생성자에 메서드 호출 기능 부여
		//this. 생략 가능
	}  
	
	public Ex02(Ex02 me) {
		me.func01(); //생성자에서 자기를 매개변수로 넣어서 메서드를 실행하도록 함
		//-> 객체가 이미 있어야 매개변수로 넣어 객체를 생성할 수 있음
		//객체를 두개 생성해야 한다
	}
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		me.func01();
	}
	public void func01() {
		System.out.println("기능 호출");
	}
	
	public void func02(Ex02 me) { //객체를 매개변수로 전달해야 함
		me.func01();
	}
}
