package com.am;

import java.util.LinkedList;

public class Ex02 extends Thread {

	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex02 me = new Ex02();
		me.start(); //새 스레드를 만들어 run을 수행하도록 (me.run()은 main스레드가 진행하게 된다)
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread i = "+i);
		}
		System.out.println("main thread end");
	}
	//Thread의 run메소드를 오버라이딩하기 -> 원하는 방식으로 설정 가능
	@Override
	public void run() {
		System.out.println(getName() +" thread start");
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " thread i = "+i);
		}
		System.out.println(getName() +" thread end");
	}
}
