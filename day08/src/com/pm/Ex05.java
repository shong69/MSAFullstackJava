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
 * */
public class Ex05 {
	static Scanner sc = new Scanner(System.in);
	static int[][] scoreChart; //�л� ����ŭ ���� �迭�� �ִ� �迭
	static int id = 0;
	
	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷�(ver 0.2.0)");

		System.out.print("�ѿ� > ");
		int stuNum = sc.nextInt();
		scoreChart =  new int[stuNum][6];
		
		for (int i = 0; i < stuNum; i++) {
			for (int j = 0; j < 6; j++) {
				scoreChart[i][j] = 0;
			}
		}
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
				if(id>= stuNum) break;
				inputScore();
				break;
			case 2:
				if(id<=1) System.out.println("����� �������� �ʽ��ϴ�.");
				printScore();
				break;
			case 3:
				editScore();
				break;
			case 4:
				delScore();
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}

		}
	}

	private static void delScore() {
		System.out.print("�й��� �Է����ּ��� >");
		int id = sc.nextInt();
		
		
	}

	private static void editScore() {
		System.out.print("�й��� �Է����ּ��� >");
		int id = sc.nextInt();
		
		
	}

	/**
	 * ����ϱ�
	 */
	private static void printScore() {
		for(int i = 0;i<scoreChart.length;i++) { //id������ �ݺ� Ƚ�� ���� ���� ����
			if(scoreChart[i][0]==0) { 
				break;
			}
			System.out.println("-----------------------------------------------");
			System.out.println("�й�	| ����	|����	|����	|�հ�	|���");
			System.out.println("-----------------------------------------------");
			for (int j = 0; j < 6; j++) {
				if(j==5) System.out.println(scoreChart[i][j]);
				else System.out.print(scoreChart[i][j]+"\t|");
			}
					
		}
		
	}

	/**
	 * �Է��ϱ�
	 */
	private static void inputScore() {
		int[] score = new int[6];
		scoreChart[id]=score;
		
		score[0] = ++id;
		System.out.print("����>");
		int langSc = sc.nextInt();
		score[1] = langSc;
		System.out.print("����>");
		int engSc = sc.nextInt();
		score[2] = engSc;
		System.out.print("����>");
		int mathSc = sc.nextInt();
		score[3] = mathSc;
		
		score[4] = langSc + engSc + mathSc;
		score[5] = score[4]/3;
	}
}
