package com.am;

class Ex77{
	int su = 1111;
	public void func01() {

		System.out.println("부모의 기능");
	}
}
public class Ex07 extends Ex77{
	public void func02() {
		System.out.println("자식의 기능");
	}
	public static void main(String[] args) {
		//상속 : 모든 클래스는 부모 클래스를 상속받는다.
		//특별 상속이 없으면 최상위의 Object 클래스를 상속 받는다.
		//단일 상속만 가능함
	
		Ex07 me = new Ex07();
		Ex77 parent = new Ex77();
		me.func01(); //부모의 기능을 물려받아 사용 가능
		System.out.println(parent.su);
		System.out.println(me.su);//부모의 필드도 물려받아 사용 가능함
	}
}
