package com.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JLabel;

public class Ex02 {
	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		Label la = new Label("abc");
		TextField tf = new TextField(10);
		Button btn = new Button("찾기");
		JLabel la2 = new JLabel("abscds");  //swing에서 제공하는 라벨 객체 -> 이미지 제공 가능
				
		
		p.add(la2);
		p.add(tf);
		p.add(btn);
		
		
		f.add(p);
		f.setLocation(100,100);
		f.setSize(300,300);
		f.setVisible(true);
	}
}
