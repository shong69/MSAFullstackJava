package com.pm;

public class Ex04 {
	public static void func01() {

//		Class.forName("com.pm.Ex04��"); //RuntimeException�� ������� ����
		int a = 0; int b = 0;
		
		if(a==0 && b==0) {
			throw new RuntimeException(); 
		}
		int su = a/b;
		
	}
	public static void main(String[] args) {
		try{
			func01();
		}catch (ArithmeticException e) {
			System.out.println("���� �߻�");
		}
		
			
	}
}
