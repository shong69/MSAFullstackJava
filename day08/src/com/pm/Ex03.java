package com.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//클래스의 정보를 갖는 객체
		Class ex03 = Ex03.class; //클래스 정보 -> 클래스를 가지고 있는 경우

		Class clz;
		clz = Class.forName("com.pm.Ex03");  //클래스를 가지고 있지 않을 때
		
//		System.out.println(clz.newInstance());
//		
//		//Ex03 me = clz.newInstance(); //내가 만든 클래스(Ex03)라 리턴타입을 모르니까 오류남 -> Object 타입으로 타입 지정
//		Object me = (Ex03)clz.newInstance(); //원하는 클래스로 캐스팅하기
//		
//		Ex22 me2;
//		me2= (Ex22)clz.newInstance();  //Ex22에 대한 정보를 가지고 있기 때문에 가능함(선언했으니까)
//	
		//----------------------------------------------

		Constructor[] constructs = ex03.getConstructors(); //클래스가 갖고 있는 생성자 전부 호출
		for (int i = 0; i < constructs.length; i++) { 
			System.out.println(constructs[i]);
		}
		
		Field[] arr2 = ex03.getDeclaredFields(); //클래스가 갖고 있는 필드들 전부 호출
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		Method[] arr3 = ex03.getDeclaredMethods(); //클래스가 갖고 있는 메소드 전부 호출
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	
	}
}
