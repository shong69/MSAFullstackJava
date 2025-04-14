package com.am;

public class Ex09 {
	public static void main(String[] args) {
		Carriage car1 = new Carriage();
		
		Car car2 = new Car("흰색", "모닝");
		
		Cycle chr3 = new Cycle();
//		chr3.show();
//		car1.speedUp();
//		car1.show();
//		car2.speedUp();
//		car2.show();
		
		//다형성
		Carriage car4 = new Car("검정색", "자식");
		car4.speedUp(); //오버라이딩한 자식 메소드가 실행됨
		car4.show();
		//car4.stop(); Car에만 있는 메소드 실행 불가
		//((Car)car4).stop(); 
		System.out.println(car4.max); //필드는 부모의 값으로 출력됨-> 오버라이드의 대상은 메서드만
	}
}
