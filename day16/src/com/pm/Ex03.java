package com.pm;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex03 extends Frame implements MouseMotionListener{
	public static void main(String[] args) {
		new Ex03();
	}
	public Ex03() {
		addMouseMotionListener(this);
		setBounds(100,100,500,400);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		System.out.println("¿Ãµø");
	}
}
