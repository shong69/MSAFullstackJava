package com.pm;

import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		
		Date d1= new Date(System.currentTimeMillis()+1*10000*60*60);
		System.out.println(d1);
		System.out.println(d1.getYear()+1900); //1900을 더해야 현재 날짜가 나온다
		System.out.println(d1.getMonth());
		System.out.println(d1.getDate());
		System.out.println(d1.getDay()); //요일이 0~6으로 나온다(일요일이 0)
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		
		//시간을 밀리세컨으로
		System.out.println(d1.getTime());
		System.out.println(System.currentTimeMillis());
	}
}
