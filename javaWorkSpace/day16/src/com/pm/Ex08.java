package com.pm;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex08 extends Frame implements TextListener {
	public Ex08() {
		Panel p = new Panel();
		TextField tf = new TextField();
		TextArea ta = new TextArea();
		
		ta.addTextListener(this);
//		tf.addTextListener(this);
		
//		p.add(tf);
		p.add(ta);
		add(p);
		setBounds(100,100,500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void textValueChanged(TextEvent e) { 
//		System.out.println(((TextField)e.getSource()).getText());
		System.out.println(((TextArea)e.getSource()).getText());
		
		
	}
}
