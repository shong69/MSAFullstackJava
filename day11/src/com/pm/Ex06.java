package com.pm;

public class Ex06 {
	public static void main(String[] args) {
		//로또 번호 생성기(ver 0.1.0)
		//1~45번 사이의 수 6개(중복 X)

		//-------------------------------------------------
		//내가 푼 코드
		
		//1. 6 칸 빈 배열 만들어서 뽑힌 수 넣고 중복 체크하기
		//2. 45칸 숫자 배열 만들어서 이 중 6개 뽑기(뽑은거 0으로 바꾸고)
		//3. Ball 객체에서 중복 없는 숫자 뽑는 메서드 만들기
		
		System.out.println("로또 번호 생성기(ver 0.1.0)");
		Ball ball = new Ball();
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = ball.getNum();
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	static int[] lotto = new int[6];

	public static class Ball{
		int num;
		public Ball() {
		}
		public int getNum() {
			int temp;
			do{
				temp = (int)(Math.random()*45)+1;
			}while(!check(temp));
			
			this.num = temp;
			return num;
		}
		
		public void setNum(int num) {
			this.num = num;
		}
		
		private boolean check(int temp) {
			for (int i = 0; i < lotto.length; i++) {
				if(lotto[i]==0) continue;
				else {
					if(temp == lotto[i]) {
						return false;
					}
				}
			}
			return true;
			
		}
		
	}
}
