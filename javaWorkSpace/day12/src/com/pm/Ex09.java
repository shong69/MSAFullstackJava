package com.pm;

import java.util.Enumeration;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		//Vector
		Vector list = new Vector();
		list.addElement("첫번째"); //매개변수가 Object인 메서드
		list.addElement("두번째");
		list.addElement("세번째");
		list.addElement("네번째");
		list.addElement("다섯번째");
		
//		System.out.println(list.elementAt(0)); //값 꺼내기 가능
//		System.out.println(list.elementAt(1));
//		System.out.println(list.elementAt(2));
//		System.out.println(list.elementAt(3));
		
		Enumeration enu = list.elements();
		
		while(enu.hasMoreElements()) {//다음 값이 있으면 true 반환
			System.out.println(enu.nextElement());
		}

	}
}
