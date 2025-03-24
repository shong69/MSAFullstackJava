package com.pm;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.List;

public class Ex05 extends Frame{
	public Ex05() {
		Panel p =new Panel();
		List list = new List(4, true); //awt.List가 있음 (보이는 개수,다중선택 여부)
		list.add("item1");
		list.add("item2");
		list.add("item3");
		
		
		p.add(list);
		add(p);
		setLocation(100,100);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}
