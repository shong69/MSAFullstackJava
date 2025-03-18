package com.am;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	static int id = 0;
	static int[][] chart;
	public static void main(String[] args) {
		//학생 성적 관리 프로그램(ver 0.7.0)
		//1.보기 2.입력 3.수정 4.삭제 0.종료>
		//무결성 체크-제약조건 확인(성적, 학번 등)
		//동적 할당
		
		System.out.println("학생 성적 관리 프로그램(ver 0.7.0)");
		System.out.print("총원> ");
		int stuNum = sc.nextInt();
		chart = new int[stuNum][];
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			int input =sc.nextInt();
			switch (input) {
			case 0:
				System.out.println("시스템을 종료합니다.");
				isTrue = false;
				break;
			case 1:
				if(id<=0) {
					System.out.println("데이터가 존재하지 않습니다.");
					break;
				}
				printChart();
				break;
			case 2:
				if(id>=stuNum) {
					System.out.println("이미 총원을 입력했습니다.");
					break;
				}
				inputChart();
				break;
			case 3:
				if(id<=0) {
					System.out.println("데이터가 존재하지 않습니다.");
					break;
				}
				editChart();
				break;
			case 4:
				if(id<=0) {
					System.out.println("데이터가 존재하지 않습니다.");
					break;
				}
				delChart();
				break;
			default:
				break;
			}
		}
	}
	private static void printChart() {
		System.out.println("--------------------------------------------");
		System.out.println("학번 | 국어	|영어	|수학	|합계	|평균");
		System.out.println("--------------------------------------------");
		

		for (int i = 0; i < chart.length; i++) {
			if(chart[i][0]==0) {
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if(j==5) {
					System.out.println(chart[i][j]);
				}
				System.out.print(chart[i][j]+"	|");
				
			}
		}
	}
	private static void inputChart() {
		int[] row = new int[6];
		chart[id] = row;
		int tot = 0;
		row[0] = ++id;
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("국어> ");
			int score = sc.nextInt();
			if(score < 0) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			row[1]= score;
			
			System.out.print("영어");
			score = sc.nextInt();
			if(score < 0) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			row[2] = score;
			
			System.out.print("수학");
			score = sc.nextInt();
			if(score < 0) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			row[3] = score;
			break;
		}

		
		row[4]= tot;
		row[5] = tot/3;
		
	}
	private static void editChart() {
		int[] newRow = new int[6];
		int tot = 0;
		boolean isTrue= true;
		while(isTrue) {
			System.out.print("수정할 학번을 입력하세요> ");
			int input = sc.nextInt();
			if(input<=0) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}
			if(chart[input-1][0]==0) {
				System.out.println("존재하지 않는 학생입니다.");
				continue;
			}
			
			System.out.print("국어> ");
			int score = sc.nextInt();
			tot += score;
			
			
			
		}
	}
	private static void delChart() {
		// TODO Auto-generated method stub
		
	}
}
