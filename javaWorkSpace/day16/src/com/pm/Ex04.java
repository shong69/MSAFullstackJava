package com.pm;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex04 extends Frame implements KeyListener{
	public Ex04() {
		setLayout(new FlowLayout());
		Label la = new Label("test");
		TextField tf = new TextField();
		Button btn = new Button();
		btn.addKeyListener(this); //KeyListener는 포커스가 가능한 컴포넌트에만 작용한다. -> Component, TextField ok/Label X
		add(la);
		add(btn);
		add(tf); 
		setBounds(100,100,500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex04();
	}
	/**
	 *누르는 순간은 지속될 수가 있음
	 */
	@Override
	public void keyTyped(KeyEvent e) { 
		//키보드가 눌렸을 때
		System.out.println(e.getKeyChar()); //어떤 Char인지		-> 문자인 경우 나온다 
		System.out.println(e.getKeyCode()); //Integer Key Code 반환 -> 0 나옴(잘못된 결과)
		TextField target = (TextField)e.getSource();
		System.out.println(target.getText()); //이전에 입력한 문자들이 나온다.
	}
	@Override
	public void keyPressed(KeyEvent e) {
		//키보드를 누르는 순간
		System.out.println(e.getKeyChar()); //어떤 Char인지		
		System.out.println(e.getKeyCode()); //Integer Key Code 반환
		TextField target = (TextField)e.getSource();
		System.out.println(target.getText()); //이전에 입력한 문자들이 나온다(하나씩 밀려서 나옴)
				
	}
	/**
	 *메서드의 제일 정확한 결과가 나옴
	 *하지만 눌렀다 때는 순간은 한번밖에 발생하지 않음
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		//키보드가 눌렸다가 땠을 때
		System.out.println(e.getKeyChar()); //어떤 Char인지(대문자인 경우 shift까지 인식됨)
		System.out.println(e.getKeyCode()); //소문자가 대문자로 인식돼서 나오고 있음
		TextField target = (TextField)e.getSource();
		System.out.println(target.getText()); //안밀리고 잘 나옴
		
	}
}
