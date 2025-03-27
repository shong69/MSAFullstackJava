package com.am;

public class Ex08 extends Thread{
	public Ex08() {
//		super("스레드1");//Thread 클래스의 생성자 상속->스레드이름을 받는 생성자 지정
//		setName("이름"); (super로 생성 생략하고 )Thread에서 스레드 이름을 부여해주는 메서드로 이름 수정
	}
	public static void main(String[] args) {
		Ex08 me = new Ex08();
		Ex08 me2 = new Ex08();
		Ex08 me3 = new Ex08();
		
		//숫자의 격차는 의미가 없다. 
		//max라고 제일 많이 수행하는 거 아니고, norm이라고 적당히 수행하는거 아님
		//상대적으로 크냐 작냐 정도만 따지는 거임 
		me.setPriority(Thread.NORM_PRIORITY);
		me2.setPriority(Thread.MIN_PRIORITY);
		me3.setPriority(Thread.MAX_PRIORITY);
		
		me.start();
		me2.start();
		me3.start();
		
	}
	@Override
	public void run() {
		System.out.println(getName());
		//static 메서드는 객체를 만들때는 non-static이 들어가서 빠지게 된다. 
		//this.getName()을 쓰지 못하게 되기 때문에 이렇게 받아와서 사용하게 되는 것
		Thread thr =Thread.currentThread(); //현재 실행되는 스레드 받기
		System.out.println(thr.getName());
		System.out.println(thr.getId()); //리턴 타입이 숫자
		System.out.println(thr.getState()); //RUNNABLE..
		System.out.println(thr.getName() + " "+thr.getPriority()); //우선순위
		
	}
}
