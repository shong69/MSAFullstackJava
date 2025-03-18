package com.am;

class Car{
	public String model, color;
	public int speed;
	public final int max;
	
	public Car(String color, String model, int max) {
		this.color = color;
		
		if(model != null) {
			this.model = model;
		}else {
			if(max >180) this.model = "�׷���";
			else if(max > 150) this.model = "�ƹݶ�";
			else if(max > 120) this.model = "ĳ����";
			else  this.model = "���";
		}

		if(max != 0) {
			this.max  = max;
		}else {
			if(model.equals("�׷���")) this.max = 200;
			else if(model.equals("�ƹݶ�")) this.max = 180;
			else if(model.equals("ĳ����")) this.max = 150;
			else  this.max = 120;
		}

		


	}
	
	public Car(String color, int max) {
//		this.color = color;
//		this.max = max;
//		if(max >180) this.model = "�׷���";
//		else if(max > 150) this.model = "�ƹݶ�";
//		else if(max > 120) this.model = "ĳ����";
//		else  this.model = "���"; -> �ߺ� ���̱�
		this(color, null, max);
	}
	public Car(String color, String model) {
//		this.color = color;
//		this.model = model;
//		if(model.equals("�׷���")) this.max = 200;
//		else if(model.equals("�ƹݶ�")) this.max = 180;
//		else if(model.equals("ĳ����")) this.max = 150;
//		else  this.max = 120;
		this(color, model, 0);
		
	}
	public void up() {
		if(speed + 10>max) {
			speed = max;
		}else speed += 10;
	}
	public void down() {
		if(speed - 10<0) {
			speed = 0;
		}else speed -= 10;
	}
	public void show() {
		System.out.println(color + "�� " + model + "�� �ӵ��� "+ speed + "km");
	}
}



public class Ex02 {
	public static void main(String[] args) {
		Car myCar = new Car("��",150);
		
		for (int i = 0; i <30; i++) {
			myCar.up();
			myCar.show();
		}
		for (int i = 0; i <30; i++) {
			myCar.down();
			myCar.show();
		}
	}
}
