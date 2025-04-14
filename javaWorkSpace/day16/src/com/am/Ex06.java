package com.am;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex06 extends Frame{
	static Ex06 me; //필드로 선언해 접근 가능하도록
	static Dialog dia; 
	static class MyListener implements WindowListener{
		
		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("창 열림");
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("창 닫기 버튼 누름");	
//			dia.setVisible(true); //창 닫으면 dia가 뜨도록
			
//			me.setVisible(false); //화면에서 안보이도록
//			System.exit(0); //자바 동작 끝내버림 -main이 return되기 전에 자바를 꺼버리는 것이기 때문에 비추
			me.dispose(); //UI 종료 요청 -> closed를 호출하며 종료한다.
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("UI 종료시 후행작업"); // UI가 꺼져도 작동한다는 의미		
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("아이콘화-창 최소화");		
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("비아이콘화-창 열림");		
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			//창이 활성화 상태일때(포커스가 창에 있음)
			System.out.println("활성화");		
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			//창 외의 다른 영역 선택 시 비활성화 됨
			System.out.println("비활성화");		
		}
		
	}
	
	public Ex06() {
		
		//이벤트 달기
		WindowListener listener = new MyListener(); //상속받은 내 클래스로 만들기
		//Adds the specified window listener to receive window events 
		//from this window.If l is null, no exception is thrown and no action is performed. 
		addWindowListener(listener);
		
		
		setBounds(100,100,300,200);
		setVisible(true);
		
		dia = new Dialog(this);
		dia.addWindowListener(listener); //Dialog에 윈도우 리스너 적용해줌
		dia.setBounds(600,500,200,200);
//		dia.setVisible(true);
	}
	
	public static void main(String[] args) {
		me = new Ex06();
		System.out.println("main return됨- 멀티쓰레드 : 동시작업이 가능함");
	}
}
