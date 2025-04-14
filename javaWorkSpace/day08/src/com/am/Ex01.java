package com.am;
/*
 * public(접근제한자) class 클래스 이름{
 * 	public static int su1;
 *  public int su2;
 *  
 *  public 클래스이름() {}
 *  
 *  public static void main(Sting[] args){}
 * }
 * */
public class Ex01 {
	public static int su1 = 111;
	static int su2;
	private static int su3;
	
	
	public static void func01() {} //public : 어디서든
	static void func02() {} //default : 같은 패키지 내
	private static void func03() {} //private : 같은 클래스 내
	public static void main(String[] args) {
		//접근제한자
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
