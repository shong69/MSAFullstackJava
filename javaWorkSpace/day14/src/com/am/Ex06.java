package com.am;

import java.util.Comparator;
import java.util.Objects;

class Stu{
	int kor;
	int eng;
	public Stu(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
}
public class Ex06 {

	public static String func01() {
		return null;
	}
	
	public static void main(String[] args) {
		//Obejcts
		System.out.println(Objects.isNull(func01()));
		System.out.println(func01() == null);
		
		//Comparator 객체를 받아서 직접 비교하도록 코드 추가
		System.out.println(Objects.compare(new Stu(80,81), new Stu(90,91), 
				new Comparator<Stu>() {
					@Override
					public int compare(Stu o1, Stu o2) {
						return (o1.kor+o1.eng)-(o2.kor+o2.eng);
					}
		}));
	}
}
