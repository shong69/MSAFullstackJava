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
		System.out.println("걸린 시간 : "+(after - before)+"ms");
		System.out.println("걸린 시간 : "+(after - before)/1000.0+"s"); 
		//양이 커질수록 LinkedList의 시간이 더 적게 걸린다.(작을땐 별 차이 없음)
		//
		
	}
	
	
}

