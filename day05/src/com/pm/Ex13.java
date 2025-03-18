package com.pm;

import java.util.Scanner;

class Student{
	public int language = 0;
	public int english = 0;
	public int math = 0;

	/** �հ� ���ϱ�
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int addSum() {
		return language + english + math;
	}
	
	public Student(int language, int english, int math) {
		super();
		this.language = language;
		this.english = english;
		this.math = math;
	}

	/** ��� ���ϱ�
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public double average() {
		return (double)(language + english + math)/3;
		
		//return (language + english + math)*100/3/100.0; 
		// 100 ���ؼ� �Ҽ��� ù°�ڸ� ������ �츲 + ������ �ؼ� ������ ���������� �ٽ� 100 ������
	}
	
	public char score(double average) {
		if(average >= 90) {
			return 'A';
		}else if(average >= 80) {
			return 'B';
		}else if(average >= 70) {
			return 'C';
		}else if(average >= 60) {
			return 'D';
		}else if(average < 60){
			return 'F';
		}else {
			return 'N';
		}
	}
}

public class Ex13 {

	public static void main(String[] args) {
		//�л� ���� ���� ���α׷�(ver 0.1.0)
		//�л� ������ �Է¹ް� ������ ������ ����Ͻÿ�
		
		//������ �� 3�������� ����, ����, ����
		//�� ������ ������ 100��
		
		//�հ�� ����� ���ϵ�, ����� �Ҽ� �ι�° �ڸ������� ���
		//������ A���� F����
		//A : 90�� �̻�, B: 80�� �̻�, C:70�� �̻�, D:60�� �̻�, F: 60�� �̸�
		
		//�л� ���� ���� ���α׷�(ver 0.1.0)
		// ���� > 90
		// ���� > 78
		// ���� > 89
		// ---------------------------
		// ���� | ���� | ���� | �հ� | ��� | ����		
		// ---------------------------
		// 90   |   78 |  89  | 000  | 00.00|   B
		// ---------------------------
		System.out.println("�л� ���� ���� ���α׷�(ver 0.1.0)");
		Scanner sc = new Scanner(System.in);
		System.out.print("����>");
		int language = sc.nextInt();
		if(language > 100 || language < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		System.out.print("����>");
		int english = sc.nextInt();
		if(english > 100 || english < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		System.out.print("����>");
		int math = sc.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		Student st1 = new Student(language, english,math ); //�Ű����� ������ ���
//		st1.language = language;
//		st1.english = english;
//		st1.math = math;
		
		int addSum = st1.addSum();
		double averageNum = st1.average();
		char score = st1.score(averageNum);
		
		String line = "-------------------------------------------------";
		System.out.printf("%s\n����\t|����\t|����\t|�հ�\t|���\t|����\t\n%s\n",line,line);
		System.out.printf("%d\t|%d\t|%d\t|%d\t|%.2f\t|%c\t\n%s",
				st1.language,st1.english,st1.math,st1.addSum(),st1.average(),st1.score(averageNum),line);
	}
	

}
