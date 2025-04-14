package com.pm;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex07 extends Frame  implements ComponentListener, FocusListener, ContainerListener{
	static Ex07 me;
	public Ex07() {
		setLayout(new FlowLayout());
		
		//모든 ui는 component의 안에 있기 때문에 영향을 받는다
		Label la = new Label("test");
		Button btn = new Button("add");
		
		this.addContainerListener(this);
//		this.addFocusListener(this);
//		this.addComponentListener(this);
		
		btn.addMouseListener(new MouseListener() { //재정의
			
			@Override
			public void mouseReleased(MouseEvent e) {
				me.add(new Button("추가")); //containerListener을 통해 frame에 버튼을 추가하고 있음
				me.revalidate();
				me.repaint();
			}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		add(la);
		add(btn);
		setBounds(100,100,500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("componentResized");
		
	}
	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("componentMoved");
	}
	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("componentShown");
	}
	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("componentHidden");
		
	}
	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("focuseIn");
	}
	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("focusOut");
	}
	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("add");
		
	}
	@Override
	public void componentRemoved(ContainerEvent e) {
		System.out.println("remove");
		
	}
}
