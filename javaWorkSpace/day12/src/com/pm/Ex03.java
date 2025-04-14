package com.pm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		
		Collection list2 = new ArrayList();
		List list3 = new ArrayList(list); //부모타입으로 캐스팅한 뒤 ArrayList list를 복사
		
		ArrayList list4 = (ArrayList)list.clone(); //Object로 반환 된 것을 강제형변환해줌
		ArrayList list5 = new ArrayList();
		list5.addAll(list); //Collection을 매개변수로 받아 해당 Collection을 넣어준다.

		
//		list.set(2, 3000);
//		list5.removeAll(list); 
		 
//		List list6 = list5.subList(1, 3); //인덱스가 1부터 3까지만 포함된 list를 반환한다.
		List list6 = list5.subList(0, list5.size());
		
		Object[] list7 = list6.toArray();
//		int[] list8 = new int[list7.length]; //Object 배열을 int배열로 바꾸는 방법
//		for (int i = 0; i < list7.length; i++) {
//			list8[i] = (Integer)list7[i];
//		}
		
		for (int i = 0; i < list7.length; i++) {
			int obj = (Integer)list7[i];
			System.out.println(obj+1);
		}
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list5.get(i));
		}
		
		
		
	}
}
