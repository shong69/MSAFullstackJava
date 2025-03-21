package com.am;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex05 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		vec.addElement("1111");
		vec.addElement("2222");
		vec.addElement("3333");
		
		for (int i = 0; i < vec.size(); i++) {
			String msg = vec.elementAt(i);
			String msg2 = vec.get(i);
			System.out.println(msg);
		}
		
		Enumeration<String> enu = vec.elements();
		while(enu.hasMoreElements()) {
			String msg = enu.nextElement();
			System.out.println(msg);
		}
		
		Iterator<String> ite = vec.iterator();
		while(ite.hasNext()) {
			String msg = ite.next();
			System.out.println(msg);
		}
		
		List list = vec.subList(0, 2); //list로 변환 가능함
		System.out.println(list);
		
		
//		String[] arr = vec.toArray(new String[] {}); //문자열 배열로 변환 가능함 
		Object[] arr = vec.toArray();
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		System.out.println(Arrays.toString(arr3));
		
		
		
		String[] arr2 = vec.<String>toArray(new String[] {}); //제네릭을 부여하면서 문자열 배열로 변환
		System.out.println(Arrays.toString(arr2));
		
	}
}
