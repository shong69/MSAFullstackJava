package com.pm;
import java.util.Scanner;

public class Ex02 {
	//�л� ���� ���� ���α׷�(ver 0.5.0) - �迭
	//�л� ���� ���� ���α׷�(ver 0.6.0) - String
	//�л� ���� ���� ���α׷�(ver 0.7.0) - Student ��ü 
	
	// 1. ���� 2. �Է� 3. ���� 4. ���� 0. ����>
	//������ �й��� �Է��ϼ���>
	//����>
	//����>
	//����>
	//������ �й��� �Է��ϼ���>
	// 1. ���� 2. �Է� 3. ���� 4. ���� 0. ����>
	static int id=0;
	static int idx1=0;
	static Scanner sc = new Scanner(System.in);
	static int[][] scChart;
	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷�(ver 0.2.0)");

		System.out.print("�ѿ� > ");
		int stuNum = sc.nextInt();
		scChart = new int[stuNum][];
		
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
				if(id<=0) {System.out.println("�����Ͱ� �������� �ʽ��ϴ�."); break;}
				printScore();
				break;
			case 2:
				if(id >= stuNum) {System.out.println("�̹� �ѿ��� �Է��߽��ϴ�."); break;}
				inputScore();
				break;
			case 3:
				if(id<=0) {System.out.println("�����Ͱ� �������� �ʽ��ϴ�."); break;}
				editScore();
				break;
			case 4:
				if(id<=0) {System.out.println("�����Ͱ� �������� �ʽ��ϴ�."); break;}
				deleteScore();
				break;
			default:
				break;
			}
		}
		
	}
	private static void deleteScore() {

		while(true) {
			System.out.print("������ �й��� �Է��ϼ���(0 �Է� �� �ڷΰ���)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input>id || input<=0) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
				continue;
			}
			//�ش� �迭 null�� �ٲٱ�
			scChart[input-1] = null;

			System.out.println("�����Ͱ� �����Ǿ����ϴ�.");
			
		}
		
	}
	private static void editScore() {
		int[] newRow = new int[6];
		int tot = 0;
		while(true) {
			System.out.print("������ �й��� �Է��ϼ���(0 �Է� �� �ڷΰ���)> ");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input>id ||  input<=0) {
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.");
				continue;
			}
			
			if(scChart[input-1] ==null) {//------------------------------
				//������ �������� ���
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.(������ ������)");
				continue;
			}
			//�й��� 1���� �Էµȴ�.
			newRow[0] = input;
			
			System.out.print("����> ");
			int score = sc.nextInt();
			tot += score;
			newRow[1] = score;

			
			System.out.print("����> ");
			score = sc.nextInt();
			tot += score;
			newRow[2] = score;
			
			System.out.print("����> ");
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
		System.out.println("�й�	|����	|����	|����	|�հ�	|���");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < scChart.length; i++) {
			if(scChart[i] == null) { //�迭�� ��ä�� �־����ϱ� null�϶� ����
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
		
		System.out.print("����> ");
		int input = sc.nextInt();
		tot += input;
		row[1] = input;

		System.out.print("����> ");
		input = sc.nextInt();
		tot += input;
		row[2] = input;
		
		System.out.print("����> ");
		input = sc.nextInt();
		tot += input;
		row[3]=input;
		
		row[4]=tot;
		row[5] = tot/3;
		
	}
}
