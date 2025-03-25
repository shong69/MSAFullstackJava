package com.pm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex10 extends Frame implements MouseListener,ContainerListener{
	Panel p2;
	public Ex10() {
		Font f  = new Font("",0,50);
		setLayout(new BorderLayout());
		Panel p= new Panel();
		p2 = new Panel();
		p.setLayout(new FlowLayout());
		p2.setLayout(new FlowLayout());
		Image img1 = Toolkit.getDefaultToolkit().getImage("rock.jpg");
		Image img2 = Toolkit.getDefaultToolkit().getImage("paper.jpg");
		Image img3 = Toolkit.getDefaultToolkit().getImage("scissors.jpg");
		Label la = new Label("결과: ");
		la.setFont(f);
		
		Icon rock = new ImageIcon(img1);
		Icon paper = new ImageIcon(img2);
		Icon scissors = new ImageIcon(img3);
		
		
		JButton ro = new JButton("바위",rock);
		ro.setBounds(100,10,10,10);
		ro.setVisible(true);
		JButton pa = new JButton("보",paper);
		pa.setBounds(210,10,70,50);
		pa.setVisible(true);
		JButton sci = new JButton("가위",scissors);
		sci.setBounds(310,10,70,50);
		sci.setVisible(true);
		
		p2.addContainerListener(this);
		
		ro.addMouseListener(this);
		pa.addMouseListener(this);
		sci.addMouseListener(this);
		
		p.add(ro);
		p.add(pa);
		p.add(sci);
		p2.add(la);
		add(p,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		setBounds(100,100,1800,800);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		//가위바위보게임(ver 0.10.0)
		new Ex10();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(((JButton)e.getSource()).getActionCommand());
		//랜덤 숫자 꺼내서
		//결과 내놓기
		p2.add(new Label("승"));
		p2.add(new Label("패"));
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void componentAdded(ContainerEvent e) {
//		System.out.println("add");
		
	}
	@Override
	public void componentRemoved(ContainerEvent e) {
		System.out.println("remove");
		
	}
}
