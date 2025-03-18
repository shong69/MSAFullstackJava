package com.pm;

import java.util.Scanner;

class Machine {
	public void on() {
		System.out.println("�Ѵ�");
	}
	public void off() {
		System.out.println("����");
	}
	public void work() {
		System.out.println("���⸦ ������ ���� ���̵� �մϴ�");
	}
}
class Tv extends Machine{

	public void work() {
		System.out.println("���ļ��� ��� ȭ���� �����ش�");
	}
}


class Audio extends Machine{

	public void work() {
		System.out.println("������ ����ش�");
	}
}
class Radio extends Machine{
	@Override
	public void work() {
		System.out.println("���ļ��� ��� �Ҹ��� ����ش�");
	}
}
public class Ex04 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
//		Machine remote = new Machine();
//		remote.on();
//		remote.work();
//		remote.off();
		
		//��ü�� ������ ��� �����ϴ��Ŀ� ���� �Ȱ��� ��ɵ� �ٸ��� ������ �� �ִ�.
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
//		if(input == 1) {//�Է°��� ���� remote ��ü�� �´� �ڽ� �����ϵ�����
//			remote2 = new Tv();
//		}else if(input == 2) {
//			remote2 = new Audio();
//		}else if(input == 3) { //�ڽ� ��ü�� ��� �߰��ŵ� �ڵ带 �߰��ϱ⸸ �ϸ� �ȴ�.
//			remote2 = new Radio();
//		}
		System.out.println("Ŭ���� ����"); //com.pm.Tv �Է�
		String input = sc.nextLine();
		remote = (Machine)Class.forName(input).newInstance(); //�������� �ʴ� ��ü �ٷ� ������ �� �ִ�.
		
		remote.on();
		remote.work();
		remote.off();
	}
}
