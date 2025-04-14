package com.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex03 extends Frame{
	public Ex03() {
		BorderLayout mgr = new BorderLayout();
		setLayout(mgr);
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		Button btn1 = new Button("North");
		Button btn2 = new Button("South");
		Button btn3 = new Button("East");
//		Button btn4 = new Button("West");
		Button btn5 = new Button("Center");
		add(btn1,BorderLayout.NORTH); //상수로 지정해주기(문자라 오타날수있음)
		
		
		p1.setLayout(new GridLayout(1,3));
		p1.add(btn1);
		p2.setLayout(new FlowLayout());
		p2.add(btn2);
		p3.add(btn3);
		p4.add(btn5);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
//		add(btn2,BorderLayout.SOUTH);
//		add(btn3, BorderLayout.EAST);
//		add(btn4,BorderLayout.WEST);
//		add(btn5,BorderLayout.CENTER);
		
		setLocation(100,100);
		setSize(500,400);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		Ex03 me = new Ex03();
	}
}
