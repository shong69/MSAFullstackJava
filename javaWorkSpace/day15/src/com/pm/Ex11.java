package com.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex11 {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new BorderLayout());
		f.add(new TextField(), BorderLayout.NORTH);
		
		String[][] role = {{"esc","*","/","<-"},{"7","8","9","-"},{"4","5","6","+"},
					{"1","2","3","="},{"0","."}};
		
		
		Panel center = new Panel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0; //위치
		gbc.gridy = 0;
		gbc.gridwidth = 1; //넓이
		gbc.gridheight = 1;
		gbc.weightx = 1.0; //가중치
		gbc.weighty = 1.0;
		
		for(int i = 0;i<role.length;i++) {
			gbc.gridy = i;
			for(int j = 0;j<role[i].length;j++) {
				if(i == 3 && j == 3) {
					gbc.gridheight = 2; //= 기호 두 칸 차지하도록
				}
				if(i == 4 && j == 0) {
					gbc.gridwidth = 2; //0 두 칸 차지하도록
				}
				if(i == 4 && j == 1) gbc.gridx = j+1; 
				else gbc.gridx = j;
				Button btn1 = new Button(role[i][j]);
				center.add(btn1, gbc);
				gbc.gridwidth = 1; //넓이
				gbc.gridheight = 1;
				gbc.weightx = 1.0; //가중치
				gbc.weighty = 1.0;
			}
		}
		
		
		
		f.add(center);

		f.setLocation(100,100);
		f.setSize(400,500);
		f.setVisible(true);
	}
}



















