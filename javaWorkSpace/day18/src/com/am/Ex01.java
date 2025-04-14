package com.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 extends Frame implements ActionListener{
	public Ex01() {
		Button btn = new Button("Your namne?");
		btn.addActionListener(this);
		add(btn);
		setBounds(100,100,500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01();
		//쓰레드
		System.out.println(Thread.currentThread().getName());	//main
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(Thread.currentThread().getName()); 
		//버튼을 눌렀을 때 Thread의 이름 : AWT-EventQueue-0 -> main과 다른 스레드를 사용하고 있다

	}
}
