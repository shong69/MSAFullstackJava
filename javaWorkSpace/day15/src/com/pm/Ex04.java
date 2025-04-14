package com.pm;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;

public class Ex04 extends Frame{
	public Ex04() {
		Panel p = new Panel();
		
		Choice list = new Choice();
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		
		//기본 선택값 지정
//		list.select(2);
		list.select("item3"); //직접 개체 입력도 가능함
		
		p.add(list);
		add(p);
		setLocation(100,100);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}

