package com.pm;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.util.Scanner;

public class Ex01 extends Frame{
	public Ex01() {
		Panel p = new Panel();
		
		TextField tf = new TextField("기본값",10); //매개변수로 입력창의 크기(글자수로) 지정
//		tf.setFont(new Font("",0,50)); //입력창의 폰트 지정하기
//		tf.setText("글자"); //기본 입력 문자 지정
//		System.out.println(tf.getText());
//		tf.setBackground(c); // 배경 색상 적용
//		tf.setForeground(Color.BLUE); //폰트 색상 적용
//		tf.setEchoChar('#'); //입력값이 #으로 반환됨
		
		
		//----------------
		p.add(tf);
		add(p);
		setLocation(100,100);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		Scanner sc = new Scanner(System.in);
//		me.tf.setText(sc.next());
	}
}
