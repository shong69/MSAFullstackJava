package com.pm;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ex02 implements MouseListener{
	static JLabel la = new JLabel("*");
	
	public static void main(String[] args) {
      	Image img =Toolkit.getDefaultToolkit().getImage("logo.jpg");
      	Icon icon = new ImageIcon(img);
		la.setIcon(icon);
		la.setVisible(true);
		Frame f = new Frame();
		f.addMouseListener(new Ex02());
		
		
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		la.setLocation(e.getX(), e.getY()); //이동하도록
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		la.setSize(50,50);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		la.setLocation(e.getX(), e.getY()); //이동하도록
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
