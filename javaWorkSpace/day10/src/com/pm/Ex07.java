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
		return total()*100/3/100.0; //소수 둘째자리까지 리턴
	}
}
public class Ex07 {
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		System.out.print("총원> ");
		Student[] data = new Student[Integer.parseInt(sc.nextLine())];
		int cnt =0;
		while(true) {
			System.out.println("1.보기 2.입력 0.종료> ");
			input = sc.nextLine();
			
			if(input.equals("0")) break;
			
			if(input.equals("1")) {
				System.out.println("--------------------------------------------------------");
				System.out.println("학번	|이름	|국어	|영어	|수학	|합계	|평균");
				System.out.println("--------------------------------------------------------");
				for (int i = 0; i < data.length; i++) {
					Student stu = data[i];
					System.out.println(stu.num + "\t|"+stu.name+"\t|"+stu.kor+"\t|"+ stu.eng+"\t|"+stu.math+"\t|"+
							stu.total()+"\t|"+stu.average());
				}
			}
			if(input.equals("2")&&cnt<data.length) {
				Student stu = new Student(202500+cnt);
				System.out.print("이름>");
				stu.name = sc.nextLine();
				System.out.print("국어>");
				input = sc.nextLine();
				stu.setKor(input);
				System.out.print("영어>");
				stu.setEng(input);
				input = sc.nextLine();
				System.out.print("수학>");
				input = sc.nextLine();
				stu.setMath(input);
				data[cnt++] = stu;
				
			}
		}
	}
}
