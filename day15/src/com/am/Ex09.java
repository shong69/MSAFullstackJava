package com.am;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Ex09 extends Frame{
	CardLayout mgr = new CardLayout();
	
	//패널 설정하기
	public Ex09() {
		setLayout(mgr);
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.GREEN);
		p3.setBackground(Color.blue);
		add(p1);
		add(p2);
		add(p3);
		
		
		
		setLocation(100,100);
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex09 me = new Ex09();
		me.mgr.next(me); //패널이 다음으로 넘어가며 색이 바뀌고 있다.
		me.mgr.next(me);
	}
}
