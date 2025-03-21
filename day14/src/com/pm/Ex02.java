package com.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		cal = new GregorianCalendar(2002,4,1,1,2,3);//2002�� 5�� 1�� 1�� 2�� 3��
//		cal.add(Calendar.MONTH, 1);//Month�� 1�� ���� ���� ����� -> 5������ 6���� �ȴ�
		cal.add(Calendar.HOUR_OF_DAY, 23); //1�� + 23�� -> ���� �Ѿ�� �ȴ�.
		
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
