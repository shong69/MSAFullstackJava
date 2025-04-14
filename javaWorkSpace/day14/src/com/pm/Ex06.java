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
		//100일 계산 프로그램
		//날짜를 입력받고 100일을 알려주는 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜를 입력해주세요(연/월/일을 -으로 구분하여)> ");
		String date = sc.nextLine();
		String[] dateArr = date.split("-"); //.은 안먹히니까 \\.으로 적으면 먹힘

		
//		GregorianCalendar cal = new GregorianCalendar(Integer.parseInt(dateArr[0]),
//				Integer.parseInt(dateArr[1]),Integer.parseInt(dateArr[2]));
//		
//		cal.add(Calendar.DATE, 100);
//		System.out.println(cal);
//		System.out.println(cal.get(GregorianCalendar.YEAR)+"년"
//				+(cal.get(GregorianCalendar.MONTH))+"월"+cal.get(GregorianCalendar.DATE)+"일 입니다.");
//		
		//---------------강사님 코드------------------------
		
		
		Date date2 = new Date(Integer.parseInt(dateArr[0])-1900, 
				Integer.parseInt(dateArr[1])-1,Integer.parseInt(dateArr[2]));
		date2 = new Date(date2.getTime()+100*24*60*60*1000L); //L로 long 타입임을 명시하기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		String msg = sdf.format(date2);
		System.out.println(msg);
		

		
	}
}
