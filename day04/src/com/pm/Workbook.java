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
				System.out.print("��");
			}
			System.out.println();
			
		}
	}
	
	public static void star2() {
		int cnt = 0, limit =1;
		
		for(int i = 0;i<10;i++) {
			cnt++;
			if(cnt<limit) {
				System.out.print("��");
			}else if(cnt == limit) {
				System.out.println("��");
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
			///cnt -iȸ��ŭ ��ĭ �ݺ��ϰ� ���ĺ�
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
		System.out.println("msa������\n"+line);
		System.out.print(String.format("%-10s %7s %5s %7s\n%s\n", "��ǰ", "�ܰ�","����","�ݾ�",line) );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "�����깰", "1000","1","1000") );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "�ڰ�ġ", "1200","2","2400") );
		System.out.print(String.format("%-10s %7s %5s %7s\n", "����", "500","3","1500") );

		
		
	}
	static int win = 0;
	static int lose=0;
	static int draw =0;
	public static void game() {
		Scanner sc = new Scanner(System.in);
		
		String line= "---------------------------------";
		System.out.println(line);
		System.out.println("���� ���� �� ����(ver 0.1.0)");
		
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.print("����(1), ����(2), ��(3), ����(0)>");
			int num = sc.nextInt();
			switch (num) {
			case 0:
				System.out.printf("�����·�\n%d �� %d �� %d ��\n�̿����ּż� �����մϴ�.",win,draw,lose);
				isTrue = false; 
				break;
			case 1:
				System.out.println("���: ����");
				play(1);
				break;
			case 2:
				System.out.println("���: ����");
				play(2);
				break;
			case 3:
				System.out.println("���: ��");
				play(3);
			default:
				break;
			}
			
			
		}

	}
	//0.1 0.5 0.9
	public static void play(int i) {
	
		int num = (int)(Math.random()*3 )+1;//���� ����
		if(i>num) {
			win++;
			System.out.println(num);
			System.out.println("�̰���ϴ�."); 
		}else if(i==num) {
			draw++;
			System.out.println(num);
			System.out.println("�����ϴ�."); 
		}else if(i<num) {
			lose++;
			System.out.println(num);
			System.out.println("�����ϴ�."); 
		}



	}
	
}
