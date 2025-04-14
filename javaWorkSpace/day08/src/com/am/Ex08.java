package com.am;

class Carriage{
	
	int speed;
	int max;
	public Carriage() {
		max= 20;
	}
	public void speedUp() {}
	public void speedDown() {}
	public void show() {
		System.out.println("운반 속도를 출력");
	}

}

class Cycle extends Carriage{
	
	public Cycle() {
		max = 40;
	}
	@Override //컴파일러 체크용 어노테이션
	public void show() {
		System.out.println("열심히 달려봤자 "+speed+"km");
	}
}

class Car extends Carriage{
	String model;
	String color;
	public Car(String color, String model) {
		max = 100;
		this.color = color;
		this.model = model;
	}
	//메서드 오버라이딩 : 부모의 메서드를 재정의하는 것
	@Override //컴파일러 체크용 어노테이션
	public void show() {
		System.out.println(model +" 속도는 " + speed + "km");
	}
	
	public void stop() {}
	@Override
	public void speedUp() {}
	
//	@Override
//	private void speedDown() {} -> private으로 상속받기 불가능

}



//중복되는 코드의 재사용
public class Ex08 {
	public static void main(String[] args) {
		Car myCar = new Car("흰색", "모닝");
		myCar.speedUp();
		myCar.speedDown();
		
		
	}
}
