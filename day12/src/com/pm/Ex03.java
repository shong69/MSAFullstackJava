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
		List list3 = new ArrayList(list); //�θ�Ÿ������ ĳ������ �� ArrayList list�� ����
		
		ArrayList list4 = (ArrayList)list.clone(); //Object�� ��ȯ �� ���� ��������ȯ����
		ArrayList list5 = new ArrayList();
		list5.addAll(list); //Collection�� �Ű������� �޾� �ش� Collection�� �־��ش�.

		
//		list.set(2, 3000);
//		list5.removeAll(list); 
		 
//		List list6 = list5.subList(1, 3); //�ε����� 1���� 3������ ���Ե� list�� ��ȯ�Ѵ�.
		List list6 = list5.subList(0, list5.size());
		
		Object[] list7 = list6.toArray();
//		int[] list8 = new int[list7.length]; //Object �迭�� int�迭�� �ٲٴ� ���
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
