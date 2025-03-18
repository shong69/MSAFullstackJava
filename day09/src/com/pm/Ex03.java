package com.pm;
import java.util.Scanner;

public class Ex03 {
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
	static String scChart="";
	static String[] lines;
	public static void main(String[] args) {
		System.out.println("�л� ���� ���� ���α׷�(ver 0.2.0)");

		System.out.print("�ѿ� > ");
		int stuNum = sc.nextInt();
		lines = new String[stuNum];
		
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
			
			System.out.println(lines[0].split("\t")[0]);
			//�ش� �迭 null�� �ٲٱ�
			for (int i = 0; i < lines.length; i++) {
				if(lines[i].startsWith(input + "\t")) {   //id�� �����ڸ� �̻��� ���� ����ؾ���
					lines[i] = null;
					break;
				}
			}
			
//			//---------------------------------------
//			�ٸ� ���
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

			System.out.println("�����Ͱ� �����Ǿ����ϴ�.");
			
		}
		
	}
	private static void editScore() {
		String newRow = "";
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
			
			if(lines[input-1] ==null) {//------------------------------
				//������ �������� ���
				System.out.println("�������� �ʴ� ��ȣ�Դϴ�.(������ ������)");
				continue;
			}
			
			//�й��� 1���� �Էµȴ�.
			newRow = input + "	|";
			
			System.out.print("����> ");
			int score = sc.nextInt();
			tot += score;
			newRow += score + "	|";
			
			System.out.print("����> ");
			score = sc.nextInt();
			tot += score;
			newRow += score + "	|";
			
			System.out.print("����> ");
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
		System.out.println("�й�	|����	|����	|����	|�հ�	|���");
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
		
		System.out.print("����> ");
		int input = sc.nextInt();
		tot += input;
		line += input + "	|";

		System.out.print("����> ");
		input = sc.nextInt();
		tot += input;
		line += input + "	|";
		
		System.out.print("����> ");
		input = sc.nextInt();
		tot += input;
		line += input + "	|";
		
		line += tot + "	|";
		line += tot/3+"\n";
		
		scChart += line;
		lines = scChart.split("\n"); 

		
	}
}
