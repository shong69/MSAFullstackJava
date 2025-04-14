package com.am;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;

public class Ex05 extends Frame{

	public Ex05() {
		MenuBar bar = new MenuBar();
		Menu mn1  = new Menu("파일");
		Menu mn2  = new Menu("보기");
		MenuItem mi1 = new MenuItem("새 파일"); 
		MenuItem mi2 = new MenuItem("열기"); 
		MenuItem mi3 = new MenuItem("저장"); 
		MenuItem mi4 = new MenuItem("다른 이름으로 저장"); 
		MenuItem mi5 = new MenuItem("종료"); 
		
		MenuItem mi6 = new MenuItem("프로그램 소개");
		
//		FileDialog open = new FileDialog(this,"열기",0);
//		FileDialog save = new FileDialog(this,"저장",1);
//		FileDialog saveOtherName = new FileDialog(this,"다른 이름으로 저장",1);
//		open.setLocation(100, 100);
//		open.setSize(200, 100);
//		open.setVisible(true);
//		save.setLocation(100, 100);
//		save.setSize(200, 100);
//		save.setVisible(true);
		
		
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator();
		mn1.add(mi3);
		mn1.add(mi4);
		mn1.addSeparator();
		mn1.add(mi5);
		mn2.add(mi6);
		bar.add(mn1);
		bar.add(mn2);
		this.setMenuBar(bar);
		//입력 가능한 전체 창
		Font f = new Font("", 0, 20);
		TextField tf= new TextField();
		tf.setFont(f);
		add(tf);
		Dimension dim = new Dimension(500,800);
		setLocation(100,100);
		setSize(dim);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
