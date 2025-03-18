package com.am;

import java.util.Scanner;

class Student{
	public int kor, eng, math, tot;
	public double avg;
	
	public Student(int a, int b, int c) {
		this.kor = a;
		this.eng = b;
		this.math = c;
		
		setTot();
		setAvg();
	}
	public void setTot() {
		this.tot = kor + eng + math;
	}
	public void show() {
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg);
	}
	public void setAvg() {
		avg = tot*100/3/100.0;
	}
}


public class Ex03 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int kor  = userInput("����");
		int eng = userInput("����");
		int math = userInput("����");
		
		Student stu = new Student(kor, eng, math);
		
		System.out.println("--------------------------------------------------");
		System.out.println("����\t����\t����\t�հ�\t���");
		System.out.println("--------------------------------------------------");
		System.out.println(stu.kor + "\t" + stu.eng + "\t" + stu.math + "\t" + stu.tot + "\t" + stu.avg);
		System.out.println("--------------------------------------------------");
		
		
	}
	
	public static int userInput(String msg) {
		System.out.print(msg + "> ");
		return sc.nextInt();
	}
}
