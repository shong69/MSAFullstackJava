package com.pm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add("�׹�°");
		list.add("�ټ���°");
		list.add("ù��°");
		System.out.println("list size:"+ list.size());
		
		//������ ���� �ڷᱸ���� ��� ������ �ұ�?
		//Iterator ���
		Set set1 = new HashSet();
		Set set2 = new HashSet(list);
		
		set1.addAll(list);
		System.out.println("set size:"+set1.size()); //�ߺ� ��� X -> 5 ��µ�
		System.out.println(set1.equals(set2)); //���� ������ ��� �񱳰� �����ϴ�(Object�� �޾Ƽ� ����)
		
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			Object obj = ite.next();
			System.out.println(obj);
		}
		
	}
}
