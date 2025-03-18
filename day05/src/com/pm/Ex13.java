package com.pm;

import java.util.Scanner;

class Student{
	public int language = 0;
	public int english = 0;
	public int math = 0;

	/** 합계 구하기
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

	/** 평균 구하기
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public double average() {
		return (double)(language + english + math)/3;
		
		//return (language + english + math)*100/3/100.0; 
		// 100 곱해서 소수점 첫째자리 까지만 살림 + 나누기 해서 나머지 버린다음에 다시 100 나누기
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
		//학생 성적 관리 프로그램(ver 0.1.0)
		//학생 성적을 입력받고 총점과 학점을 출력하시오
		
		//과목은 총 3과목으로 국어, 영어, 수학
		//각 과목의 만점은 100점
		
		//합계와 평균을 구하되, 평균은 소수 두번째 자릿수까지 출력
		//학점은 A부터 F까지
		//A : 90점 이상, B: 80점 이상, C:70점 이상, D:60점 이상, F: 60점 미만
		
		//학생 성적 관리 프로그램(ver 0.1.0)
		// 국어 > 90
		// 영어 > 78
		// 수학 > 89
		// ---------------------------
		// 국어 | 영어 | 수학 | 합계 | 평균 | 학점		
		// ---------------------------
		// 90   |   78 |  89  | 000  | 00.00|   B
		// ---------------------------
		System.out.println("학생 성적 관리 프로그램(ver 0.1.0)");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어>");
		int language = sc.nextInt();
		if(language > 100 || language < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.print("영어>");
		int english = sc.nextInt();
		if(english > 100 || english < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.print("수학>");
		int math = sc.nextInt();
		if(math > 100 || math < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		Student st1 = new Student(language, english,math ); //매개변수 생성자 사용
//		st1.language = language;
//		st1.english = english;
//		st1.math = math;
		
		int addSum = st1.addSum();
		double averageNum = st1.average();
		char score = st1.score(averageNum);
		
		String line = "-------------------------------------------------";
		System.out.printf("%s\n국어\t|영어\t|수학\t|합계\t|평균\t|학점\t\n%s\n",line,line);
		System.out.printf("%d\t|%d\t|%d\t|%d\t|%.2f\t|%c\t\n%s",
				st1.language,st1.english,st1.math,st1.addSum(),st1.average(),st1.score(averageNum),line);
	}
	

}
