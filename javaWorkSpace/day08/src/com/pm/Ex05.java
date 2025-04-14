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
 * */
public class Ex05 {
	static Scanner sc = new Scanner(System.in);
	static int[][] scoreChart; //학생 수만큼 성적 배열을 넣는 배열
	static int id = 0;
	
	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램(ver 0.2.0)");

		System.out.print("총원 > ");
		int stuNum = sc.nextInt();
		scoreChart =  new int[stuNum][6];
		
		for (int i = 0; i < stuNum; i++) {
			for (int j = 0; j < 6; j++) {
				scoreChart[i][j] = 0;
			}
		}
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
				if(id>= stuNum) break;
				inputScore();
				break;
			case 2:
				if(id<=1) System.out.println("기록이 존재하지 않습니다.");
				printScore();
				break;
			case 3:
				editScore();
				break;
			case 4:
				delScore();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

		}
	}

	private static void delScore() {
		System.out.print("학번을 입력해주세요 >");
		int id = sc.nextInt();
		
		
	}

	private static void editScore() {
		System.out.print("학번을 입력해주세요 >");
		int id = sc.nextInt();
		
		
	}

	/**
	 * 출력하기
	 */
	private static void printScore() {
		for(int i = 0;i<scoreChart.length;i++) { //id값으로 반복 횟수 정할 수도 있음
			if(scoreChart[i][0]==0) { 
				break;
			}
			System.out.println("-----------------------------------------------");
			System.out.println("학번	| 국어	|영어	|수학	|합계	|평균");
			System.out.println("-----------------------------------------------");
			for (int j = 0; j < 6; j++) {
				if(j==5) System.out.println(scoreChart[i][j]);
				else System.out.print(scoreChart[i][j]+"\t|");
			}
					
		}
		
	}

	/**
	 * 입력하기
	 */
	private static void inputScore() {
		int[] score = new int[6];
		scoreChart[id]=score;
		
		score[0] = ++id;
		System.out.print("국어>");
		int langSc = sc.nextInt();
		score[1] = langSc;
		System.out.print("영어>");
		int engSc = sc.nextInt();
		score[2] = engSc;
		System.out.print("수학>");
		int mathSc = sc.nextInt();
		score[3] = mathSc;
		
		score[4] = langSc + engSc + mathSc;
		score[5] = score[4]/3;
	}
}
