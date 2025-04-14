package com.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01 {
	public static void main(String[] args) {
		Frame f = new Frame();
		
		//This class is the abstract superclass of all actualimplementations 
		//of the Abstract Window Toolkit
		Toolkit kit=Toolkit.getDefaultToolkit();
		kit.beep(); //비프음을 들려줌 -> 하드웨어 제어를 해주는 OS에 요청한다
		
		Image img = kit.getImage("logo.jpg"); //이미지 받아와 아이콘 적용하기
		f.setIconImage(img);
		
		System.out.println(kit.getScreenSize()); //Dimension 객체로 리턴해준다
		
		int winW = kit.getScreenSize().width; //스크린 넓이
		int winH = kit.getScreenSize().height;
		
		
		Dimension dim = new Dimension(400,300);
		f.setLocation(winW/2-dim.width/2,winH/2-dim.height/2); //창을 화면 중간에서 띄우기
		//가로, 세로를 리턴받아야 하는 경우 good
		f.setSize(dim);
		f.setVisible(true);
	}
}
