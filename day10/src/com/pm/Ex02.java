package com.pm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//�ֹι�ȣ üũ��(ver 0.9.0)
		//�ֹι�ȣ>000000-0000000
		//����� 00�� 0���Դϴ�
		
		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ üũ��(ver 0.9.0)");
		while(isTrue) {

			System.out.print("�ֹι�ȣ> ");
			String str = sc.next();
			
			String[] arr = str.trim().split("-");
			
			if(arr.length!= 2) continue;
			if(arr[0].length() != 6) continue;
			if(arr[1].length() != 7) continue;
			
			boolean[] arr2 = {false, false};
			for(int i = 0;i<arr.length;i++){
				char[] temp = arr[i].toCharArray();
				for(int j = 0;j<temp.length;j++){
					if(!Character.isDigit(temp[j])){
						arr2[i] = true;
					}
				}
			}
			if(arr2[0] || arr2[1]) continue; //�ֹι�ȣ �� �ڰ� ��� ���ڿ��� continue
			
			char gender = arr[1].charAt(0);
			
			int age =0;
			switch (gender) {
			case '1': 			
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d�� %c�Դϴ�.",age,'��');
				break;
			case '3':
				age = LocalDate.now().getYear()-(2000+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d�� %c�Դϴ�.",age,'��');
				break;
			case '2':
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d�� %c�Դϴ�.",age,'��');
				break;
			case '4':
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d�� %c�Դϴ�.",age,'��');
				break;
			default:
				break;
			}
		}
	}
}
