package com.am;

public class Ex06 {
	public static void main(String[] args) throws ClassNotFoundException {
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.equals(obj2)); //false
		Object obj3 =obj;
		System.out.println(obj.equals(obj3)); //true
		
		
		Class clz = obj.getClass();
		Ex06 me = new Ex06();
		Class clz2 = me.getClass();
		Class clz3 = Ex06.class;
		Class clz4 = Class.forName("com.am.Ex06");
		
		
		System.out.println(obj); //java.lang.Object@2a139a55
		System.out.println(obj.hashCode()); //705927765 -> obj 출력 값을 10진수로 표현한 것
		System.out.println(obj.toString()); //java.lang.Object@2a139a55
	}
}
