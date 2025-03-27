package com.am;

public class Ex07 implements Runnable{
	public static void main(String[] args) {
		Ex07 me = new Ex07();
		Thread thr1 = new Thread(me);
//		Thread thr2 = new Thread(me);
		Thread thr2 = new Thread(new Runnable() { //다른 일을 하고 싶을 때 새로 구현
			@Override
			public void run() {
				Thread thr = Thread.currentThread();
				System.out.println(thr.getName() +" thread start"); 
				for (int i = 0; i < 100; i++) {
					System.out.println(thr.getName() + " thread i = "+i);
				}
				System.out.println(thr.getName() +" thread end");
				
			}
		});
		thr1.start();
		thr2.start();
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();//가장 최근의 스레드를 받아 getName()하기
		System.out.println(thr.getName() +" thread start"); 
		for (int i = 0; i < 10; i++) {
			System.out.println(thr.getName() + " thread i = "+i);
		}
		System.out.println(thr.getName() +" thread end");
		
	}
}
