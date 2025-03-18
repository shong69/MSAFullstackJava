package com.am;

class Car{
	public String company="����";
	public String color="��";
	public final String model;
	public int speed;
	public final int max;
	
	public Car(String msg, int a) {
		color = msg;
		max = a;
		if(a > 180) {
			model  = "�׷���";
		}else if(a>150) {
			model = "�ҳ�Ÿ";
		}else if(a>120) {
			model = "�ƹݶ�";
		}else {
			model = "���";
		}
	}
	
	public Car(String msg, String msg2, int a) {
		color = msg;
		model = msg2;
		max = a;
		
	}
	public void speedUp(int a) {
		if(speed + a * 10 > max) {
			speed = max;
		}else {
			speed += a*10;
		}
	}
	
	public void speedDown() {
		if(speed - 15 < 0) {
			speed = 0;
		}else {
			speed -= 15;
		}
	}
	
	public void show() {
		System.out.println(color +"�� �� ��" + model + " �� �ӵ��� " + speed + "km");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Car myCar = new Car("����", " �ƹݶ�", 150); 
//		myCar.model="�ƹݶ�";
//		myCar.max=150;
//		myCar.color="����";
		for(int i = 0;i<10; i++) {
			myCar.speedUp(i);
			myCar.show();
		}
		
		for (int i = 0; i < 20; i++) {
			myCar.speedDown();
			myCar.show();
		}
		//���� �ƹݶ��� ������ �÷����� �ȴ�.
		myCar = new Car("����", " �׷���", 200); //�ʵ尪 final�̱� ������ ���� �Ұ�
		for(int i = 0;i<10; i++) {
			myCar.speedUp(i);
			if(i==3) {
				myCar.color="���� ���� ����";
			}
			myCar.show();
		}
		
		for (int i = 0; i < 20; i++) {
			myCar.speedDown();
			myCar.show();
		}
	}
}
