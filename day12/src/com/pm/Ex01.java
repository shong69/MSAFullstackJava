package com.pm;
import java.util.ArrayList;
import java.util.LinkedList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		LinkedList list2 = new LinkedList();
		
		
		for (int i = 0; i < 100000; i++) {
			list2.add("item"+i);
		}
		long before = System.currentTimeMillis();
		String msg = "";
		for (int i = 0; i < 100000; i++) {
			 msg += list2.get(i).toString();
		}
		long after = System.currentTimeMillis();
		System.out.println("�ɸ� �ð� : "+(after - before)+"ms");
		System.out.println("�ɸ� �ð� : "+(after - before)/1000.0+"s"); 
		//���� Ŀ������ LinkedList�� �ð��� �� ���� �ɸ���.(������ �� ���� ����)
		//
		
	}
	
	
}

