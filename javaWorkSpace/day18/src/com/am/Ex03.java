package com.am;

public class Ex03 implements Runnable{
	static Thread thr; //run메소드에서 접근 가능하도록 static
	public static void main(String[] args) {
		System.out.println("main thread start");
		Ex03 me = new Ex03();
		thr = new Thread(me); //Runnable 넣기
		thr.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread i = "+i);
		}
		System.out.println("main thread end");
	}

	@Override
	public void run() {
		System.out.println(thr.getName() +" thread start"); //thr의 getName()으로 구하기
		for (int i = 0; i < 10; i++) {
			System.out.println(thr.getName() + " thread i = "+i);
		}
		System.out.println(thr.getName() +" thread end");
		
	}
}
