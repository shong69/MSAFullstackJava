package com.pm;

public class Ex10 {

//	public static void main(String[] args) {
//		int su1 =1111; //�������� su1�� �����
//		System.out.println("main su1 = "+su1);
//		
//		func01(su1);
//		System.out.println("main su1 = "+su1);
//	}
//	
//	public static void func01(int su1) {
//		su1++;
//		System.out.println("func01 su1 = "+su1);
//	}

////	��� ��� :
////	main su1 = 1111
////	func01 su1 = 1112
////	main su1 = 1111
	
	
//	public static int su1 = 1111;  //��������  su1�� ���
//	public static void main(String[] args) {
//		System.out.println("main su1 = "+su1);
//		
//		func01(su1);
//		System.out.println("main su1 = "+su1);
//	}
//	
//	/**
//	 * @param su1
//	 * �Ű������� ���� ���� su1�� func01������ ������ ����Ŭ�� ����
//	 * -> main �Լ����� su1�� ȣ������ �� ���� ������ �ʴ´�.
//	 */
//	public static void func01(int su1) { 
//		su1++;
//		System.out.println("func01 su1 = "+su1);
//	}
//	��� ��� :
//		main su1 = 1111
//		func01 su1 = 1112
//		main su1 = 1111
	
	
	//* non-static�� ���
	public int su1 = 1111;  //��������  su1�� ���
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		System.out.println("main su1 = "+me.su1);
		
		me.func01();
		
		Ex10 me2 = new Ex10(); //��ü�� ���� �����س� 
		System.out.println("main me2 su1 = "+me2.su1); //���ο� ��ü ���
		System.out.println("main me2 su1 = "+me.su1); //���� ��ü�� ���  
	}
	
	public void func01() { 
		su1++;
		System.out.println("func01 su1 = "+su1);		
	}
//	��� ���:
//		main su1 = 1111
//		func01 su1 = 1112
//		main su1 = 1112

}
