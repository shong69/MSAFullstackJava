package com.am;
/*
 * public(����������) class Ŭ���� �̸�{
 * 	public static int su1;
 *  public int su2;
 *  
 *  public Ŭ�����̸�() {}
 *  
 *  public static void main(Sting[] args){}
 * }
 * */
public class Ex01 {
	public static int su1 = 111;
	static int su2;
	private static int su3;
	
	
	public static void func01() {} //public : ��𼭵�
	static void func02() {} //default : ���� ��Ű�� ��
	private static void func03() {} //private : ���� Ŭ���� ��
	public static void main(String[] args) {
		//����������
		//public > default > private
		
		com.am.Ex01.func01();
		com.am.Ex01.func02();
		com.am.Ex01.func03();
		System.out.println(com.am.Ex01.su1);
		System.out.println(com.am.Ex01.su2);
		System.out.println(com.am.Ex01.su3);
		
		Ex06 ex06 = Ex06.obj;
		System.out.println(ex06.obj);
		Ex06 ex062 = Ex06.obj;
		System.out.println(ex06== ex062);

	}
}
