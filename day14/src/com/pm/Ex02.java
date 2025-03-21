package com.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		cal = new GregorianCalendar(2002,4,1,1,2,3);//2002년 5월 1일 1시 2분 3초
//		cal.add(Calendar.MONTH, 1);//Month에 1을 더한 값이 저장됨 -> 5월에서 6월이 된다
		cal.add(Calendar.HOUR_OF_DAY, 23); //1시 + 23시 -> 날이 넘어가게 된다.
		
		System.out.println("YEAR: " + cal.get(GregorianCalendar.YEAR));
		System.out.println("MONTH: " + cal.get(GregorianCalendar.MONTH)+1);
		System.out.println("WEEK_OF_YEAR: " + cal.get(GregorianCalendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + cal.get(GregorianCalendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + cal.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_YEAR: " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_WEEK: " + cal.get(Calendar.DAY_OF_WEEK));
	}
}
