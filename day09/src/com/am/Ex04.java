package com.am;

//인터페이스
//오직 추상메서드만을 갖는
interface Inter01{
	public static int su1 = 111; //static 변수는 가질 수 있음
	int su2 = 2222; //public static 변수임
	public abstract void func01() ;
	public void func02() ; //abstract 키워드 생략 가능
	void func03(); //public 키워드 생략 가능
}

interface Inter02{
	void func01();
}
interface Inter03{
	void func02();
}

public class Ex04 extends Object implements Inter02, Inter03{ 
	//같은 메서드를 가진 인터페이스들을 상속해도 문제 X
	public static void main(String[] args) {
		Ex04 me = new Ex04();
		me.func01();
		Object me2 = new Ex04();
//		me2.func01(); 호출 불가
		Inter02 me3 = new Ex04();
		me3.func01();
//		me3.func02(); 불가능 - Inter02로 객체 만들었으니까
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}
}
