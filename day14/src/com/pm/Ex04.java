package com.pm;


import java.text.DateFormat;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString()); //Fri Mar 21 15:40:34 KST 2025
		//�ѱ� �������� �ٲٱ� toLocaleString() 
		System.out.println(d.toLocaleString()); //2025. 3. 21 ���� 3:40:34

		
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT);
		String msg = df.format(d);
		System.out.println(msg); 
		//�Ű����� X)2025. 3. 21 / 0)2025�� 3�� 21�� �ݿ��� / 1)2025�� 3�� 21�� (��)
		// 2)2025. 3. 21 / 3)25. 3. 21 -> ����ε� ���� ������ ���صξ���.
	}
}
