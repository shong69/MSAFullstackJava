package com.pm;
import java.util.Scanner;

public class Ex02 {
	//학생 성적 관리 프로그램(ver 0.5.0) - 배열
	//학생 성적 관리 프로그램(ver 0.6.0) - String
	//학생 성적 관리 프로그램(ver 0.7.0) - Student 객체 
	
	// 1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료>
	//수정할 학번을 입력하세요>
	//국어>
	//영어>
	//수학>
	//삭제할 학번을 입력하세요>
	// 1. 보기 2. 입력 3. 수정 4. 삭제 0. 종료>
	static int id=0;
	static int idx1=0;
	static Scanner sc = new Scanner(System.in);
	static int[][] scChart;
	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램(ver 0.2.0)");

		System.out.print("총원 > ");
		int stuNum = sc.nextInt();
		scChart = new int[stuNum][];
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				System.out.println("프로그램이 종료됩니다.");
				isTrue = false;
				break;
			case 1:
				if(id<=0) {System.out.println("데이터가 존재하지 않습니다."); break;}
				printScore();
				break;
			case 2:
				if(id >= stuNum) {System.out.println("이미 총원을 입력했습니다."); break;}
				inputScore();
				break;
			case 3:
				if(id<=0) {System.out.println("데이터가 존재하지 않습니다."); break;}
				editScore();
				break;
			case 4:
				if(id<=0) {System.out.println("데이터가 존재하지 않습니다."); break;}
				deleteScore();
				break;
			default:
				break;
			}
		}
		
	}
	private static void deleteScore() {

		while(true) {
			System.out.print("삭제할 학번을 입력하세요(0 입력 시 뒤로가기)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input>id || input<=0) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}
			//해당 배열 null로 바꾸기
			scChart[input-1] = null;

			System.out.println("데이터가 삭제되었습니다.");
			
		}
		
	}
	private static void editScore() {
		int[] newRow = new int[6];
		int tot = 0;
		while(true) {
			System.out.print("수정할 학번을 입력하세요(0 입력 시 뒤로가기)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input>id ||  input<=0) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}
			
			if(scChart[input-1] ==null) {//------------------------------
				//삭제된 데이터인 경우
				System.out.println("존재하지 않는 번호입니다.(삭제된 데이터)");
				continue;
			}
			//학번은 1부터 입력된다.
			newRow[0] = input;
			
			System.out.print("국어> ");
			int score = sc.nextInt();
			tot += score;
			newRow[1] = score;

			
			System.out.print("영어> ");
			score = sc.nextInt();
			tot += score;
			newRow[2] = score;
			
			System.out.print("수학> ");
			score = sc.nextInt();
			tot += score;
			newRow[3] = score;
			
			newRow[4] = tot;
			newRow[5] = tot/3;
			
			scChart[input-1] = newRow;
			break;
			
		}
		
	}
	private static void printScore() {
		System.out.println("------------------------------------------------");
		System.out.println("학번	|국어	|영어	|수학	|합계	|평균");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < scChart.length; i++) {
			if(scChart[i] == null) { //배열을 안채워 넣었으니까 null일때 멈춤
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if(j == 5) {
					System.out.println(scChart[i][j]);
				}else {
					System.out.print(scChart[i][j]+"	|");
				}
			}
		}
		
	}
	private static void inputScore() {
		int[] row = new int[6];
		scChart[idx1++] = row;
		row[0] = ++id;
		System.out.println("id = "+id);
		int tot = 0;
		
		System.out.print("국어> ");
		int input = sc.nextInt();
		tot += input;
		row[1] = input;

		System.out.print("영어> ");
		input = sc.nextInt();
		tot += input;
		row[2] = input;
		
		System.out.print("수학> ");
		input = sc.nextInt();
		tot += input;
		row[3]=input;
		
		row[4]=tot;
		row[5] = tot/3;
		
	}
}
