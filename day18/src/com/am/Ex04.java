package com.am;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex03 me = new Ex03();
		Thread thr = new Thread() {
			@Override
			public void run() {
				//멀티 스레드 구동
				System.out.println(getName() +" thread start"); //자기 자신이 Thread라 me.getName()임
				for (int i = 0; i < 10; i++) {
					System.out.println(getName() + " thread i = "+i);
				}
				System.out.println(getName() +" thread end");
			}
		}; 
		thr.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread i = "+i);
		}
		System.out.println("main thread end");
	}
}
