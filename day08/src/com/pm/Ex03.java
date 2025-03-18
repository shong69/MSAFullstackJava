package com.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Ŭ������ ������ ���� ��ü
		Class ex03 = Ex03.class; //Ŭ���� ���� -> Ŭ������ ������ �ִ� ���

		Class clz;
		clz = Class.forName("com.pm.Ex03");  //Ŭ������ ������ ���� ���� ��
		
//		System.out.println(clz.newInstance());
//		
//		//Ex03 me = clz.newInstance(); //���� ���� Ŭ����(Ex03)�� ����Ÿ���� �𸣴ϱ� ������ -> Object Ÿ������ Ÿ�� ����
//		Object me = (Ex03)clz.newInstance(); //���ϴ� Ŭ������ ĳ�����ϱ�
//		
//		Ex22 me2;
//		me2= (Ex22)clz.newInstance();  //Ex22�� ���� ������ ������ �ֱ� ������ ������(���������ϱ�)
//	
		//----------------------------------------------

		Constructor[] constructs = ex03.getConstructors(); //Ŭ������ ���� �ִ� ������ ���� ȣ��
		for (int i = 0; i < constructs.length; i++) { 
			System.out.println(constructs[i]);
		}
		
		Field[] arr2 = ex03.getDeclaredFields(); //Ŭ������ ���� �ִ� �ʵ�� ���� ȣ��
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		Method[] arr3 = ex03.getDeclaredMethods(); //Ŭ������ ���� �ִ� �޼ҵ� ���� ȣ��
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	
	}
}
