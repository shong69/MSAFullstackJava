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

	 //�����ü �迭 �����
	static Member[] team;
	static int idx = 0;
	static Scanner sc = new Scanner(System.in);
	static int stuNum = 0;
	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷�(ver 0.2.0)");

		System.out.print("�ѿ� > ");
		stuNum = sc.nextInt();
		team = new Member[stuNum];
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 0:
				System.out.println("���α׷��� ����˴ϴ�.");
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
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		while(true) {
			System.out.print("������ �й��� �Է��ϼ���(0 �Է� �� �ڷΰ���)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input<0) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
				continue;
			}
			
			//�����ϱ�
			boolean exist = false;
			int idx = 0;
			for(Member mem : team) {
				if(mem.getId() == input) {
					exist = true;
					team[idx] = null;
					System.out.println("�����Ͱ� �����Ǿ����ϴ�.");
				}
				idx++;
			}
		
			if(!exist) {//�̹� ������ ������ 
				System.out.println("�������� �ʴ� �������Դϴ�.");
			}
			
			
		}	
		
	}

	private static void editMember() {
		if(team.length == 0) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		
		int tot = 0;
		while(true) {
			System.out.print("������ �й��� �Է����ּ���(0 �Է� �� �ڷΰ���)> ");
			int input = sc.nextInt();
			if(input < 0 ) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
				continue;
			}else if(input == 0) {
				break;
			}
			//��� �迭���� id �˻�
			boolean exist = false;
			for(Member mem : team) {
				if(mem.getId() == input) {
					exist = true;
					System.out.print("����>");
					int score = sc.nextInt();
					tot += score;
					mem.setLang(score);
					
					System.out.print("����>");
					score = sc.nextInt();
					tot += score;
					mem.setEng(score);
					
					System.out.print("����>");
					score = sc.nextInt();
					tot += score;
					mem.setMath(score);
					
					mem.setTotal(tot);
					mem.setAverage(tot/3);
					
				}
			}
			if(!exist) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.(������ ������)");
			}
			
		}

	}

	private static void inputMember() {
		//�ѿ���ŭ �����ߴ��� Ȯ��
		if(idx+1> stuNum) {
			System.out.println("�̹� �ѿ��� �Է��߽��ϴ�.");
			return;
		}
		
		System.out.print("����> ");
		int lang = sc.nextInt();
		
		System.out.print("����> ");
		int eng = sc.nextInt();
		
		System.out.print("����> ");
		int math = sc.nextInt();
		
		Member mem = new Member(lang, eng, math);
		System.out.println(mem.getId());
		team[idx++] = mem;
		
	}

	private static void printTeam() {
		if(team.length == 0) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		
		//����� �����ϴ��� �ݺ������� Ȯ���ϸ鼭
		//toString���� ���پ� ��������
		System.out.println("------------------------------------------------");
		System.out.println("�й�	|����	|����	|����	|�հ�	|���");
		System.out.println("------------------------------------------------");
		for(Member mem : team) {
			if(mem != null) {
				System.out.println(mem.toString());
			}
		}
	}
}
