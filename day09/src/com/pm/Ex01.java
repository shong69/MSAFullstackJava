package com.pm;

public class Ex01 {
	public static void main(String[] args) {
//		System.out.println(); //System : Ŭ����, out : ��ü ��������, println : �޼���
//		java.io.PrintStream myOut = System.out; //out�� ��ü�� io.PrintStream�� ��ü
//		myOut.println(); //PrintStream�� �޼���
		
		char[] arr1 = new char[]{'a','b','c'};
		char[] arr2 = new char[3];
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
//		System.console().printf("aaaa", new Object[] {});  //a \nb \nc ���
		//sts ���� �ܼ��� ��¥ �ܼ��� �ƴ϶� cmd �ֿܼ��� ���� �� Ȯ�� ����
		
		
		long beforeTime = System.currentTimeMillis();
		long afterTime = System.currentTimeMillis();
		System.out.println(afterTime - beforeTime);
		
		long beforeNano = System.nanoTime();
		// �ڵ� ����..
		long afterNano = System.nanoTime();
		System.out.println(afterNano - beforeNano);
		
		
		System.out.println("����");
		//System.exit(0); //�Ű����� ���� �ƹ� ��� ����.
		
		
		System.gc(); //�������÷��� �۵�
		
		System.out.println("a"+System.lineSeparator()+"b");
		
		
		System.out.println(System.getenv());//ȯ�溯���� ����� �ý��� ȯ�� ������ �˷���
	}
}
