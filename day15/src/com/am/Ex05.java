package com.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex05 extends Frame{
	public Ex05() {
		
		GridBagLayout mgr = new GridBagLayout();
		setLayout(mgr);
		
		Button btn1 = new Button("btn01");
		Button btn2 = new Button("btn02");
		Button btn3 = new Button("btn03");
		Button btn4 = new Button("btn04");
		Button btn5 = new Button("btn05");
		Button btn6 = new Button("btn06");
		Button btn7 = new Button("btn07");
		
		//specifies constraintsfor components that are laid out using the GridBagLayout class.
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH; //요소가 화면을 채우는 옵션
		gbc.gridx = 0; //x,y 좌표설정
		gbc.gridy = 0;
		gbc.gridwidth = 1; //cell 크기 지정
		gbc.gridheight = 1;
		gbc.weightx =1.0; 
		//가중치 : 화면을 늘리거나 줄일 때 요소들이 변하는 방법
		//		(x,y가 얼마나더 늘어날지 가중치를 정해줌) -> 증감 시 증감 비율 
		
		add(btn1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		add(btn2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		add(btn3, gbc);
		gbc.gridwidth = 1;
		gbc.gridx = 3;
		gbc.gridy = 0;
		add(btn4, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		add(btn5, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(btn6, gbc);
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		add(btn7, gbc);

		
		
		setLocation(100,100);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
