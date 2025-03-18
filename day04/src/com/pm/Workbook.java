package com.pm;

import java.util.Scanner;

public class Workbook {

	public static void main(String[] args) {
		//star2();
		//alp();
		//num();
		//reciept();
		game();

	}
	
	public static void star() {
		for(int i=1;i<5;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
	}
	
	public static void star2() {
		int cnt = 0, limit =1;
		
		for(int i = 0;i<10;i++) {
			cnt++;
			if(cnt<limit) {
				System.out.print("★");
			}else if(cnt == limit) {
				System.out.println("★");
				cnt = 0;
				limit++;
			}
			
		}
	}
	
	//------------------------------------------
	public static void alp() {
		char alp = 'A';
		int cnt = 4;
		for(int i=1;i<=cnt;i++) {
			///cnt -i회만큼 빈칸 반복하고 알파벳
			for(int t =1;t<=cnt-i;t++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				
				System.out.print((char)(alp++));
			}
			System.out.println();
		}
	}
	

	//------------------------------------------
	public static void num() {
		int cnt = 4;
		int num = 1;
		for(int i = 0; i<4; i++) {
			for(int j = 0;j<cnt;j++) {
				
				if(num ==10) System.out.print(0); 
				else	System.out.print(num++);
			}
			System.out.println();
			cnt--;

		}

	}

	//------------------------------------------
	public static void reciept() {
		String line= "---------------------------------";
		System.out.println(line);
		System.out.println("msa영수증\n"+line);
		System.out.print(String.format("%-10s %7s %5s %7s\n%s\n", "상품", "단가","개수","금액",line) );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "지리산물", "1000","1","1000") );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "자갈치", "1200","2","2400") );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "사탕", "500","3","1500") );

		
		
	}
	static int win = 0;
	static int lose=0;
	static int draw =0;
	public static void game() {
		Scanner sc = new Scanner(System.in);
		
		String line= "---------------------------------";
		System.out.println(line);
		System.out.println("가위 바위 보 게임(ver 0.1.0)");
		
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.print("가위(1), 바위(2), 보(3), 종료(0)>");
			int num = sc.nextInt();
			switch (num) {
			case 0:
				System.out.printf("누적승률\n%d 승 %d 무 %d 패\n이용해주셔서 감사합니다.",win,draw,lose);
				isTrue = false; 
				break;
			case 1:
				System.out.println("당신: 가위");
				play(1);
				break;
			case 2:
				System.out.println("당신: 바위");
				play(2);
				break;
			case 3:
				System.out.println("당신: 보");
				play(3);
			default:
				break;
			}
			
			
		}

	}
	//0.1 0.5 0.9
	public static void play(int i) {
	
		int num = (int)(Math.random()*3 )+1;//랜덤 숫자
		if(i>num) {
			win++;
			System.out.println(num);
			System.out.println("이겼습니다."); 
		}else if(i==num) {
			draw++;
			System.out.println(num);
			System.out.println("비겼습니다."); 
		}else if(i<num) {
			lose++;
			System.out.println(num);
			System.out.println("졌습니다."); 
		}



	}
	
}
