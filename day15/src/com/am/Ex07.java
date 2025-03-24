package com.am;

import java.awt.Frame;

public class Ex07 {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("제목"); //상태창 제목
		
		f.setLocation(100,100);
		f.setSize(300,200);
		f.setCursor(Frame.HAND_CURSOR); //커서 모양 지정
		f.setVisible(true);
	}
}
