package com.pm;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex03 extends Frame{
	public Ex03() {
		Panel p = new Panel();
		TextArea ta = new TextArea("초기값\ndefault",5,20,TextArea.SCROLLBARS_BOTH); //초기값,row, column,스크롤바여부
		p.add(ta);
		add(p);
		
		setSize(500,400);
		setLocation(100,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
