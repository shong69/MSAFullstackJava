package com.am;

// �ܺ� Ŭ���� = ���뼺
class Outter02{
	static int su1=1111;
	int su2 =2222;
	
	//���� Ŭ���� = ���Ӽ�
	static class Inner02{
		static int su3 = 3333;
		int su4 = 4444;
		
		static void func03() {
			System.out.println("inner static method"); //���� ����ƽ
//			System.out.println(su1);
//			func01(); //outer method �׳� ȣ�� ������
//			Outter02 out1 = new Outter02();
//			System.out.println(out1.su2);
//			out1.func02();
		}
		
		void func04() {
			System.out.println("inner non-static method");// ���� ��-����ƽ
//			System.out.println(su1); //���� Ŭ�������� �ܺ� ������ Ŭ������ �����ϰ� ����
//			func01();
			
//			System.out.println(su2); //���� ��-����ƽ���� �ܺ� ��-����ƽ ������ ��ü �����ؾ� ����
//			Outter02 out1 =new Outter02();
//			System.out.println(out1.su2);
//			out1.func02();
			
		}
	}
	
	static void func01() {
		System.out.println("outter static method"); //�ܺ� ����ƽ
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		
//		Inner02 inn1 = new Inner02();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
	
	void func02() {
		System.out.println("outter non-static method"); //�ܺ� ��-����ƽ
//		System.out.println(Inner02.su3);
//		Inner02.func03();
//		Inner02 inn1 = new Inner02();
//		System.out.println(inn1.su4);
//		inn1.func04();
	}
}


public class Ex02 {
	public static void main(String[] args) {
		//inner static method
		System.out.println(Outter02.Inner02.su3); //���� static Ŭ������ static ���� ����
		
		//outer static method
		Outter02.Inner02.func03();//�ܺ�Ŭ������ static �޼��� ����
		
		//inner non-static method
		Outter02.Inner02 inn= new Outter02.Inner02();
		System.out.println(inn.su4);//���� static Ŭ������ ���� ����
		inn.func04(); //���� static Ŭ������ �޼��� ����
		
		
		
	}
}
