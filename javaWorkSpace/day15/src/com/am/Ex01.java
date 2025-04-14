package com.am;

import javax.swing.JFrame;

public class Ex01 extends javax.swing.JFrame{
	public static void main(String[] args) {
//		## java.awt.*
//
//		- 자바 초기 gui
//		- OS 종속적이다.
//		- 자바가 직접 하지 않음
//		- OS 지원외 한계
//
//		## swing
//
//		- awt의 한계를 극복하기 위해 생겨남
//		- OS에 비종속적 → 자바가 직접 제작해준다.
//		- OS 지원외의 기능도 직접 구현
//		Ex01 me = new Ex01();
//		java.awt.Frame me = new Frame();
		javax.swing.JFrame me = new JFrame(); //창을 끈다고 실제로 꺼지지 X
		me.setVisible(true); //run하면 창 노출됨
		
		
		
		
	}
}
