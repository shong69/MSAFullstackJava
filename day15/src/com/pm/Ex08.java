package com.pm;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

//다시 풀기~~ 기본정보 내가 푼 거
public class Ex08 extends Frame{
	public Ex08() {
		Font f = new Font("",0,10);
		BorderLayout mgr = new BorderLayout();
		setLayout(mgr);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		Panel p5 = new Panel();
		Panel p7 = new Panel();
		
		
		p1.setLayout(new BorderLayout());
		Label pName = new Label("이름");
		pName.setFont(f);
		p1.add(pName,BorderLayout.WEST);
		p1.add(new TextField(100), BorderLayout.CENTER);
		
		p2.setLayout(new BorderLayout());
		Label pId = new Label("아이디");
		pId.setFont(f);
		p2.add(pId,BorderLayout.WEST);
		p2.add(new TextField(), BorderLayout.CENTER);
//		
//		p3.setLayout(new GridLayout(1,2));
//		Label pPw = new Label("비밀번호");
//		pPw.setFont(f);
//		p3.add(pPw);
//		p3.add(new TextField());
//		
//		p4.setLayout(new GridLayout(1,2));
//		Label pPhone = new Label("전화번호");
//		pPhone.setFont(f);
//		p4.add(pPhone);
//		Panel numArea = new Panel(new GridLayout(1,5));
//		
//		Choice num1 = new Choice();
//		num1.add("010");
//		num1.add("011");
//		num1.add("012");
//		num1.add("013");
//		
//		Label dash1 = new Label("-");
//		
//		TextField num2 = new TextField();
//		
//		Label dash2 = new Label("-");
//		
//		TextField num3 = new TextField();
//		numArea.add(num1); //전화번호 첫번째 영역
//		numArea.add(dash1);
//		numArea.add(num2);
//		numArea.add(dash2);
//		numArea.add(num3);
//		p4.add(numArea);
//		
//		p5.setLayout(new GridLayout(1,2));
//		Label pCheck = new Label("취미");
//		p5.add(pCheck);
//		
//		Panel checkArea = new Panel(new GridLayout(1,3));
//		CheckboxGroup cbg = new CheckboxGroup();
//		Checkbox check1 = new Checkbox("독서",false, cbg);
//		Checkbox check2 = new Checkbox("운동",false, cbg);
//		Checkbox check3 = new Checkbox("숙면",false, cbg);
//		checkArea.add(check1);
//		checkArea.add(check2);
//		checkArea.add(check3);
//		p5.add(checkArea);
		
//		그냥 라벨만 넣어도 될 거 같음
//
//		Label pText = new Label("하고자 하는 일");
//
//		
//		p7.setLayout(new GridLayout(1,2));
//		p7.add(new TextArea()); //높이 지정하기
		
		
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.CENTER);
//		add(p3);
//		add(p4);
//		add(p5);
//		add(pText);
//		add(p7);
//		
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		gbc.gridheight = 50;
//		p1.setBackground(Color.red);
//		add(p1,gbc);

		setLocation(100,100);
		setSize(500,800);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
