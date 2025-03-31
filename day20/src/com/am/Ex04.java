package com.am;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;

//스크린 샷 한 이미지를 버튼에 추가해줌
public class Ex04 extends Frame{
	BufferedImage img;
	public Ex04() {
		try {
			Robot bot = new Robot();
			Rectangle screenRect = new Rectangle(0,0,800,600);
			img = bot.createScreenCapture(screenRect);
		}catch(AWTException e) {
			e.printStackTrace();
		}
		JButton btn = new JButton();
		btn.setIcon(new ImageIcon(img));
		add(btn);
		
		setBounds(100,100,500,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
		
		
	}
}
