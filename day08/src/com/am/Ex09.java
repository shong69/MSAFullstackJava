package com.am;

public class Ex09 {
	public static void main(String[] args) {
		Carriage car1 = new Carriage();
		
		Car car2 = new Car("���", "���");
		
		Cycle chr3 = new Cycle();
//		chr3.show();
//		car1.speedUp();
//		car1.show();
//		car2.speedUp();
//		car2.show();
		
		//������
		Carriage car4 = new Car("������", "�ڽ�");
		car4.speedUp(); //�������̵��� �ڽ� �޼ҵ尡 �����
		car4.show();
		//car4.stop(); Car���� �ִ� �޼ҵ� ���� �Ұ�
		//((Car)car4).stop(); 
		System.out.println(car4.max); //�ʵ�� �θ��� ������ ��µ�-> �������̵��� ����� �޼��常
	}
}
