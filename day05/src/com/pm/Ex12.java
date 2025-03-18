package com.pm;
//Ex11의 코드를 객체 지향적으로 바꾸기
class Car{
	public String model="이름모름";
	public String color="흰";
	public int speed;
	public int max=100;
	
	
	public void speedUp() {
		if(speed + 18>max) {
			speed = max;
		}else {
			speed += 18;
		}
	}
	public void speedDown() {
		if(speed - 22 <0) {
			speed = 0;
		}else {
			speed -= 22;
		}
	}
	
	public void show() {
		System.out.println(color + "색 " + model+"차의 속도는 "+speed+"km");
	}
}
public class Ex12 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.model="아반떼";

		myCar.max = 150;
		myCar.show();
		
		for(int i =0; i<30;i++) {
			myCar.speedUp();
			myCar.show();
		}
		for(int i =0; i<30;i++) {
			myCar.speedDown();
			myCar.show();
		}
		
		myCar = new Car();
		myCar.model="소나타";
		myCar.color = "검정";
		myCar.max = 180;
		myCar.show();
		
		for(int i =0; i<30;i++) {
			myCar.speedUp();
			myCar.show();
		}
		for(int i =0; i<30;i++) {
			myCar.speedDown();
			myCar.show();
		}
	}
	
}
