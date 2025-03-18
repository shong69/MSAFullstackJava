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
		System.out.println("��� �ӵ��� ���");
	}

}

class Cycle extends Carriage{
	
	public Cycle() {
		max = 40;
	}
	@Override //�����Ϸ� üũ�� ������̼�
	public void show() {
		System.out.println("������ �޷����� "+speed+"km");
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
	//�޼��� �������̵� : �θ��� �޼��带 �������ϴ� ��
	@Override //�����Ϸ� üũ�� ������̼�
	public void show() {
		System.out.println(model +" �ӵ��� " + speed + "km");
	}
	
	public void stop() {}
	@Override
	public void speedUp() {}
	
//	@Override
//	private void speedDown() {} -> private���� ��ӹޱ� �Ұ���

}



//�ߺ��Ǵ� �ڵ��� ����
public class Ex08 {
	public static void main(String[] args) {
		Car myCar = new Car("���", "���");
		myCar.speedUp();
		myCar.speedDown();
		
		
	}
}
