package com.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 extends Frame implements Runnable, ActionListener{
	static Label la;
	static Thread thr;
	
	public Ex10() {
		setLayout(new BorderLayout());
		la = new Label();
		la.setFont(new Font(Font.MONOSPACED,Font.BOLD,45));
		la.setAlignment(Label.CENTER);//가운데 정렬
		Panel p = new Panel();
		Button btn = new Button("start");
		Button btn2 = new Button("suspend");
		Button btn3 = new Button("resume");
		Button btn4 = new Button("stop");
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		p.add(btn);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		
		add(p,BorderLayout.SOUTH);
		add(la, BorderLayout.CENTER);
		setBounds(100,100,300,300);
		setVisible(true);

	}
	//ui제어를 위해 밖에서 클래스를 만들어 시간을 표시해준다.
	public void loop() {
		Date d = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("hh:mm:ss");
		String text = sdf.format(d);
//		la.setText(text);
	}
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		thr= new Thread(me); //Ex10인 me 객체가 Thread객체를 가지고 수행하도록 함
		
		//스레드를 감시하도록 한다.
		while(true) {
			la.setText(thr.getState()+""); //스레드의 상태를 문자열로 바꾸고 Label에 추가
			try {
				Thread.sleep(500); //0.5초마다 갱신하도록(IO부담을 줄이기 위해)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Runnable을 상속하여 시간이 흐르는 기능 구현
	@Override
	public void run() {
		while(true) {
			la.setText(thr.getState()+"");
			loop();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = e.getActionCommand();
		if(msg.equals("start")) {
//			thr = new Thread(this); //새로운 객체를 주입하여 다시 start해도 새로 실행 되도록
			thr.start();
			((Button)e.getSource()).setEnabled(false); //한번 start하면 다시 사용 못하도록
			this.revalidate();
		}
		if(msg.equals("suspend")) {
			thr.suspend();
		}
		if(msg.equals("resume")) {
			thr.resume();
		}
		if(msg.equals("stop")) {
			thr.stop();
		}
	}
}
