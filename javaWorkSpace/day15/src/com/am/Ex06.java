package com.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex06 extends Frame{
	public Ex06() {
		Panel p =new Panel();
		p.setLayout(null); //null -> 절대좌표 부여
		Button btn1 = new Button("btn1"); //위치와 크기를 지정해줘야 한다.
		btn1.setLocation(100,100);
		btn1.setSize(100,50);
		p.add(btn1);
		add(p);
		
		setLocation(100,100);
		setSize(400,300);
		setVisible(true);
		setResizable(false); //창 크기 조정 불가능하도록
		
		
		System.out.println(this.getWidth());//400
		System.out.println(p.getWidth());//384
		System.out.println(p.getHeight()-p.getHeight());//384	
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
