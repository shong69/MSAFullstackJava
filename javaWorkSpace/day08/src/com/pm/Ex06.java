package com.pm;

import java.util.Scanner;

/*
 * 학생 성적 관리 프로그램(ver 0.2.0) - 배열
 * 학생 성적 관리 프로그램(ver 0.3.0) - 문자열
 * 
 * 3과목(국어, 영어, 수학)
 * 
 * 총원 > 3
 * 1. 입력 2. 출력 0. 종료 >1
 * 국어 >
 * 영어 >
 * 수학 >
 * 
 * 1. 입력 2. 출력 0. 종료 > 2
 * -----------------------------
 * 학번 | 국어	|영어	|수학	|합계	|평균
 * --------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * 1. 입력 2. 출력 0. 종료 > 2
 * -----------------------------
 * 학번 | 국어	|영어	|수학	|합계	|평균
 * --------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * 1. 입력 2. 출력 0. 종료 > 2
 * -----------------------------
 * 학번 | 국어	|영어	|수학	|합계	|평균
 * -----------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * 한명 입력하면\n 추가하기
 * \n으로 split()해서 배열로 출력하기
 * */
public class Ex06 {
	static Scanner sc = new Scanner(System.in);
	static String scoreLine = "";
	static int id = 1;
	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램(ver 0.3.0)");

		System.out.print("총원 > ");
		int stuNum = sc.nextInt();
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.입력 2.출력 0.종료 > ");
			int input = sc.nextInt();
			
			switch (input) {
			case 0:
				System.out.println("종료합니다.");
				isTrue = false;
				break;
			case 1:
				if(id >stuNum) {
					System.out.println("이미 총원을 입력했습니다.");
					break;
				}
				inputScore();
				break;
			case 2:
				printScore();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

		}
	}
	private static void printScore() {
		String[] scoreLines = scoreLine.split("\n");
		System.out.println("-----------------------------------------------");
		System.out.println("학번	| 국어	|영어	|수학	|합계	|평균");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < scoreLines.length; i++) {
			System.out.println(scoreLines[i]);
		}
		
	}
	private static void inputScore() {
		scoreLine += id++;

		int tot = 0;
		System.out.print("국어>");
		scoreLine += "\t|";
		String langSc = sc.next();
		scoreLine +=langSc;
		
		//합계 구하기
		for (int i = 0; i < langSc.length(); i++) {
			int num = (int) Math.pow(10, langSc.length()-i-1); //곱해야 하는 수
			tot += (langSc.toCharArray()[i]-'0')*num;
		}
		
		
		
		scoreLine += "\t|";
		System.out.print("영어>");
		String engSc = sc.next();
		scoreLine +=engSc;
		
		for (int i = 0; i < engSc.length(); i++) {
			int num = (int) Math.pow(10, engSc.length()-i-1); //곱해야 하는 수
			tot += (engSc.toCharArray()[i]-'0')*num;
		}
		scoreLine += "\t|";
		System.out.print("수학>");
		String mathSc = sc.next(); 
		scoreLine +=mathSc;
		
		for (int i = 0; i < mathSc.length(); i++) {
			int num = (int) Math.pow(10, mathSc.length()-i-1); //곱해야 하는 수
			tot += (mathSc.toCharArray()[i]-'0')*num;
		}

		scoreLine += "\t|";
		scoreLine += tot;
		scoreLine += "\t|";
		scoreLine += tot/3;
		scoreLine += "\n";

	}
	
	//String을 int로 바꿔주는 메서드를 만들기
	public int stringToInt(String msg) {
		
		int cnt = msg.length();
		if(cnt == 3) {
			return (msg.charAt(0)-'0')*100 + (msg.charAt(1)-'0')*10 + (msg.charAt(2)-'0')*1;
		}
		if(cnt == 2) {
			return (msg.charAt(0)-'0')*10 + (msg.charAt(1)-'0')*1;
		}
		if(cnt == 1) {
			return (msg.charAt(0)-'0')*1;
		}
		return 0;
		
		//------------------------------------------------------
//		다른 방법2
//		int cnt2 = msg.length();
//		int su = 1, tot=0;
//		while(true) {
//			tot += (msg.charAt(cnt-1)-'0')*su;
//			su *= 10;
//		if(cnt --<=0) break;
//		}
	}

}
