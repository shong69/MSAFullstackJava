package com.pm;

public class Ex08 {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		int[] note = new int[6];
		for(int i = 0;i<lotto.length;i++) {
			lotto[i] = i+1;
		}
		//배열에 있는 숫자들을 섞기 : 0번째와 랜덤한 번째의 수를 서로 바꾼다
		for(int i = 0;i<1000;i++) {
			int ran =(int)(Math.random()*45);
			int temp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = temp;
		}

		for (int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
		
		//note 배열에 오름차순으로 값 넣기 -> 정렬 알고리즘
		System.arraycopy(lotto, 0, note, 0, 6);
		for (int i = 0; i < note.length-1; i++) { //끝에는 outBoundIndex..에러 뜨니까 -1해줌
			for (int j = i+1; j < note.length; j++) {
				if(note[i]>note[j]) {
					int temp = note[i];
					note[i] = note[j];
					note[j] = temp;
				}
			}
		}
	}
}
