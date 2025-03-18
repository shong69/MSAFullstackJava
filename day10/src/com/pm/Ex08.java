package com.pm;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 0;
		StringBuilder chart =new StringBuilder();
		System.out.println("학생성적관리프로그램(ver 0.9.0)");
		String input = null;
		
		System.out.print("총원> ");
		String stuNum = sc.nextLine();
		while(true) {
			System.out.println("1.보기 2.입력 0.종료> ");
			input = sc.nextLine();
			
			if(input.equals("0"))break;
			if(input.equals("1")) {
				if(id<=0) {
					System.out.println("데이터가 존재하지 않습니다.");
					continue;
				}
				String[] result = chart.toString().split("\n");
				if(result.length == 0) continue;
				
				System.out.println("--------------------------------------------------------");
				System.out.println("학번	|이름	|국어	|영어	|수학	|합계	|평균");
				System.out.println("--------------------------------------------------------");
				
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
			}
			if(input.equals("2")) {
				if(Integer.parseInt(stuNum)<=id) {
					System.out.println("총원을 초과했습니다.");
					continue;
				}
				int tot = 0;
				chart.append(++id+"\t|");
				
				System.out.print("이름> ");
				input = sc.nextLine().trim();
//				System.out.println("디버깅: [" + input + "]"); // - 한글 오류
				chart.append(input).append("\t|"); 
								
				System.out.print("국어> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");
				
				System.out.print("영어> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");
				
				System.out.print("수학> ");
				input = sc.nextLine();
				tot += Integer.parseInt(input);
				chart.append(input+"\t|");

				chart.append(tot+"\t|");
				
				chart.append(tot*100/3/100.0+"\n");
			}
		}
	}
}
