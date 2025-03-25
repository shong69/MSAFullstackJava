package com.pm;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex06 extends Frame implements ItemListener{
//	Choice cho;
	List cho;
	public Ex06() {
		Panel p = new Panel();
//		cho = new Choice();
		//--------------------
//		cho = new List();
//		
//		cho.add("item1");
//		cho.add("item2");
//		cho.add("item3");
//		cho.add("item4");
		//----------------------------
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox box1 = new Checkbox("item1",false, cbg);
		Checkbox box2 = new Checkbox("item2",false,cbg);
		Checkbox box3 = new Checkbox("item3",false,cbg);
		
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		
		//----------------------------------
		
		
		
		
//		cho.addMouseListener(this);
//		cho.addItemListener(this);
		
		
		
//		p.add(cho);
		
		p.add(box1);
		p.add(box2);
		p.add(box3);
		add(p);
		setBounds(100,100,500,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
//		System.out.println(cho.getSelectedIndex()); //선택했을 때 나오는 인덱스
//		System.out.println(cho.getSelectedItem()); //선택했을 때 나오는 아이템
		
		
		Checkbox box = (Checkbox) e.getSource();
		System.out.println(box.getLabel()); //itemX
		System.out.println(box.getState()); //true/flase 알려줌
	}

	
}
