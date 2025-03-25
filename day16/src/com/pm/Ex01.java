package com.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex01 extends Frame {
	TextField tf; //MyListen에서 접근하도록 클래스 밖으로 뺌
	Panel p;
	Button btn;
	class MyListen implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
//			System.out.println("클릭");
//			tf.setText("");
//			tf.revalidate(); //유효성 재검사(값 안 사라진 경우)
			System.out.println(e.getSource()); //java.awt.TextField[textfi1eld0,148,5,45x23,text=초기값,editable,selection=2-2]
//			Frame me = (Frame) e.getSource();
//			me.dispose(); //자기 자신을 닫도록
			System.out.println(e.getX() + " "+ e.getY()); //17 9
			System.out.println(e.getXOnScreen() + " "+ e.getYOnScreen());//271 142 전체 화면에서의 위치
			System.out.println(e.getComponent()); //컴포넌트 정보를 되돌려줌
			
			if(btn == e.getSource())System.out.println("버튼");
			if(p == e.getSource())System.out.println("panel");
		}

		@Override
		public void mousePressed(MouseEvent e) {
//			System.out.println("누를 때");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
//			System.out.println("누르고 뗄 때"); //컴포넌트 밖으로 마우스 이동한 경우만
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
//			System.out.println("컴포넌트 안으로");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
//			System.out.println("컴포넌트 밖으로");
			
		}
		
	}
	public Ex01() {
		p = new Panel();
		tf = new TextField("초기값");		
		btn = new Button("click");
		
		p.add(tf);
		p.add(btn);
		
		p.addMouseListener(new MyListen());
		btn.addMouseListener(new MyListen());
		add(p);
		
		setBounds(100,100,400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
