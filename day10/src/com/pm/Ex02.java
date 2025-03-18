package com.pm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//주민번호 체크기(ver 0.9.0)
		//주민번호>000000-0000000
		//당신은 00세 0성입니다
		
		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 체크기(ver 0.9.0)");
		while(isTrue) {

			System.out.print("주민번호> ");
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
			if(arr2[0] || arr2[1]) continue; //주민번호 앞 뒤가 모두 숫자여야 continue
			
			char gender = arr[1].charAt(0);
			
			int age =0;
			switch (gender) {
			case '1': 			
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d세 %c입니다.",age,'남');
				break;
			case '3':
				age = LocalDate.now().getYear()-(2000+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d세 %c입니다.",age,'남');
				break;
			case '2':
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d세 %c입니다.",age,'여');
				break;
			case '4':
				age = LocalDate.now().getYear()-(1900+(arr[0].charAt(0)-'0')*10 + arr[0].charAt(1)-'0'+1);
				System.out.printf("%d세 %c입니다.",age,'여');
				break;
			default:
				break;
			}
		}
	}
}
