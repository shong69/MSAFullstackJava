package com.pm;

public class Ex11 {
	//�Ǽ� ������ �ӵ��� 150������ �ö󰡵���
	//�극��ũ ������ �ӵ��� 0������ ����������
	
	public static int speed = 0;
	public static int max = 180;
	

	public static void main(String[] args) {
		System.out.println("�ڵ��� Ÿ��");
		
		showSpeed();
		
		for(int i = 0;i<30;i++) {
			speedUp();
			showSpeed();

		}
		
		for(int i = 0;i<30;i++) {
			speedDown();
			showSpeed();

		}
	}
	
	public static void showSpeed() {
		System.out.println("���� �ӵ��� "+speed+"km�Դϴ�.");
	}
	public static void speedUp() {
		if(speed+15>max) {
			speed =max;
		}else {
			speed += 10;
		}
		
	}
	public static void speedDown() {
		if(speed-20<0) {
			speed=0;
		}else {
			speed -= 10;
		}
		
	}
}
