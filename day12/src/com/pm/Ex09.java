package com.pm;

import java.util.Enumeration;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		//Vector
		Vector list = new Vector();
		list.addElement("ù��°"); //�Ű������� Object�� �޼���
		list.addElement("�ι�°");
		list.addElement("����°");
		list.addElement("�׹�°");
		list.addElement("�ټ���°");
		
//		System.out.println(list.elementAt(0)); //�� ������ ����
//		System.out.println(list.elementAt(1));
//		System.out.println(list.elementAt(2));
//		System.out.println(list.elementAt(3));
		
		Enumeration enu = list.elements();
		
		while(enu.hasMoreElements()) {//���� ���� ������ true ��ȯ
			System.out.println(enu.nextElement());
		}

	}
}
