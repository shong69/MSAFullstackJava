package com.am;

// 외부 클래스 = 범용성
class Outter02{
	static int su1=1111;
	int su2 =2222;
	
	//내부 클래스 = 종속성
	static class Inner02{
		static int su3 = 3333;
		int su4 = 4444;
		
		static void func03() {
			System.out.println("inner static method"); //내부 스태틱
//			System.out.println(su1);
//			func01(); //outer method 그냥 호출 가능함
//			Outter02 out1 = new Outter02();
//			System.out.println(out1.su2);
//			out1.func02();
		}
		
		void func04() {
			System.out.println("inner non-static method");// 내부 논-스태틱
//			System.out.println(su1); //내부 클래스에서 외부 접근은 클래스명 생략하고 가능
//			func01();
			
//			System.out.println(su2); //내부 논-스태틱에서 외부 논-스태틱 접근은 객체 생성해야 가능
//			Outter02 out1 =new Outter02();
//			System.out.println(out1.su2);
//			out1.func02();
			
		}
	}
	
	static void func01() {
		System.out.println("outter static method"); //외부 스태틱
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		
//		Inner02 inn1 = new Inner02();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
	
	void func02() {
		System.out.println("outter non-static method"); //외부 논-스태틱
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		Inner02 inn1 = new Inner02();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
}


public class Ex02 {
	public static void main(String[] args) {
		//inner static method
		System.out.println(Outter02.Inner02.su3); //내부 static 클래스의 static 변수 접근
		
		//outer static method
		Outter02.Inner02.func03();//외부클래스의 static 메서드 접근
		
		//inner non-static method
		Outter02.Inner02 inn= new Outter02.Inner02();
		System.out.println(inn.su4);//내부 static 클래스의 변수 접근
		inn.func04(); //내부 static 클래스의 메서드 접근
		
		
		
	}
}
