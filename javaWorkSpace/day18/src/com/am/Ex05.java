package com.am;

public class Ex05 {
	static Thread thr;
	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex03 me = new Ex03();
		thr = new Thread(new Runnable() {//Runnable를 상속받기
			@Override
			public void run() {
				//멀티 스레드 구동
				System.out.println(thr.getName() +" thread start"); 
								//구현한 Thread객체에게서 .getName()을 구한다
								//Thread 객체가 생성되어야 Runnable이 실행되기 때문에 가능함
				for (int i = 0; i < 10; i++) {
					System.out.println(thr.getName() + " thread i = "+i);
				}
				System.out.println(thr.getName() +" thread end");
				
			}
		}); 
		thr.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread i = "+i);
		}
		System.out.println("main thread end");
	}
}
