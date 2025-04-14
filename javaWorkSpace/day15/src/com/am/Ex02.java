package com.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;


public class Ex02 extends Frame {
	public Ex02() {
		//배치 관리자 생성 
		//A flow layout arranges components in a directional flow, muchlike lines of text in a paragraph.
//		FlowLayout
//		- 가로로는 중앙 배치
//		- 세로로는 위부터 배치
//		- 옆으로 정렬, 만일 불가시 다음줄로 넘어감
//		java.awt.FlowLayout layout = new FlowLayout();
		
//		GridLayout : 행 먼저 채우다가 주어진 행 개수를 넘어가면 열이 늘어난다
//		자리 확보 우선순위 : 1arg > 2arg -> 세로가 우선이다.(컴포넌트 배치 순서는 가로순임)
//		- 배치 배열을 넘치는 경우 열의 개수가 늘어난다.
//		- 1 arg - 세로열의 개수
//		- 2 arg - 가로행
		GridLayout layout = new GridLayout(2,2);
		this.setLayout(layout);
		
		java.awt.Button btn1 = new Button("Button01"); //awt 버튼 객체 생성
		this.add(btn1); 
		java.awt.Button btn2 = new Button("Button02"); //awt 버튼 객체 생성
		this.add(btn2); 
		
		java.awt.Button btn3 = new Button("Button02"); //awt 버튼 객체 생성
		this.add(btn3); 
		
		java.awt.Button btn4 = new Button("Button02"); //awt 버튼 객체 생성
		this.add(btn4); 
		
//		java.awt.Button btn5 = new Button("Button02"); //awt 버튼 객체 생성
//		this.add(btn5); 
//		
//		java.awt.Button btn6 = new Button("Button02"); //awt 버튼 객체 생성
//		this.add(btn2); 
		
		
		
		this.setSize(400, 300); //창 크기 (px단위)
		this.setLocation(500, 300);//창 로드 위치(px단위)
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
		
	}
}
