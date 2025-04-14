package com.am;
//1. 상속을 통해서 사용을 하도록 강조
abstract class Machine{
	public void on() {System.out.println("켜다");}
	public void off() {System.out.println("끄다");}
	public abstract void work();
}
class Tv extends Machine{
	@Override
	public void work() {
		System.out.println("화면을 보여주다");
	}
}
class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("소리를 들려주다");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Machine remote = new Tv();
		
		remote.on();
		remote.work();
		remote.off();
		
	}
}
