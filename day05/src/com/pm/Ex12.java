package com.pm;
//Ex11�� �ڵ带 ��ü ���������� �ٲٱ�
class Car{
	public String model="�̸���";
	public String color="��";
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
		System.out.println(color + "�� " + model+"���� �ӵ��� "+speed+"km");
	}
}
public class Ex12 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.model="�ƹݶ�";

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
		myCar.model="�ҳ�Ÿ";
		myCar.color = "����";
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
