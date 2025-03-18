package com.pm;

public class Ex06 {
	public static void main(String[] args) {
		//�ζ� ��ȣ ������(ver 0.1.0)
		//1~45�� ������ �� 6��(�ߺ� X)

		//-------------------------------------------------
		//���� Ǭ �ڵ�
		
		//1. 6 ĭ �� �迭 ���� ���� �� �ְ� �ߺ� üũ�ϱ�
		//2. 45ĭ ���� �迭 ���� �� �� 6�� �̱�(������ 0���� �ٲٰ�)
		//3. Ball ��ü���� �ߺ� ���� ���� �̴� �޼��� �����
		
		System.out.println("�ζ� ��ȣ ������(ver 0.1.0)");
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
