package com.am;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ex04 extends Frame{
	public Ex04() {
		MenuBar bar = new MenuBar();
		Menu mn1 = new Menu("첫번째"); //메뉴 추가
		MenuItem mi1 = new MenuItem("1번째"); //메뉴 아이템 추가
		MenuItem mi2 = new MenuItem("2번째");
		
		Menu mi3 = new Menu("3번째");//하위 메뉴로 추가
		CheckboxMenuItem mi4 = new CheckboxMenuItem("하위메뉴의 1번째");
		mn1.add(mi1);
		mn1.add(mi2);
		mn1.addSeparator(); //세그먼트 삽입
		mn1.add(mi3);
		
		mi3.add(mi4);
		bar.add(mn1);
		
		this.setMenuBar(bar);
		setBounds(100,100,500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
