package com.pm;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int age=0;
		char gender = '@';
		System.out.println("�ֹι�ȣ üũ��(ver 0.2.0)");
		Scanner sc = new Scanner(System.in);
		boolean boo = true;
		while(boo) {
			System.out.print("�ֹι�ȣ >");
			String input = sc.nextLine();
			String[] data = input.split("-");
			if(data.length == 2) {
				
				if(data[0].length()==6 && data[1].length()==7) {
					
					boolean boo2 = false;
					for(int j = 0;j<2;j++) {
						for (int i = 0; i < data[0].length()&& !boo2; i++) { //�������� �ݺ��� ��Ʈ��!
							char ch = data[0].charAt(i);
							if(ch<'0'||ch>'9') {
								boo2 = true;
							}
								
						}
					}
					if(!boo2) { //false��
						char ch7 = data[1].charAt(0);
						if(ch7%2 == '1'%2) gender = '��';
						if(ch7%2 == '2'%2) gender = '��';
						
						int year =1900+ (data[0].charAt(0)-'0')*10+(data[0].charAt(1)-'0');
						if(ch7>'2') year+= 100;
						age = 2025-year + 1;
						boo = false;
					}else {
						System.out.println("������ �߸��Ǿ����ϴ�.(000000-0000000)");
					}

				}else {
					System.out.println("������ �߸��Ǿ����ϴ�.(000000-0000000)");
				}
			}else {
				System.out.println("������ �߸��Ǿ����ϴ�.(000000-0000000)");
			}
			
		}
		System.out.println(age + "�� "+gender+"���Դϴ�.");
	}
}
