package com.am;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

public class Ex08 {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		Font font = new Font("SanSerif",Font.ITALIC,50); //name, style, size - jvm이 가지고있는 유형을 적용 가능
		//다른 폰트를 적용하고 싶다면 IO를 통해서 폰트 파일을 넣어야 한다.
//		Color c = Color.CYAN; //방법1)클래스명.색상 으로 불러온다
		Color c = new Color(255,0,0); //방법2) 객체를 불러와 RGB로 색상을 직접 지정한다.
		
		Button btn1 = new Button("글자"); 
		btn1.setLabel("수정");
		btn1.setFont(font);
//		btn1.setBackground(c); 
//		btn1.setForeground(c); 글자색 지정
//		btn1.setSize(500,300); //배치 관리자가 있기 때문에 안먹힌다
//		btn1.setLocation(500,300);
		
		
		System.out.println(btn1.getLabel()); //"수정"
		f.add(btn1);
		
		
		f.setTitle("제목"); //상태창 제목
		
		f.setLocation(100,100);
		f.setSize(300,200);
		f.setCursor(Frame.HAND_CURSOR); //커서 모양 지정
		f.setVisible(true);
	}
}
