package com.pm;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		StringBuilder chart =new StringBuilder();
		System.out.println("�л������������α׷�(ver 0.9.0)");
		String input = null;
		
		System.out.print("�ѿ�> ");
		String stuNum = sc.nextLine();
		while(true) {
			System.out.println("1.���� 2.�Է� 0.����> ");
			input = sc.nextLine();
			
			if(input.equals("0"))break;
			if(input.equals("1")) {
				if(id<=0) {
					System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
					continue;
				}
				String[] result = chart.toString().split("\n");
				if(result.length == 0) continue;
				
				System.out.println("--------------------------------------------------------");
				System.out.println("�й�	|�̸�	|����	|����	|����	|�հ�	|���");
				System.out.println("--------------------------------------------------------");
				
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
			}
			if(input.equals("2")) {
				if(Integer.parseInt(stuNum)<=id) {
					System.out.println("�ѿ��� �ʰ��߽��ϴ�.");
					continue;
				}
				int tot = 0;
				chart.append(++id+"\t|");
				
				System.out.print("�̸�> ");
				input = sc.nextLine().trim();
//				System.out.println("�����: [" + input + "]"); // - �ѱ� ����
				chart.append(input).append("\t|"); 
								
				System.out.print("����> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");
				
				System.out.print("����> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");
				
				System.out.print("����> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");

				chart.append(tot+"\t|");
				
				chart.append(tot*100/3/100.0+"\n");
			}
		}
	}
}
