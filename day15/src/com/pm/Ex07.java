package com.pm;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex07 extends Frame{
	public Ex07() {
		Panel p =new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox box1 = new  Checkbox("item",false, cbg); //(내용, 기본 체크 표시 여부, 체크박스그룹)
		Checkbox box2 = new  Checkbox("item2",true, cbg);
		Checkbox box3 = new  Checkbox("item",true, cbg);
		
		p.add(box1);
		p.add(box2);
		p.add(box3);
		
		add(p);
		setLocation(100,100);
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
