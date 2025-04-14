package com.am;

import javax.swing.JFrame;

public class Ex07 extends JFrame{
	public Ex07() {
		
//		addWindowListener(new Ex06.MyListener());
		//swing에서 조건별로 on close시 동작을 만들어줌
//		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
//		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//0: 창 닫기 동작 X, 1: 창 닫기 시 Visible(false)만, 2: dispose됨, 3: exit
		this.setBounds(100,100,300,200);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
