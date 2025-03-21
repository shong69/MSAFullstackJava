package com.pm;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //추상클래스라 객체 생성 X
		//운영체제에 요청해 날짜를 받아오는 방식
		System.out.println(cal.get(0)); //1
		System.out.println(cal.get(1)); //2025
		System.out.println(cal.get(2)); //2
		System.out.println(cal.get(3)); //12
		System.out.println(cal.get(4)); //4
		System.out.println(cal.get(5)); //21
		System.out.println(cal.get(6)); //80
		
		
		System.out.println(cal.get(Calendar.YEAR)+"년"); 
		//final YEAR = 1;임 -> 1을 넣어야 연도가 출력되도록 final값으로 마킹해둔 것 
		
		System.out.println(cal.get(Calendar.MONTH)+1 + "월"); //month는 1 적게 나온다
		System.out.println(cal.get(Calendar.DATE)+"일");  //DATE의 상수 값은 5임
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"일");  
		
//		
//		switch (cal.get(Calendar.MONTH)) {
//		case Calendar.JANUARY://0 
//			System.out.println("1월");
//			break;
//		case Calendar.FEBRUARY://1
//			System.out.println("2월");
//		break;
//		case Calendar.MARCH://2
//			System.out.println("3월");
//		break;
//		case Calendar.APRIL://3
//			System.out.println("4월");
//		break;
//
//
//		default:
//			break;
//		}
		
		//시, 분, 초
		System.out.println(cal.get(Calendar.HOUR)+"시"); //10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시"); //10
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)+"시"); //10
		System.out.println(cal.get(Calendar.AM_PM)==Calendar.AM); //false
		System.out.println(cal.get(Calendar.AM_PM)==Calendar.PM);  //true
		System.out.println(cal.get(Calendar.MINUTE)+"분"); //12
		System.out.println(cal.get(Calendar.SECOND)+"초"); //13
		
		System.out.println("______________________________________________________");
		
		System.out.println("365일 중 "+cal.get(Calendar.DAY_OF_YEAR)+"일"); //365일 중 80일
		System.out.println("일년중"+cal.get(Calendar.WEEK_OF_YEAR)+"째 주");
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH)+"주차");
		
		//요일
		System.out.println("========================================================");
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //주중의 무슨 요일(일요일부터 1로 시작)
		System.out.println(Calendar.FRIDAY); //6임
		
		
		
		//====================================================================
		
		//Calendar로 값 정해주기
		cal.set(Calendar.YEAR,2002);
		cal.set(Calendar.MONTH,4);//5월
		cal.set(Calendar.DAY_OF_MONTH,1);//첫째주차
		
		
		//=====================================================================
		//시간을 비교하기
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal.after(cal2)); //false
		System.out.println(cal.before(cal2)); //true 지났는지 확인
		
		System.out.println("=======================================================");
		
		
		long time1 = cal.getTimeInMillis(); 
		long time2 = System.currentTimeMillis();
	
		System.out.println(time1);// 1020232293755 시간이 밀리세컨으로 나옴
		System.out.println(time2);//  시간이 밀리세컨으로 나옴
		
		cal.setTimeInMillis(time2);  //Sets this Calendar's current time from the given long value.

	}
}
