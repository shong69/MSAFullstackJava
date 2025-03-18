package com.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//gugudan();
		//alp();
		game();

	}
	
	/** - ���� 2���� while�� �ϳ��� Ǯ���
	 * NX1...9�ܱ��� �ϰ� N++; + �ٹٲ�
	 * N�� 9�� �Ǹ� �ݺ��� ���� 
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
			
			if(alpB == 10) { // ���� if������ alpB++�� �ϱ� ������ 9��° �ݺ��� �� �ٷ� 10�� �� -> alpB�� 10�϶� ����
				isTrue = false;
			}
			
			
		}
	}
	
	
	/** - while�� �ϳ��� ���� 3���� Ǯ��
	 * 3�� �ݺ�Ƚ���� ���� i, ��� ������ ���� j, ��°����� ���ϴ� count
	 * ��°��� j++�� �ؼ� count�� ������ count++, i++�ϰ� ������ �����ϵ���
	 */
	public static void alp() {
		
		char alp = 'A';
		int temp = 0;
//		int i;
//		for( i = 0;i<=3;i++) {
//			System.out.print((char)(alp++));
//			System.out.printf("  i�� %d  ",i);
//			System.out.printf("temp�� %d  ",temp);
//
//			if(temp == i) { 
//				i=0;
//				System.out.printf("i�� %d",i);
//				temp++;
//				System.out.println();
//				continue;
//			}
//			
//		}
		
		int i = 0; //�� ��
		int j = 0; //���� ��� ����
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
	
	
	/** ��, ��, �� ������ static ���� �޼��� �ۿ� ���� -> �޼��忡�� ���������� ����� �� �ֵ��� �Ѵ�.
	 * match1() : numCha()�� ȣ���� ���� ��ǻ���� ���� ����ϰ� match2() ȣ��
	 * numCha() : �Է��� ���� ����, ����, ���� ����
	 * match2() : ���� �̰���� ��ġ�ϰ� �º� ��� ���
	 */
	
	static int win = 0, lose = 0, draw = 0;
	public static void game() {
		String line = "---------------------------------------";
		System.out.println(line+"\n���� ���� �� ����(ver 0.1.0\n"+line);
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean on = true;
		while(on) {
			System.out.print("����(1), ����(2), ��(3), ����(0) >");
			
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.printf("���� �·�\n%d�� %d�� %d��\n�̿����ּż� �����մϴ�.", win, draw, lose);
				on = false;
			}else if(num == 1) {
				match1(1);
			}else if(num == 2) {
				match1(2);
			}else if(num == 3) {
				match1(3);
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
		
		/** ���� ��ǻ���� ���� ���
		 * @param num
		 */
		public static void match1(int num) {
			int comNo = (int)(Math.random()*3 + 1);
			String user = numCha(num);
			String com = numCha(comNo);
			System.out.printf("��� : %s\t��ǻ�� : %s\n",user, com);
			
			match2(num, comNo);
		}
	
		public static String numCha(int num) {
			String gamer = null;
			switch (num) {
			case 1:
				gamer = "����";
				break;
			case 2:
				gamer = "����";
				break;
				
			case 3:
				gamer = "��";
				break;
			default:
				break;

			}
			return gamer;
		
		}
		
		/** �º� ����� ���
		 * @param userNo
		 * @param comNo
		 */
		public static void match2(int userNo, int comNo) {
			if(userNo == comNo ) {
				System.out.println("�����ϴ�.");
				draw++;
			}else if(userNo <comNo ) {
				if(userNo == 1 && comNo==3 ) {
					System.out.println("�̰���ϴ�.");
					win++;
				}else {
					System.out.println("�����ϴ�.");
					lose++;
				}
			}else {
				if(comNo == 1 && userNo == 3) {
					System.out.println("�����ϴ�.");
					lose++;
				}else {
					System.out.println("�̰���ϴ�.");
					win++;
				}

			}
			
			
		}
		
}
