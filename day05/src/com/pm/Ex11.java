package com.pm;

public class Ex11 {
	//악셀 밟으면 속도가 150까지만 올라가도록
	//브레이크 밟으면 속도가 0까지만 내려가도록
	
	public static int speed = 0;
	public static int max = 180;
	

	public static void main(String[] args) {
		System.out.println("자동차 타고");
		
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
		System.out.println("현재 속도는 "+speed+"km입니다.");
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
