package com.pm;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ex12 extends Frame{
	public Ex12() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0; //원래 가중치는 xy 총 합해서 1이어야 함
		gbc.weighty = 1.0;
		
		for(int i = 0;i<9;i++) {
			gbc.gridx = i;
			add(new Label(),gbc);			
		}
		gbc.gridx = 0;
		gbc.gridy=1;
		add(new Label("이름"),gbc);
		gbc.gridx=1;
		gbc.gridwidth =8; //나머지 칸 다 차지하도록
		add(new TextField());
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth =1;
		add(new Label("아이디"),gbc);
		gbc.gridx=1;
		gbc.gridwidth =8; //입력창이 나머지 칸 다 차지하도록
		add(new TextField());


		gbc.gridy=3;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("비밀번호"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=8;
		add(new TextField(),gbc);
		
		gbc.gridy=4;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("전화번호"),gbc);
		gbc.gridx=1;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		gbc.gridx=3;
		gbc.gridwidth=1;
		add(new Label("-"),gbc);
		gbc.gridx=4;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		gbc.gridx=6;
		gbc.gridwidth=1;
		add(new Label("-"),gbc);
		gbc.gridx=7;
		gbc.gridwidth=2;
		add(new TextField(),gbc);
		
		gbc.gridy=5;
		gbc.gridx=0;
		gbc.gridwidth=1;
		add(new Label("취미"),gbc);
		
		
		setSize(500,300);
		setLocation(100,100);
		setVisible(true);
	 }
	public static void main(String[] args) {
		new Ex12();
	}
}
