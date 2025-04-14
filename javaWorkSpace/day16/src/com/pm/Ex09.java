package com.pm;
import java.awt.Button;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09 extends Frame implements ActionListener{
	
	public Ex09() {
		Panel p = new Panel();
		TextField tf = new TextField();
		Button btn = new Button();
		List list  = new List();
		//버튼을 클릭했는지 확인
		list.addActionListener(this);
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		
		p.add(list); //리스트 중 개체를 선택하고 enter 쳐야 action이다
		p.add(tf); //키를 누르는 경우 X, enter을 쳐야 값을 가져가는 거라 action임
		p.add(btn);
		
		add(p);
		setBounds(100,100,500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex09();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand()); //tf의 경우 입력한 값을, btn의 경우 버튼의 text 값을 반환
		
	}
}
