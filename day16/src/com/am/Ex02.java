package com.am;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex02 {
	public static void main(String[] args) {
		//종료 버튼 선택 시 뜨는 알림 창 만들기(부모 창이 사라지면 함께 사라짐)
		Frame f = new Frame();		
		
		f.setLocation(100,100);
		//가로, 세로를 리턴받아야 하는 경우 good
		Dimension dim = new Dimension(400,300);
		f.setSize(dim);
		f.setVisible(true);
		
		Dialog dia1 =new Dialog(f); //부모의 창을 객체 생성시 넣어야 함
		dia1.setLocation(500,100);
		dia1.setSize(dim);
		dia1.setVisible(true);
		
		//파일탐색기 -> ui이기 때문에 진짜 기능을 당장 하지 못함
		FileDialog dia2 = new FileDialog(f,"열기",0);
		dia2.setLocation(100,500);
		dia2.setSize(dim);
		dia2.setVisible(true);
		System.out.println(dia2.getDirectory()); //파일 탐색기의 개체를 선택/작동해야 동작함
		System.out.println(dia2.getFile()); //동일

		//dia2를 처리해야 열린다
		//파일탐색기 -> 저장기능
		FileDialog dia3 = new FileDialog(f,"저장", 1); //(Frame parent, String title, int mode)
		dia3.setLocation(100,500);
		dia3.setSize(dim);
		dia3.setVisible(true);
		
	}
}
