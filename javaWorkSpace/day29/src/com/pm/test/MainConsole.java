package com.pm.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainConsole {
	//학번은 20250001부터 시작
	//합계 내림차순으로 출력
	static Scanner sc = new Scanner(System.in);
	
	static int idNum = 20250001;
	static List<Student> stuList = new ArrayList<>();
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.20.0)");
		
		boolean isOn = true;
		while(isOn) {
			System.out.print("1.목록 2.랭킹 3.입력 4.수정 5.삭제 0.종료> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				isOn = false;
				System.out.println("프로그램이 종료됩니다.");
				break;
			case 1:
				System.out.println("학번\t\t|국어\t|영어\t|수학");
				for(Student stu:stuList) {
					if(stu.isDel()==false) {
						System.out.printf("%d\t|%d\t|%d\t|%d\n",stu.getId(),stu.getLang(),stu.getEng(),stu.getMath());				
					}
				}
				break;
			case 2:
				List<Student> list= new ArrayList<>();
				for (int i = 0; i < stuList.size(); i++) {
					list.add(stuList.get(i));
				}
				Collections.sort(list);				
				System.out.println("학번\t\t|합계 \t|평균\t|순위");
				int rank = 1;
				for(Student stu:list) {
					if(stu.isDel()==false) {						
						System.out.printf("%d\t|%d\t|%d\t|%d위\n",stu.getId(),stu.getTotalScore(),stu.getAvgScore(),rank++);
					}
				}
				break;
			case 3:
				inputScore();
				break;
			case 4:
				editScore();
				break;
			case 5:
				delScore();
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}
	private static void delScore() {
		System.out.print("학번> ");
		int id = sc.nextInt();
		boolean isExist = false;
		for (int i = 0; i < stuList.size(); i++) {
			isExist = true;
			if(stuList.get(i).getId() == id&&stuList.get(i).isDel()==false) {
				stuList.get(i).setDel(true);
			}
		}
		if(isExist==false) {
			System.out.println("존재하지 않는 학번입니다.");
		}
	}
	private static void editScore() {
		System.out.print("학번> ");
		int id = sc.nextInt();
		
		System.out.print("국어> ");
		int lang = sc.nextInt();
		System.out.print("영어> ");
		int eng = sc.nextInt();
		System.out.print("수학> ");
		int math = sc.nextInt();
		boolean isExist = false;
		for (int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getId()==id&&stuList.get(i).isDel()==false) {
				isExist = true;
				stuList.get(i).setLang(lang);
				stuList.get(i).setEng(eng);
				stuList.get(i).setMath(math);
				stuList.get(i).setAvgScore((lang+eng+math)/3);
				stuList.get(i).setTotalScore(lang+eng+math);
			}
		}
		if(isExist==false) {
			System.out.println("존재하지 않는 학번입니다.");
		}
	}
	private static void inputScore() {
		System.out.print("국어> ");
		int lang = sc.nextInt();
		System.out.print("영어> ");
		int eng = sc.nextInt();
		System.out.print("수학> ");
		int math = sc.nextInt();
		
		Student stu = new Student(idNum++, lang, eng, math);
		stuList.add(stu);		
	}

	
	
}
