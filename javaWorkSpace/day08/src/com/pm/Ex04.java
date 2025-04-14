package com.pm;

import java.util.Scanner;

class Machine {
	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	public void work() {
		System.out.println("전기를 가지고 무슨 일이든 합니다");
	}
}
class Tv extends Machine{

	public void work() {
		System.out.println("주파수를 잡아 화면을 보여준다");
	}
}


class Audio extends Machine{

	public void work() {
		System.out.println("음악을 들려준다");
	}
}
class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("주파수를 잡아 소리를 들려준다");
	}
}
public class Ex04 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
//		Machine remote = new Machine();
//		remote.on();
//		remote.work();
//		remote.off();
		
		//객체를 생성해 어떤걸 대입하느냐에 따라 똑같은 명령도 다르게 수행할 수 있다.
		Machine remote;
		//Machine tv = new Tv();
		remote = new Tv();
		remote.on();
		remote.work();
		remote.off();
		//Machine audio = new Audio(); 
		remote = new Audio();
		remote.on();
		remote.work();
		remote.off();
		
		
		Scanner sc = new Scanner(System.in);
		Machine remote2 = null;
//		System.out.println("1.Tv 2.audio 3.radio >"); 
//		int input = sc.nextInt();
//		if(input == 1) {//입력값에 따라 remote 객체에 맞는 자식 대입하도록함
//			remote2 = new Tv();
//		}else if(input == 2) {
//			remote2 = new Audio();
//		}else if(input == 3) { //자식 객체가 계속 추가돼도 코드를 추가하기만 하면 된다.
//			remote2 = new Radio();
//		}
		System.out.println("클래스 정보"); //com.pm.Tv 입력
		String input = sc.nextLine();
		remote = (Machine)Class.forName(input).newInstance(); //존재하지 않는 객체 바로 생성할 수 있다.
		
		remote.on();
		remote.work();
		remote.off();
	}
}
