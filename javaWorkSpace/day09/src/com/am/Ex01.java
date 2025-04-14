package com.am;
/* 추상 클래스
 * - 추상 메서드를 0개 이상 갖는 클래스
 * - 상속을 통해서만 사용함을 강제하는 클래스
 * */
abstract class Lec01{
	static int su1 = 1111;
	int su2 = 2222;

	public Lec01(String msg) {
		System.out.println("생성자 호출");
	}
	
	//상속을 통해 가능(동일 패키지에서만 상속 허용)
	protected Lec01() {}
	Lec01(int s) {} 
	//추상 메서드
	// 메서드의 선언 O, 메서드의 구현 X
	public void func01() {}
	public static void func03() {}
//	public abstract static void fun04(); -> 불가능 
//	static에 올려놓고 미리 구현해야 하는데 구현부가 존재하지 않고 있다
	

}
public  class Ex01 extends Lec01{
	public Ex01(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Lec01 parent = new Lec01();
		Ex01 me = new Ex01("메시지"); //자식 객체를 통해 부모객체의 기본생성자도 일할 수 있음
		//부모 클래스의 기본 생성자가 존재하지 않는 경우 오류 -> 내 생성자에서 부모클래스의 생성자를 호출
	}
}
