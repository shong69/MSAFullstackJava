package com.pm;

import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();
//		java.util.LinkedList list = new java.util.LinkedList(); 두 list의 사용법은 동일함
		
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		list.set(2, "3번째");
		list.remove(3); 
		list.size();
		list.get(2); // Object로 리턴됨
		
		
		
	}
}
