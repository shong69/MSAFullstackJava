package com.pm;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//100�� ��� ���α׷�
		//��¥�� �Է¹ް� 100���� �˷��ִ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥�� �Է����ּ���(��/��/���� -���� �����Ͽ�)> ");
		String date = sc.nextLine();
		String[] dateArr = date.split("-"); //.�� �ȸ����ϱ� \\.���� ������ ����

		
//		GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(dateArr[0]),
//				Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[2]));
//		
//		cal.add(Calendar.DATE, 100);
//		System.out.println(cal);
//		System.out.println(cal.get(GregorianCalendar.YEAR)+"��"
//				+(cal.get(GregorianCalendar.MONTH))+"��"+cal.get(GregorianCalendar.DATE)+"�� �Դϴ�.");
//		
		//---------------����� �ڵ�------------------------
		
		
		Date date2 = new Date(Integer.parseInt(dateArr[0])-1900, 
				Integer.parseInt(dateArr[1])-1,Integer.parseInt(dateArr[2]));
		date2 = new Date(date2.getTime()+100*24*60*60*1000L); //L�� long Ÿ������ ����ϱ�
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		String msg = sdf.format(date2);
		System.out.println(msg);
		

		
	}
}
