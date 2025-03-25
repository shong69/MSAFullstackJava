package com.pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex11 extends JFrame{
	public Ex11() {
		setLayout(new BorderLayout());
		Panel center = new Panel();
		Panel down = new Panel(null); //Àý´ë ÁÂÇ¥
		down.setBackground(Color.GREEN);
		
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		btn1.setBounds(0,0,130,130);
		btn2.setBounds(130*1,0,130,130);
		btn3.setBounds(130*2,0,130,130);
		btn1.setVisible(true);
		btn2.setVisible(true);
		btn3.setVisible(true);
		
		down.add(btn1);
		down.add(btn2);
		down.add(btn3);
		
		
		
		add(center, BorderLayout.CENTER);
		add(down, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex11();
	}
}
