package com.pm;

import java.util.Scanner;
class Member{
	private static int nextId=1;
	private int id;
	private int lang;
	private int eng;
	private int math;
	private int total;
	private int average;
	public Member( int lang, int eng, int math) {
		super();
		this.id =nextId++;
		this.lang = lang;
		this.eng = eng;
		this.math = math;
		this.total = lang + eng + math;
		this.average = (lang + eng + math)/3;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	@Override
	public String toString() {
		return id + "	|" + lang + "	|" + eng + "	|" + math + "	|" + total + "	|" + average;
	}

	public void edit() {
		
	}
	public void delete() {
		
	}
	
}
public class Ex04 {

	 //멤버객체 배열 만들기
	static Member[] team;
	static int idx = 0;
	static Scanner sc = new Scanner(System.in);
	static int stuNum = 0;
	public static void main(String[] args) {
		System.out.println("학생 성적 관리 프로그램(ver 0.2.0)");

		System.out.print("총원 > ");
		stuNum = sc.nextInt();
		team = new Member[stuNum];
		
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
				printTeam();
				break;
			case 2:
				inputMember();
				break;
			case 3:
				editMember();
				break;
			case 4:
				deleteMember();
				break;
			default:
				break;
			}
		}
	}

	private static void deleteMember() {
		if(team.length == 0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		while(true) {
			System.out.print("삭제할 학번을 입력하세요(0 입력 시 뒤로가기)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input<0) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}
			
			//삭제하기
			boolean exist = false;
			int idx = 0;
			for(Member mem : team) {
				if(mem.getId() == input) {
					exist = true;
					team[idx] = null;
					System.out.println("데이터가 삭제되었습니다.");
				}
				idx++;
			}
		
			if(!exist) {//이미 삭제된 데이터 
				System.out.println("존재하지 않는 데이터입니다.");
			}
			
			
		}	
		
	}

	private static void editMember() {
		if(team.length == 0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		
		int tot = 0;
		while(true) {
			System.out.print("수정할 학번을 입력해주세요(0 입력 시 뒤로가기)> ");
			int input = sc.nextInt();
			if(input < 0 ) {
				System.out.println("존재하지 않는 번호입니다.");
				continue;
			}else if(input == 0) {
				break;
			}
			//멤버 배열에서 id 검색
			boolean exist = false;
			for(Member mem : team) {
				if(mem.getId() == input) {
					exist = true;
					System.out.print("국어>");
					int score = sc.nextInt();
					tot += score;
					mem.setLang(score);
					
					System.out.print("영어>");
					score = sc.nextInt();
					tot += score;
					mem.setEng(score);
					
					System.out.print("수학>");
					score = sc.nextInt();
					tot += score;
					mem.setMath(score);
					
					mem.setTotal(tot);
					mem.setAverage(tot/3);
					
				}
			}
			if(!exist) {
				System.out.println("존재하지 않는 번호입니다.(삭제된 데이터)");
			}
			
		}

	}

	private static void inputMember() {
		//총원만큼 생성했는지 확인
		if(idx+1> stuNum) {
			System.out.println("이미 총원을 입력했습니다.");
			return;
		}
		
		System.out.print("국어> ");
		int lang = sc.nextInt();
		
		System.out.print("영어> ");
		int eng = sc.nextInt();
		
		System.out.print("수학> ");
		int math = sc.nextInt();
		
		Member mem = new Member(lang, eng, math);
		System.out.println(mem.getId());
		team[idx++] = mem;
		
	}

	private static void printTeam() {
		if(team.length == 0) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		
		//멤버가 존재하는지 반복문으로 확인하면서
		//toString으로 한줄씩 내보내기
		System.out.println("------------------------------------------------");
		System.out.println("학번	|국어	|영어	|수학	|합계	|평균");
		System.out.println("------------------------------------------------");
		for(Member mem : team) {
			if(mem != null) {
				System.out.println(mem.toString());
			}
		}
	}
}
