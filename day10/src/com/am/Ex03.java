package com.am;

public class Ex03 {
	public static void main(String[] args) {
		int a = 111;
		//autoBoxing
		Integer b = 222; //Ŭ���� Ÿ�� -wrapper Ŭ����
//		Integer c = new Integer(); -���� �߻� -> �⺻�����ڰ� ����
		Integer c = new Integer(333);
		//unBoxing
		Integer d = new Integer("+444"); //���ڷ� ������ش�. ���ڸ� ���� ���� ����.
		int e = new Integer("-5555");
		System.out.println(c.intValue() + 1); ///334 ���
		System.out.println(c+1); ///334 ���
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
	}
}
