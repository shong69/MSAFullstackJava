package com.pm;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex05 extends Frame implements KeyListener{
	JLabel la;
	public Ex05() {
		setLayout(null);//절대좌표
		
		Image img = Toolkit.getDefaultToolkit().getImage("logo.jpg");
		Icon icon = new ImageIcon(img);
		la = new JLabel(icon);
		la.setBounds(10,10,70,50);
		la.setVisible(true);
		
		this.addKeyListener(this);
		add(la);
		setBounds(100,100,500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		Point point = la.getLocation();
		int x = point.x;
		int y = point.y;
		if(e.getKeyCode()==39 && x+10<this.getWidth()-70) { //창을 벗어나지 않도록 제한
			x+= 10;
			la.setLocation(x,y); //키보드 클릭 시 이동하도록
		}else if(e.getKeyCode()==37 && x-10>=0) {
			x-=10;
			la.setLocation(x,y);
		}else if(e.getKeyCode()==38 && y-10>=0+30) {
			y -= 10;
			la.setLocation(x,y);
		}else if(e.getKeyCode()==40 && y+10<=this.getHeight()-50) {
			y += 10;
			la.setLocation(x,y);
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
