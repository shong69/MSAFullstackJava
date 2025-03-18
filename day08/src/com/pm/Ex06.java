package com.pm;

import java.util.Scanner;

/*
 * �л� ���� ���� ���α׷�(ver 0.2.0) - �迭
 * �л� ���� ���� ���α׷�(ver 0.3.0) - ���ڿ�
 * 
 * 3����(����, ����, ����)
 * 
 * �ѿ� > 3
 * 1. �Է� 2. ��� 0. ���� >1
 * ���� >
 * ���� >
 * ���� >
 * 
 * 1. �Է� 2. ��� 0. ���� > 2
 * -----------------------------
 * �й� | ����	|����	|����	|�հ�	|���
 * --------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * 1. �Է� 2. ��� 0. ���� > 2
 * -----------------------------
 * �й� | ����	|����	|����	|�հ�	|���
 * --------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * 1. �Է� 2. ��� 0. ���� > 2
 * -----------------------------
 * �й� | ����	|����	|����	|�հ�	|���
 * -----------------------------------------------
 * 1	|90		|91		|92		|00		|00
 * 
 * �Ѹ� �Է��ϸ�\n �߰��ϱ�
 * \n���� split()�ؼ� �迭�� ����ϱ�
 * */
public class Ex06 {
	static Scanner sc = new Scanner(System.in);
	static String scoreLine = "";
	static int id = 1;
	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷�(ver 0.3.0)");

		System.out.print("�ѿ� > ");
		int stuNum = sc.nextInt();
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.�Է� 2.��� 0.���� > ");
			int input = sc.nextInt();
			
			switch (input) {
			case 0:
				System.out.println("�����մϴ�.");
				isTrue = false;
				break;
			case 1:
				if(id >stuNum) {
					System.out.println("�̹� �ѿ��� �Է��߽��ϴ�.");
					break;
				}
				inputScore();
				break;
			case 2:
				printScore();
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}

		}
	}
	private static void printScore() {
		String[] scoreLines = scoreLine.split("\n");
		System.out.println("-----------------------------------------------");
		System.out.println("�й�	| ����	|����	|����	|�հ�	|���");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < scoreLines.length; i++) {
			System.out.println(scoreLines[i]);
		}
		
	}
	private static void inputScore() {
		scoreLine += id++;

		int tot = 0;
		System.out.print("����>");
		scoreLine += "\t|";
		String langSc = sc.next();
		scoreLine +=langSc;
		
		//�հ� ���ϱ�
		for (int i = 0; i < langSc.length(); i++) {
			int num = (int) Math.pow(10, langSc.length()-i-1); //���ؾ� �ϴ� ��
			tot += (langSc.toCharArray()[i]-'0')*num;
		}
		
		
		
		scoreLine += "\t|";
		System.out.print("����>");
		String engSc = sc.next();
		scoreLine +=engSc;
		
		for (int i = 0; i < engSc.length(); i++) {
			int num = (int) Math.pow(10, engSc.length()-i-1); //���ؾ� �ϴ� ��
			tot += (engSc.toCharArray()[i]-'0')*num;
		}
		scoreLine += "\t|";
		System.out.print("����>");
		String mathSc = sc.next(); 
		scoreLine +=mathSc;
		
		for (int i = 0; i < mathSc.length(); i++) {
			int num = (int) Math.pow(10, mathSc.length()-i-1); //���ؾ� �ϴ� ��
			tot += (mathSc.toCharArray()[i]-'0')*num;
		}

		scoreLine += "\t|";
		scoreLine += tot;
		scoreLine += "\t|";
		scoreLine += tot/3;
		scoreLine += "\n";

	}
	
	//String�� int�� �ٲ��ִ� �޼��带 �����
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
//		�ٸ� ���2
//		int cnt2 = msg.length();
//		int su = 1, tot=0;
//		while(true) {
//			tot += (msg.charAt(cnt-1)-'0')*su;
//			su *= 10;
//		if(cnt --<=0) break;
//		}
	}

}
