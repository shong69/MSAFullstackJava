package com.am;

import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	static int id = 0;
	static int[][] chart;
	public static void main(String[] args) {
		//�л� ���� ���� ���α׷�(ver 0.7.0)
		//1.���� 2.�Է� 3.���� 4.���� 0.����>
		//���Ἲ üũ-�������� Ȯ��(����, �й� ��)
		//���� �Ҵ�
		
		System.out.println("�л� ���� ���� ���α׷�(ver 0.7.0)");
		System.out.print("�ѿ�> ");
		int stuNum = sc.nextInt();
		chart = new int[stuNum][];
		
		boolean isTrue = true;
		while(isTrue) {
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����> ");
			int input =sc.nextInt();
			switch (input) {
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				isTrue = false;
				break;
			case 1:
				if(id<=0) {
					System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
					break;
				}
				printChart();
				break;
			case 2:
				if(id>=stuNum) {
					System.out.println("�̹� �ѿ��� �Է��߽��ϴ�.");
					break;
				}
				inputChart();
				break;
			case 3:
				if(id<=0) {
					System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
					break;
				}
				editChart();
				break;
			case 4:
				if(id<=0) {
					System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
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
		System.out.println("�й� | ����	|����	|����	|�հ�	|���");
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
			System.out.print("����> ");
			int score = sc.nextInt();
			if(score < 0) {
				System.out.println("������ �Է��� �ּ���.");
				continue;
			}
			row[1]= score;
			
			System.out.print("����");
			score = sc.nextInt();
			if(score < 0) {
				System.out.println("������ �Է��� �ּ���.");
				continue;
			}
			row[2] = score;
			
			System.out.print("����");
			score = sc.nextInt();
			if(score < 0) {
				System.out.println("������ �Է��� �ּ���.");
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
			System.out.print("������ �й��� �Է��ϼ���> ");
			int input = sc.nextInt();
			if(input<=0) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
				continue;
			}
			if(chart[input-1][0]==0) {
				System.out.println("�������� �ʴ� �л��Դϴ�.");
				continue;
			}
			
			System.out.print("����> ");
			int score = sc.nextInt();
			tot += score;
			
			
			
		}
	}
	private static void delChart() {
		// TODO Auto-generated method stub
		
	}
}
