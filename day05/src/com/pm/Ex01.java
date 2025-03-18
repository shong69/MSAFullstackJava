package com.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//gugudan();
		//alp();
		game();

	}
	
	/** - 변수 2개와 while문 하나로 풀어보기
	 * NX1...9단까지 하고 N++; + 줄바꿈
	 * N이 9가 되면 반복문 종료 
	 */
	public static void gugudan() {
		int alpA = 2;
		int alpB = 1;
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.printf("%d X %d = %d\t",alpA,alpB, alpA*alpB);
			if(alpA == 9) {
				System.out.println();
				alpA = 1;
				alpB++;
			}
			alpA++;
			
			if(alpB == 10) { // 이전 if문에서 alpB++를 하기 때문에 9번째 반복할 때 바로 10이 됨 -> alpB가 10일때 종료
				isTrue = false;
			}
			
			
		}
	}
	
	
	/** - while문 하나와 변수 3개로 풀기
	 * 3번 반복횟수를 세는 i, 출력 개수를 세는 j, 출력개수를 비교하는 count
	 * 출력개수 j++를 해서 count와 같으면 count++, i++하고 다음줄 시작하도록
	 */
	public static void alp() {
		
		char alp = 'A';
		int temp = 0;
//		int i;
//		for( i = 0;i<=3;i++) {
//			System.out.print((char)(alp++));
//			System.out.printf("  i는 %d  ",i);
//			System.out.printf("temp는 %d  ",temp);
//
//			if(temp == i) { 
//				i=0;
//				System.out.printf("i는 %d",i);
//				temp++;
//				System.out.println();
//				continue;
//			}
//			
//		}
		
		int i = 0; //줄 수
		int j = 0; //현재 출력 개수
		int count = 1;
		while(i<=3) {
			System.out.print(alp++);
			j++;
			if(count== j) { 
				j=0;
				count++;
				System.out.println();
				i++;
			}

		}
		
	}
	
	
	/** 승, 무, 패 변수를 static 으로 메서드 밖에 선언 -> 메서드에서 전역변수로 사용할 수 있도록 한다.
	 * match1() : numCha()를 호출해 나와 컴퓨터의 값을 출력하고 match2() 호출
	 * numCha() : 입력한 수를 가위, 바위, 보로 변경
	 * match2() : 누가 이겼는지 매치하고 승부 결과 출력
	 */
	
	static int win = 0, lose = 0, draw = 0;
	public static void game() {
		String line = "---------------------------------------";
		System.out.println(line+"\n가위 바위 보 게임(ver 0.1.0\n"+line);
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean on = true;
		while(on) {
			System.out.print("가위(1), 바위(2), 보(3), 종료(0) >");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.printf("누적 승률\n%d승 %d무 %d패\n이용해주셔서 감사합니다.", win, draw, lose);
				on = false;
			}else if(num == 1) {
				match1(1);
			}else if(num == 2) {
				match1(2);
			}else if(num == 3) {
				match1(3);
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
		
		/** 나와 컴퓨터의 값을 출력
		 * @param num
		 */
		public static void match1(int num) {
			int comNo = (int)(Math.random()*3 + 1);
			String user = numCha(num);
			String com = numCha(comNo);
			System.out.printf("당신 : %s\t컴퓨터 : %s\n",user, com);
			
			match2(num, comNo);
		}
	
		public static String numCha(int num) {
			String gamer = null;
			switch (num) {
			case 1:
				gamer = "가위";
				break;
			case 2:
				gamer = "바위";
				break;
				
			case 3:
				gamer = "보";
				break;
			default:
				break;

			}
			return gamer;
		
		}
		
		/** 승부 결과를 출력
		 * @param userNo
		 * @param comNo
		 */
		public static void match2(int userNo, int comNo) {
			if(userNo == comNo ) {
				System.out.println("비겼습니다.");
				draw++;
			}else if(userNo <comNo ) {
				if(userNo == 1 && comNo==3 ) {
					System.out.println("이겼습니다.");
					win++;
				}else {
					System.out.println("졌습니다.");
					lose++;
				}
			}else {
				if(comNo == 1 && userNo == 3) {
					System.out.println("졌습니다.");
					lose++;
				}else {
					System.out.println("이겼습니다.");
					win++;
				}

			}
			
			
		}
		
}
