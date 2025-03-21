package com.pm;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //�߻�Ŭ������ ��ü ���� X
		//�ü���� ��û�� ��¥�� �޾ƿ��� ���
		System.out.println(cal.get(0)); //1
		System.out.println(cal.get(1)); //2025
		System.out.println(cal.get(2)); //2
		System.out.println(cal.get(3)); //12
		System.out.println(cal.get(4)); //4
		System.out.println(cal.get(5)); //21
		System.out.println(cal.get(6)); //80
		
		
		System.out.println(cal.get(Calendar.YEAR)+"��"); 
		//final YEAR = 1;�� -> 1�� �־�� ������ ��µǵ��� final������ ��ŷ�ص� �� 
		
		System.out.println(cal.get(Calendar.MONTH)+1 + "��"); //month�� 1 ���� ���´�
		System.out.println(cal.get(Calendar.DATE)+"��");  //DATE�� ��� ���� 5��
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"��");  
		
//		
//		switch (cal.get(Calendar.MONTH)) {
//		case Calendar.JANUARY://0 
//			System.out.println("1��");
//			break;
//		case Calendar.FEBRUARY://1
//			System.out.println("2��");
//		break;
//		case Calendar.MARCH://2
//			System.out.println("3��");
//		break;
//		case Calendar.APRIL://3
//			System.out.println("4��");
//		break;
//
//
//		default:
//			break;
//		}
		
		//��, ��, ��
		System.out.println(cal.get(Calendar.HOUR)+"��"); //10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"��"); //10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"��"); //10
		System.out.println(cal.get(Calendar.AM_PM)==Calendar.AM); //false
		System.out.println(cal.get(Calendar.AM_PM)==Calendar.PM);  //true
		System.out.println(cal.get(Calendar.MINUTE)+"��"); //12
		System.out.println(cal.get(Calendar.SECOND)+"��"); //13
		
		System.out.println("______________________________________________________");
		
		System.out.println("365�� �� "+cal.get(Calendar.DAY_OF_YEAR)+"��"); //365�� �� 80��
		System.out.println("�ϳ���"+cal.get(Calendar.WEEK_OF_YEAR)+"° ��");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"����");
		
		//����
		System.out.println("========================================================");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //������ ���� ����(�Ͽ��Ϻ��� 1�� ����)
		System.out.println(Calendar.FRIDAY); //6��
		
		
		
		//====================================================================
		
		//Calendar�� �� �����ֱ�
		cal.set(Calendar.YEAR,2002);
		cal.set(Calendar.MONTH,4);//5��
		cal.set(Calendar.DAY_OF_MONTH,1);//ù°����
		
		
		//=====================================================================
		//�ð��� ���ϱ�
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal.after(cal2)); //false
		System.out.println(cal.before(cal2)); //true �������� Ȯ��
		
		System.out.println("=======================================================");
		
		
		long time1 = cal.getTimeInMillis(); 
		long time2 = System.currentTimeMillis();
	
		System.out.println(time1);// 1020232293755 �ð��� �и��������� ����
		System.out.println(time2);//  �ð��� �и��������� ����
		
		cal.setTimeInMillis(time2);  //Sets this Calendar's current time from the given long value.

	}
}
