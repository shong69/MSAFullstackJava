package com.pm;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.7.0)");
		
		int input = 0;
		String[] msg = {"국어","영어","수학"};

		int tot = sc.nextInt();
		int[][] data = new int[0][];
		int cnt = 0;
		while(true) {
			System.out.print("1.보기 2.입력 0.종료 > ");
			
			input = sc.nextInt();
			
			if(input == 0)break;
			if(input == 1) {
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						System.out.print(data[i][j]+"\t");
					}
					System.out.println();
				}
			}
			if(input == 2) {
				int[] stu = new int[3];
				for (int i = 0; i < msg.length; i++) {
					System.out.println(msg[i]+">");
					stu[i] = sc.nextInt();
				}
				int[][] before = data;
				data = new int[data.length+1][];
				System.arraycopy(before, 0, data, 0, before.length); //before에 값 복사
				data[cnt++] = stu;
			}
		}
		
	}
}
