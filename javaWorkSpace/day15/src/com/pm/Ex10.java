package com.pm;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex10 extends Frame{
	public Ex10() {
		//방법1. 영역을 둘로 나누고 아래는 top, 나머지/위는 차례대로 쌓도록 한다.
		setLayout(new GridLayout(2,1)); //반으로 나누기
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.orange);
		p2.setLayout(new BorderLayout());
		
		
		p2.add(new Label("내용"),BorderLayout.NORTH);
		p2.add(new TextArea(), BorderLayout.CENTER);
		
		//---------------------
		p1.setLayout(new GridLayout(5,1)); //행,열
		
		FlowLayout fl = new FlowLayout();
		fl.setAlignment(FlowLayout.LEFT);// 왼쪽으로 붙이기
		
		Panel row1 = new Panel();
		Label la1 = new Label("이름");
		row1.add(la1);
		row1.add(new TextField(20));
		p1.add(row1);
		Panel row2 = new Panel();
		row2.add(new Label("아이디"));
		row2.add(new TextField(20));
		p1.add(row2);
		Panel row3 = new Panel();
		row3.add(new Label("비밀번호"));
		row3.add(new TextField(20));
		p1.add(row3);
		Panel row4 = new Panel();
		row4.add(new Label("전화번호"));
		row4.add(new TextField(6));
		row4.add(new Label("-"));
		row4.add(new TextField(6));
		row4.add(new Label("-"));
		row4.add(new TextField(6));
		p1.add(row4);
		Panel row5 = new Panel();
		row5.add(new Label("취미"));
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox check1 = new Checkbox("독서",false, cbg);
		Checkbox check2 = new Checkbox("운동",false, cbg);
		Checkbox check3 = new Checkbox("숙면",false, cbg);
		row5.add(check1);
		row5.add(check2);
		row5.add(check3);
		p1.add(row5);
		
		
		
		add(p1);
		add(p2);
		setLocation(100,100);
		setSize(500,1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex10();
	}
}
