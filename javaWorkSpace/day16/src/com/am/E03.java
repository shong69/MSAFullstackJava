package com.am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

public class E03 {
	public static void main(String[] args) {
		Frame f = new Frame();

		Canvas can = new Canvas() {
			//상속받기
			public void paint(Graphics g) { 
//				g.drawChars(new char[] {'A','B','C'}, 0, 1, 100, 100);//A,B,C그리기
				g.drawLine(0, 0, 200, 200); //선 그리기
				g.setColor(Color.RED);
				g.fillRect(0, 0, 200, 200); // 사각형
				g.drawOval(0, 0, 200, 200); //원
				g.setColor(Color.BLUE);
				g.fillArc(0, 0, 200, 200, 0, 180); //반원 비슷
				//fill... -> 위에서 지정한 색으로 채워줌
				
				//비트맵 방식 <-> 벡터 방식(자바에서 사용하는 방식. 각 픽셀마다 색 값을 가지고 있다. -> 시작점과 끝점의 위치를 알고 있다)
				//지나간 곳에 진짜 색을 칠해준다
			}
		};
		
		f.add(can);
		f.getIgnoreRepaint();//바뀐거 있으면 반영하라는 의미
		Dimension dim = new Dimension(400,300);
		f.setLocation(500,100); //창을 화면 중간에서 띄우기
		//가로, 세로를 리턴받아야 하는 경우 good
		f.setSize(dim);
		f.setVisible(true);
	}
}
