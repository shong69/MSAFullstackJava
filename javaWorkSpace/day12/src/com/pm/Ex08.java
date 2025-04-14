package com.pm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add("네번째");
		list.add("다섯번째");
		list.add("첫번째");
		System.out.println("list size:"+ list.size());
		
		//순서가 없는 자료구조는 어떻게 꺼내야 할까?
		//Iterator 사용
		Set set1 = new HashSet();
		Set set2 = new HashSet(list);
		
		set1.addAll(list);
		System.out.println("set size:"+set1.size()); //중복 허용 X -> 5 출력됨
		System.out.println(set1.equals(set2)); //값이 같은지 동등성 비교가 가능하다(Object를 받아서 값비교)
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			Object obj = ite.next();
			System.out.println(obj);
		}
		
	}
}
