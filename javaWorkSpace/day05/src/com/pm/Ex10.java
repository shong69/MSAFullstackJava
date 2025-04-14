package com.pm;

public class Ex10 {

//	public static void main(String[] args) {
//		int su1 =1111; //지역변수 su1을 사용함
//		System.out.println("main su1 = "+su1);
//		
//		func01(su1);
//		System.out.println("main su1 = "+su1);
//	}
//	
//	public static void func01(int su1) {
//		su1++;
//		System.out.println("func01 su1 = "+su1);
//	}

////	출력 결과 :
////	main su1 = 1111
////	func01 su1 = 1112
////	main su1 = 1111
	
	
//	public static int su1 = 1111;  //전역변수  su1을 사용
//	public static void main(String[] args) {
//		System.out.println("main su1 = "+su1);
//		
//		func01(su1);
//		System.out.println("main su1 = "+su1);
//	}
//	
//	/**
//	 * @param su1
//	 * 매개변수로 들어온 변수 su1은 func01에서만 라이프 사이클을 가짐
//	 * -> main 함수에서 su1을 호출했을 때 값이 변하지 않는다.
//	 */
//	public static void func01(int su1) { 
//		su1++;
//		System.out.println("func01 su1 = "+su1);
//	}
//	출력 결과 :
//		main su1 = 1111
//		func01 su1 = 1112
//		main su1 = 1111
	
	
	//* non-static의 경우
	public int su1 = 1111;  //전역변수  su1을 사용
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		System.out.println("main su1 = "+me.su1);
		
		me.func01();
		
		Ex10 me2 = new Ex10(); //객체를 새로 생성해냄 
		System.out.println("main me2 su1 = "+me2.su1); //새로운 객체 사용
		System.out.println("main me2 su1 = "+me.su1); //기존 객체를 사용  
	}
	
	public void func01() { 
		su1++;
		System.out.println("func01 su1 = "+su1);		
	}
//	출력 결과:
//		main su1 = 1111
//		func01 su1 = 1112
//		main su1 = 1112

}
