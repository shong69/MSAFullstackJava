package com.pm;

import java.util.Scanner;

class Student{
	final int num;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(int num) {
		this.num = num;
	}
	
	public void setKor(String kor) {
		this.kor = Integer.parseInt(kor);
	}
	public void setEng(String eng) {
		this.eng = Integer.parseInt(eng);
	}
	public void setMath(String math) {
		this.math = Integer.parseInt(math);
	}
	
	public int total() {
		return kor + eng + math; 
	}
	public double average() {
		return total()*100/3/100.0; //�Ҽ� ��°�ڸ����� ����
	}
}
public class Ex07 {
	public static void main(String[] args) {
		System.out.println("�л������������α׷�(ver 0.8.0)");
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		System.out.print("�ѿ�> ");
		Student[] data = new Student[Integer.parseInt(sc.nextLine())];
		int cnt =0;
		while(true) {
			System.out.println("1.���� 2.�Է� 0.����> ");
			input = sc.nextLine();
			
			if(input.equals("0")) break;
			
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------------");
				System.out.println("�й�	|�̸�	|����	|����	|����	|�հ�	|���");
				System.out.println("--------------------------------------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					System.out.println(stu.num + "\t|"+stu.name+"\t|"+stu.kor+"\t|"+ stu.eng+"\t|"+stu.math+"\t|"+
							stu.total()+"\t|"+stu.average());
				}
			}
			if(input.equals("2")&&cnt<data.length) {
				Student stu = new Student(202500+cnt);
				System.out.print("�̸�>");
				stu.name = sc.nextLine();
				System.out.print("����>");
				input = sc.nextLine();
				stu.setKor(input);
				System.out.print("����>");
				stu.setEng(input);
				input = sc.nextLine();
				System.out.print("����>");
				input = sc.nextLine();
				stu.setMath(input);
				data[cnt++] = stu;
				
			}
		}
	}
}
