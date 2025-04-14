package com.pm;
import java.util.Scanner;

public class Ex03 {
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
	static String scChart="";
	static String[] lines;
	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램(ver 0.2.0)");

		System.out.print("총원 > ");
		int stuNum = sc.nextInt();
		lines = new String[stuNum];
		
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
			
			System.out.println(lines[0].split("\t")[0]);
			//해당 배열 null로 바꾸기
			for (int i = 0; i < lines.length; i++) {
				if(lines[i].startsWith(input + "\t")) {   //id가 십의자리 이상일 때도 고려해야함
					lines[i] = null;
					break;
				}
			}
			
//			//---------------------------------------
//			다른 방법
//			int begin = -1;
//			int end = -1;
//			if(scChart.startsWith(input+"\t")) {
//				begin = 0;
//			}else {
//				begin = scChart.indexOf("\n",begin + 1);
//			}
//			///
//			end = scChart.indexOf("\n",begin+1);
//			String target = scChart.substring(begin, end+1);
//			scChart = scChart.replace(target, "");
//			//---------------------------------------

			System.out.println("데이터가 삭제되었습니다.");
			
		}
		
	}
	private static void editScore() {
		String newRow = "";
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
			
			if(lines[input-1] ==null) {//------------------------------
				//삭제된 데이터인 경우
				System.out.println("존재하지 않는 번호입니다.(삭제된 데이터)");
				continue;
			}
			
			//학번은 1부터 입력된다.
			newRow = input + "	|";
			
			System.out.print("국어> ");
			int score = sc.nextInt();
			tot += score;
			newRow += score + "	|";
			
			System.out.print("영어> ");
			score = sc.nextInt();
			tot += score;
			newRow += score + "	|";
			
			System.out.print("수학> ");
			score = sc.nextInt();
			tot += score;
			newRow += score + "	|";
			
			newRow += tot + "	|";
			
			newRow += tot/3;
			
			lines[input-1] = newRow;
			break;
			
		}
		
	}
	private static void printScore() {
		System.out.println("------------------------------------------------");
		System.out.println("학번	|국어	|영어	|수학	|합계	|평균");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < lines.length; i++) {
			if(lines[i] == null) {
				continue;
			}
			System.out.println(lines[i]);
		}
		
	}
	private static void inputScore() {

		String line = "";
		line += ++id + "	|";
		int tot = 0;
		
		System.out.print("국어> ");
		int input = sc.nextInt();
		tot += input;
		line += input + "	|";

		System.out.print("영어> ");
		input = sc.nextInt();
		tot += input;
		line += input + "	|";
		
		System.out.print("수학> ");
		input = sc.nextInt();
		tot += input;
		line += input + "	|";
		
		line += tot + "	|";
		line += tot/3+"\n";
		
		scChart += line;
		lines = scChart.split("\n"); 

		
	}
}
