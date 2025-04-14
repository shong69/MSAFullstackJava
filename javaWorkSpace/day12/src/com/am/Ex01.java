package com.am;
class Ball{
	final int num;
	static int cnt = 1;
	boolean boo; //뽑았던 공인지 확인
	public Ball() {
		//공을 뽑을 때마다 번호가 자동으로 부여되도록
		num = cnt++;
		boo = false;
	}
	public void check() { //뽑은 공이면 true가 된다.
		boo = true;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Ball[] box = new Ball[45];
		int[] note = new int[6];
		for (int i = 0; i < 45; i++) {
			box[i]=new Ball();
		}
		for(int i = 0;i<6;i++) {
			int ran = (int)(Math.random()*box.length);
			Ball ball = box[ran];
			int num = ball.num;
			if(ball.boo) {
				i--;
			}else {
				ball.check();
				note[i] = num;
			}
		}
		for (int i = 0; i < note.length; i++) {
			System.out.println(note[i]);
		}
	}
}
